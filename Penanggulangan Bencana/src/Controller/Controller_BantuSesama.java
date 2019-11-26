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
 * @author Shamgar
 */
public class Controller_BantuSesama implements ActionListener{

    private BantuSesama bantu;
    private String username;
    private Koneksi kn;

    public Controller_BantuSesama(String username) {
        bantu = new BantuSesama();
        bantu.addActionListener(this);
        bantu.setVisible(true);
        kn = new Koneksi();        
        this.username = username;
        bantu.setUsername(username); 
        loadTableBantuan();
    }
    public void loadTableBantuan(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Jenis Bencana", "Jam", "Lokasi", "Keterangan"}, 0);
        ArrayList<Peristiwa> peristiwa = kn.getPeristiwa();
        for (Peristiwa p : peristiwa) {
            model.addRow(new Object[]{p.getJenis_bencana(), p.getJam(), p.getLokasi(), p.getKeterangan_peristiwa()});
        }
        bantu.setTbBantuan(model);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        bantu.setUsername(username);        
        Object source = e.getSource();
        if (source.equals(bantu.getbtnHome())){
             btnHomeActionPerformed();
        } else if(source.equals(bantu.getbtnLaporkan())){
            btnLaporkanActionPerformed();
        }
    }

    public void btnHomeActionPerformed(){
        new Controller_HomeAfterLogin(username);
        bantu.setVisible(false);
}
    public void btnLaporkanActionPerformed(){
        new Controller_UserLapor(username);
        bantu.setVisible(false);
    }

}
