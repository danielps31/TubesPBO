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
    
    public Controller_AdminLapor(){
        admlapor = new AdminLapor();
        admlapor.addActionListener(this);
        admlapor.setVisible(true);
        kn = new Koneksi();        
        this.username = username;
        admlapor.setUsername(username); 
        loadTableBantuan();
        
    }
    
    public void loadTableBantuan(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Jenis Bencana", "Jam", "Lokasi", "Keterangan"}, 0);
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
        }
    }
    
    public void btnEditStatusActionPerformed(){
        new Controller_HomeAfterLogin(username);
        admlapor.setVisible(false);
    }
    
}
