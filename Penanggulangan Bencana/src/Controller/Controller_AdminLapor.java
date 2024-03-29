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
 * @author ACER
 */
public class Controller_AdminLapor implements ActionListener {
    
    private AdminLapor admlapor;
    private String username;
    private Koneksi kn;
    
    public Controller_AdminLapor(String username){
        admlapor = new AdminLapor();
        admlapor.addActionListener(this);
        admlapor.setVisible(true);
        kn = new Koneksi();        
        this.username = username;
        admlapor.setUsername(username); 
        loadTableBantuan();
        
    }
    
    public void loadTableBantuan(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Jenis Bencana", "Jam", "Lokasi", "Keterangan", "Status"}, 0);
        ArrayList<Peristiwa> peristiwa = kn.getPeristiwa();
        for (Peristiwa p : peristiwa) {
            model.addRow(new Object[]{p.getJenis_bencana(), p.getJam(), p.getLokasi(), p.getKeterangan_peristiwa()});
        }
        admlapor.setTbBantuan(model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        admlapor.setUsername(username);
        Object source = e.getSource();
        if (source.equals(admlapor.getbtnEditStatus())){
            btnEditStatusActionPerformed();
        } else if (source.equals(admlapor.getbtnHome())){
            btnHomeActionPerformed();
        } else if(source.equals(admlapor.getbtnBantu())){
            btnBantuActionPerformed();
        }
    }
    
    public void btnEditStatusActionPerformed(){
        new Controller_HomeAfterLoginAdmin(username);
        admlapor.setVisible(false);
    }
    public void btnHomeActionPerformed(){
        new Controller_HomeAfterLoginAdmin(username);
        admlapor.setVisible(false);
    }
    public void btnBantuActionPerformed(){
        new Controller_BantuSesamaAdmin(username);
        admlapor.setVisible(false);
    }
    
}
