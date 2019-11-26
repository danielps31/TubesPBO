/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Daniel
 */
public class Koneksi {

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<User> user = new ArrayList<>();
    private ArrayList<Admin> admin = new ArrayList<>();
    private ArrayList<Peristiwa> peristiwa = new ArrayList<>();
    private ArrayList<Bantuan> bantuan = new ArrayList<>();
    
    
    
    public Koneksi() {
        loadUser();
        loadAdmin();
        loadPeristiwa();
        loadBantuan();
    }

    public void connect() {
        try {
            String url = "jdbc:mysql://localhost/bencana";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            System.out.println("MASUK");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean manipulate(String query) {
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) {
                cek = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }

    public void loadUser() {
        connect();
        try {
            String query = "SELECT * FROM user";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.add(new User(rs.getString("id_user"), rs.getString("no_telp"), rs.getString("username"), rs.getString("nama"), rs.getString("email"), rs.getString("password")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public void loadAdmin() {
        connect();
        try {
            String query = "SELECT * FROM admin";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                admin.add(new Admin(rs.getString("id_admin"), rs.getString("username"), rs.getString("nama"), rs.getString("email"), rs.getString("password")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
        public void loadPeristiwa() {
        connect();
        try {
            String query = "SELECT * FROM peristiwa";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                peristiwa.add(new Peristiwa(rs.getString("id_peristiwa"), rs.getString("jenis_bencana"), rs.getString("jam"), rs.getString("lokasi_bencana"), rs.getString("keterangan_bencana")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
       public void loadBantuan() {
        connect();
        try {
            String query = "SELECT * FROM bantuan";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                bantuan.add(new Bantuan(rs.getString("id_bantuan"), rs.getString("jenis_bantuan"), rs.getString("tanggal_pengiriman"), rs.getString("keterangan_bantuan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
        
        
        
    public boolean cekUserLogin(String q, String p) {
        boolean cek = false;
        for (User u : user) {
            if (u.getUsername().equals(q) && u.getPassword().equals(p)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public String cariId_user(String u) {
        String id = null;
        for (User usr : user) {
            if (usr.getUsername().equals(u)) {
                id = usr.getId_user();
            }
        }
        return id;
    }

    public boolean cekDuplikasiUsername(String q) {
        boolean cek = false;
        for (User u : user) {
            if (u.getUsername().equals(q)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public boolean addUser(User m) {
        boolean isValid = true;

        connect();
        String query = "INSERT INTO user"
                + "(`username`, `no_telp`, `nama`, `email`, `password`, `id_user`) "
                + " VALUES (";
        query += "'" + m.getUsername() + "',";
        query += "'" + m.getNo_telp() + "',";
        query += "'" + m.getNama() + "',";
        query += "'" + m.getEmail() + "',";
        query += "'" + m.getPassword() + "',";
        query += "NULL";
        query += ")";
        if (manipulate(query)) {
            int id = loadUserId(m.getUsername());
            if(id == -1) m.setId_user(""+id);
            else m.setId_user(null);
            user.add(m);
        }else{
            isValid = false;
        }
        disconnect();
        
        return isValid;
    }
        public boolean addPeristiwa(Peristiwa p) {
        boolean isValid = true;

        connect();
        String query = "INSERT INTO peristiwa"
                + "(`jenis_bencana`, `jam`, `lokasi_bencana`, `keterangan_bencana`, `id_peristiwa`) "
                + " VALUES (";
        query += "'" + p.getJenis_bencana() + "',";
        query += "'" + p.getJam() + "',";
        query += "'" + p.getLokasi() + "',";
        query += "'" + p.getKeterangan_peristiwa() + "',";
        query += "NULL";
        query += ")";
        if (manipulate(query)) {
            int id = loadPeristiwaId(p.getId_peristiwa());
            if(id == -1) p.setId_peristiwa(""+id);
            else p.setId_peristiwa(null);
            peristiwa.add(p);
        }else{
            isValid = false;
        }
        disconnect();
        
        return isValid;
    }
        public boolean addBantuan(Bantuan b) {
        boolean isValid = true;

        connect();
        String query = "INSERT INTO bantuan"
                + "(`jenis_bantuan`, `tanggal_pengiriman`, `keterangan_bantuan`, `id_bantuan` "
                + ") VALUES (";
        query += "'" + b.getJenis_bantuan() + "',";
        query += "'" + b.getTanggal_bantuan() + "',";
        query += "'" + b.getKeterangan_bantuan() + "',";
        query += "NULL";
        query += ")";
        if (manipulate(query)) {
            int id = loadBantuanId(b.getId_bantuan());
            if(id == -1) b.setId_bantuan(""+id);
            else b.setId_bantuan(null);
            bantuan.add(b);
        }else{
            isValid = false;
        }
        disconnect();
        
        return isValid;
    }
        
        
    public ArrayList<Peristiwa> getPeristiwa() {
        return peristiwa;
    }
    
      public ArrayList<Bantuan> getBantuan() {
        return bantuan;
    }
    
    
//        public void addPeristiwa(Peristiwa m) {
//        connect();
//        String query = "INSERT INTO peristiwa VALUES (";
//        query += "'" + m.getJenis_bencana() + "',";
//        query += "'" + m.getJam() + "',";
//        query += "'" + m.getLokasi() + "',";
//        query += "'" + m.getKeterangan_peristiwa() + "'";
//        query += ")";
//        if (manipulate(query)) peristiwa.add(m);
//        disconnect();
// }
    
    public int loadUserId(String username) {
        int id = -1;
        connect();
        try {
            String query = "SELECT * FROM user where username = '"+username+"'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt("id_user");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
        
        return id;
    }
    
        public int loadPeristiwaId(String id_peristiwa) {
        int id = -1;
        connect();
        try {
            String query = "SELECT * FROM peristiwa";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt("id_peristiwa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
        
        return id;
    }
        public int loadBantuanId(String id_bantuan) {
        int id = -1;
        connect();
        try {
            String query = "SELECT * FROM bantuan";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt("id_bantuan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
        
        return id;
    }    

    public boolean cekAdminLogin(String q, String p) {
        boolean cek = false;
        for (Admin a : admin) {
            if (a.getUsername().equals(q) && a.getPassword().equals(p)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public String cariId_Admin(String u) {
        String id = null;
        for (Admin adm : admin) {
            if (adm.getUsername().equals(u)) {
                id = adm.getId_admin();
            }
        }
        return id;
    }

}
