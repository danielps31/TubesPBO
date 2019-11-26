/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.UserLapor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Shamgar
 */
public class Controller_UserLapor implements ActionListener{

    private UserLapor lapor;
    private String username;

    public Controller_UserLapor(String username) {
        lapor = new UserLapor();
        lapor.addActionListener(this);
        lapor.setVisible(true);
        this.username = username;
        lapor.setUsername(username);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lapor.setUsername(username);        
        Object source = e.getSource();
        if (source.equals(lapor.getbtnHome())){
             btnHomeActionPerformed();
        } else if(source.equals(lapor.getbtnBantu())){
            btnBantuActionPerformed();
        }
    }

    public void btnHomeActionPerformed(){
        new Controller_HomeAfterLogin(username);
        lapor.setVisible(false);
}
    public void btnBantuActionPerformed(){
        new Controller_BantuSesama(username);
        lapor.setVisible(false);
    }

}
