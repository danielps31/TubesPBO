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

    private BantuSesamaUser bantu;
    private String username;
    private Koneksi kn;
    private String jenis_bantuan;
    private String tanggal_pengiriman;
    private String keterangan_bantuan;

    public Controller_BantuSesama(String username) {
        bantu = new BantuSesamaUser();
        bantu.addActionListener(this);
        bantu.setVisible(true);
        kn = new Koneksi();        
        this.username = username;
        bantu.setUsername(username); 
        loadTablePeristiwa();
    }
    public void loadTablePeristiwa(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Jenis Bencana", "Jam", "Lokasi", "Keterangan","Status"}, 0);
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
        } else if(source.equals(bantu.getbtnSubmit())){
            btnSubmitActionPerformed();
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
    
    public void btnSubmitActionPerformed(){
        String jenis_bantuan = bantu.getTfJenisBantuan();
        String tanggal_pengiriman = bantu.getTfTanggalPengiriman();
        String keterangan_bantuan = bantu.getTfKeteranganBantuan(); 
        if(jenis_bantuan.isEmpty() || tanggal_pengiriman.isEmpty() ||  keterangan_bantuan.isEmpty()){     
            bantu.showMessage("Masih Ada Field Kosong", "Error", 0);
        } else{
              if(kn.addBantuan(new Bantuan(" ",jenis_bantuan,tanggal_pengiriman,keterangan_bantuan)))
                     bantu.showMessage("Data Telah Berhasil Ditambahkan!", "Sukses", 1);
                     new Controller_HomeAfterLogin(username);
                     bantu.setVisible(false);
                  }
    }
}
