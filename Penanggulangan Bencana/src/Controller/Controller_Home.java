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

/**
 *
 * @author Shamgar
 */
public class Controller_Home extends MouseAdapter {

    private view_homepage home;

    public Controller_Home() {
        home = new view_homepage();
        home.addMouseAdapter(this);
        home.setVisible(true);
    }

    public void mousePressed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(home.getLogin())) {
            new Controller_login();
            home.setVisible(false);
        }
    }


}
