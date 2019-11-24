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
 * @author fikri
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
                user.add(new User(rs.getString("id_user"), rs.getInt("no_telp"), rs.getString("username"), rs.getString("nama"), rs.getString("email"), rs.getString("password")));
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
  
}
