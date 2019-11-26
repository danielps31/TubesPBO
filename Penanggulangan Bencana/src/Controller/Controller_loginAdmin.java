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
    
    private LoginAdmin view;
    private Koneksi kn;
    private String idAdmin;
    private String username;
    private String password;
    
    public Controller_loginAdmin(){
        kn = new Koneksi();
        view = new LoginAdmin();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getbtnMasuk())){
            btnMasukActionPerformed();
        }else if(source.equals(view.getbtnLoginUser())){
            btnLoginUserActionPerformed();
        }
    }
    
    public void btnMasukActionPerformed(){
        username = view.getTfUsername();
        password = view.getTfPassword();
        String nama;
        if(username.isEmpty() || password.isEmpty()){
            view.showMessage("Masukkan Username dan Password", "Error", 0);
        }else{
            if(kn.cekAdminLogin(username, password)){
                idAdmin = kn.cariId_Admin(username);
                System.out.println(idAdmin);
                view.showMessage("Selamat Datang ", "Login Berhasil",1);
                new Controller_HomeAfterLoginAdmin(username);
                view.setVisible(false);
            } else {
                view.showMessage("Username Atau Password Salah", "Login Failed", 2);
            }
        }
    }   
    
    public void btnLoginUserActionPerformed(){
       new Controller_loginUser();
       view.setVisible(false);
    }

}
