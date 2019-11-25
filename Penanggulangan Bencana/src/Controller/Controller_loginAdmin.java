/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fikri
 */
public class Controller_loginAdmin implements ActionListener {
    
    private LoginUser view;
    private Koneksi kn;
    private String idUser;
    private String username;
    private String password;
    
    public Controller_loginAdmin(){
        kn = new Koneksi();
        view = new LoginUser();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getbtnMasuk())){
            btnLoginActionPerformed();
//        } else if(source.equals(view.getbtnDaftar())){
//            btnDaftarActionPerformed();
        }
    }
    
    public void btnLoginActionPerformed(){
        username = view.getTfUsername();
        password = view.getTfPassword();
        String nama;
        if(username.isEmpty() || password.isEmpty()){
            view.showMessage("Masukkan Username dan Password", "Error", 0);
        }else{
            if(kn.cekUserLogin(username, password)){
                idUser = kn.cariId_user(username);
                System.out.println(idUser);
                view.showMessage("Selamat Datang ", "Login Berhasil",1);
                HomeAfterLogin home = new HomeAfterLogin();
                home.setUsername(username);
                view.setVisible(false);
                home.setVisible(true);
            } else {
                view.showMessage("Username Atau Password Salah", "Login Failed", 2);
            }
        }
    }   
    

}
