/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HomeAfterLoginAdmin;
import View.view_homepage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Shamgar
 */
public class Controller_HomeAfterLoginAdmin implements ActionListener{

    private HomeAfterLoginAdmin home;
    private String username;
     
    public Controller_HomeAfterLoginAdmin(String username) {
        home = new HomeAfterLoginAdmin();
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
            btnLaporkanActionPerformed();
            home.setVisible(false);
        } else if (source.equals(home.getbtnBantu())){
            btnBantuActionPerformed();
            home.setVisible(false);
        }
    }
    
        private void btnLaporkanActionPerformed() {
        new Controller_AdminLapor(username);
        home.setVisible(false);
    }

       private void btnBantuActionPerformed(){
       new Controller_BantuSesamaAdmin(username);
       home.setVisible(false);
       }
}
