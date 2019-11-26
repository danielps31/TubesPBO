/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Shamgar
 */
public class User extends PERSON{

    private String id_user;
    private String no_telp;

    public User(String id_user, String no_telp, String username, String Nama, String email, String password) {
        super(username, Nama, email, password);
        this.id_user = id_user;
        this.no_telp = no_telp;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
    
    
}
