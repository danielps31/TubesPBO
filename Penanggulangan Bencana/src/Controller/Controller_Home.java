/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.view_homepage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Shamgar
 */
public class Controller_Home implements ActionListener{

    private view_homepage home;
   

    public Controller_Home() {
        home = new view_homepage();
        home.addActionListener(this);
        System.out.println("MASUK LOGIN AWAL");
        home.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(home.getLogin())){
            new Controller_loginUser();
            home.setVisible(false);
        } else if (source.equals(home.getbtnDaftar())){
            new Controller_Registrasi();
            home.setVisible(false);
        }
    }


}
