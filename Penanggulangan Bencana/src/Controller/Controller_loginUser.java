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
public class Controller_loginUser implements ActionListener {
    
    private LoginUser view;
    private Koneksi kn;
    private String idUser;
    private String username;
    private String password;
    
    public Controller_loginUser(){
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
        } else if(source.equals(view.getbtnLoginAdmin())){
            btnLoginAdminActionPerformed();
        } else if(source.equals(view.getbtnDaftar())){
            btnDaftarActionPerformed();
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
                 new Controller_HomeAfterLogin(username);
                view.setVisible(false);
            } else {
                view.showMessage("Username Atau Password Salah", "Login Failed", 2);
            }
        }
    }   

    private void btnLoginAdminActionPerformed() {
        new Controller_loginAdmin();
        view.setVisible(false);

    }

    private void btnDaftarActionPerformed() {
        new Controller_Registrasi();
        view.setVisible(false);

    }
    }
    

