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
<<<<<<< HEAD
 * @author shamgar
 * 
=======
 * @author Daniel
>>>>>>> 12d3d873a60154d57b4562fcef2a89e9df808f2f
 */
public class Koneksi {

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<User> user = new ArrayList<>();
    private ArrayList<Admin> admin = new ArrayList<>();
    private ArrayList<Peristiwa> peristiwa = new ArrayList<>();

    public Koneksi() {
        loadUser();
        loadAdmin();
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
