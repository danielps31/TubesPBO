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
 * @author shamgar
 * 
 */
public class Koneksi {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<User> user = new ArrayList<>();

    public Koneksi() {
        loadUser();
    }
    
    public void connect(){
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
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
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
            while (rs.next()){
                user.add(new User( rs.getString("username"), rs.getString("no_telp"), rs.getString("nama"), rs.getString("email"), rs.getString("password"),rs.getString("id_user")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public boolean cekUserLogin(String q, String p){
        boolean cek = false;
        for (User u : user) {
            if (u.getUsername().equals(q) && u.getPassword().equals(p)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    public String cariId_user(String u){
        String id = null;
        for(User usr : user){
            if (usr.getUsername().equals(u)) {
                id = usr.getId_user();
            }
        } return id;
    } 
    
        public boolean cekDuplikasiUsername(String q){
        boolean cek = false;
        for (User u : user) {
            if (u.getUsername().equals(q) ){
                cek = true;
                break;
            }
        }
        return cek;
    }
        
        public void addUser(User m) {
        connect();
        String query = "INSERT INTO User VALUES (";
        query += "'" + m.getUsername() + "',";
        query += "'" + m.getNo_telp() + "',";
        query += "'" + m.getNama() + "'";
        query += "'" + m.getEmail() + "'";
        query += "'" + m.getPassword() + "'";
        query += "'" + m.getId_user() + "',";
        query += ")";
        if (manipulate(query)){ User.add(m);
        }disconnect();
    }
     
}

   
