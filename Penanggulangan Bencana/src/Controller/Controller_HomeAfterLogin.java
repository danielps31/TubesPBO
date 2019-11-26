/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HomeAfterLogin;
import View.view_homepage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Shamgar
 */
public class Controller_HomeAfterLogin implements ActionListener{

    private HomeAfterLogin home;
    private String username;
     
    public Controller_HomeAfterLogin(String username) {
        home = new HomeAfterLogin();
        home.addActionListener(this);
        home.setVisible(true);
        this.username = username;
        home.setUsername(username);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        home.setUsername(username);
        Object source = e.getSource();
        if (source.equals(home.getbtnLaporkan())){
            new Controller_Registrasi();
            home.setVisible(false);
        } else if (source.equals(home.getbtnBantu())){
            new Controller_Registrasi();
            home.setVisible(false);
        }
    }


}
