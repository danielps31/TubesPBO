/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class BantuSesama extends javax.swing.JFrame {

    /**
     * Creates new form Bantuan
     */
    public BantuSesama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfTanggalPengiriman = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfKeterangan = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBantuan = new javax.swing.JTable();
        tfJenisBantuan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        Masuk1 = new javax.swing.JPanel();
        btnLaporkan = new javax.swing.JButton();
        Bantu = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(102, 165, 173));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Salurkan Bantuan Anda");

        tfTanggalPengiriman.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfTanggalPengiriman.setText("Tanggal Pengiriman");
        tfTanggalPengiriman.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTanggalPengirimanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTanggalPengirimanFocusLost(evt);
            }
        });
        tfTanggalPengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTanggalPengirimanActionPerformed(evt);
            }
        });

        tfKeterangan.setColumns(20);
        tfKeterangan.setRows(5);
        tfKeterangan.setText("TAMBAHKAN KETERANGAN DISINI.....");
        tfKeterangan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfKeteranganFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfKeteranganFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tfKeterangan);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Submit");

        tbBantuan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbBantuan);

        tfJenisBantuan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfJenisBantuan.setText("Jenis Bantuan");
        tfJenisBantuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfJenisBantuanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfJenisBantuanFocusLost(evt);
            }
        });
        tfJenisBantuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJenisBantuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(tfTanggalPengiriman)
                    .addComponent(tfJenisBantuan))
                .addGap(172, 172, 172))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(tfJenisBantuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTanggalPengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(7, 87, 91));

        jPanel4.setBackground(new java.awt.Color(7, 87, 91));

        Home.setBackground(new java.awt.Color(7, 87, 91));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        Username.setBackground(new java.awt.Color(7, 87, 91));
        Username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Masuk1.setBackground(new java.awt.Color(7, 87, 91));
        Masuk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Masuk1MouseClicked(evt);
            }
        });

        btnLaporkan.setBackground(new java.awt.Color(7, 87, 91));
        btnLaporkan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLaporkan.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporkan.setText("LAPORKAN");
        btnLaporkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporkanActionPerformed(evt);
            }
        });

        Bantu.setBackground(new java.awt.Color(7, 87, 91));
        Bantu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BantuMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BANTU SESAMA");

        javax.swing.GroupLayout BantuLayout = new javax.swing.GroupLayout(Bantu);
        Bantu.setLayout(BantuLayout);
        BantuLayout.setHorizontalGroup(
            BantuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BantuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BantuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(BantuLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BantuLayout.setVerticalGroup(
            BantuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BantuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Masuk1Layout = new javax.swing.GroupLayout(Masuk1);
        Masuk1.setLayout(Masuk1Layout);
        Masuk1Layout.setHorizontalGroup(
            Masuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Masuk1Layout.createSequentialGroup()
                .addComponent(btnLaporkan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bantu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Masuk1Layout.setVerticalGroup(
            Masuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Masuk1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLaporkan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Bantu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnHome.setBackground(new java.awt.Color(7, 87, 91));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Masuk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Masuk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LOGOFIX.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BantuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BantuMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_BantuMouseClicked

    private void Masuk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk1MouseClicked

    }//GEN-LAST:event_Masuk1MouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked

    }//GEN-LAST:event_HomeMouseClicked

    private void btnLaporkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporkanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaporkanActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void tfKeteranganFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKeteranganFocusLost
        // TODO add your handling code here:
        if(tfKeterangan.getText().equals("TAMBAHKAN KETERANGAN DISINI.....")){
            tfKeterangan.setText("");
        }
    }//GEN-LAST:event_tfKeteranganFocusLost

    private void tfKeteranganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKeteranganFocusGained
        // TODO add your handling code here:
        if(tfKeterangan.getText().equals("TAMBAHKAN KETERANGAN DISINI.....")){
            tfKeterangan.setText("");
        }
    }//GEN-LAST:event_tfKeteranganFocusGained

    private void tfTanggalPengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTanggalPengirimanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTanggalPengirimanActionPerformed

    private void tfTanggalPengirimanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTanggalPengirimanFocusLost
        // TODO add your handling code here:
        if(tfTanggalPengiriman.getText().equals("Tanggal Pengiriman")){
            tfTanggalPengiriman.setText("");
        }
    }//GEN-LAST:event_tfTanggalPengirimanFocusLost

    private void tfTanggalPengirimanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTanggalPengirimanFocusGained
        // TODO add your handling code here:
        if(tfTanggalPengiriman.getText().equals("Tanggal Pengiriman")){
            tfTanggalPengiriman.setText("");
        }
    }//GEN-LAST:event_tfTanggalPengirimanFocusGained

    private void tfJenisBantuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJenisBantuanFocusGained
        // TODO add your handling code here:
                if(tfJenisBantuan.getText().equals("Jenis Bantuan")){
            tfJenisBantuan.setText("");
        }
    }//GEN-LAST:event_tfJenisBantuanFocusGained

    private void tfJenisBantuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJenisBantuanFocusLost
        // TODO add your handling code here:
                        if(tfJenisBantuan.getText().equals("Jenis Bantuan")){
            tfJenisBantuan.setText("");
        }
    }//GEN-LAST:event_tfJenisBantuanFocusLost

    private void tfJenisBantuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJenisBantuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJenisBantuanActionPerformed

    public JTextField getJAM() {
        return tfTanggalPengiriman;
    }

    public void setJAM(JTextField JAM) {
        this.tfTanggalPengiriman = JAM;
    }

    public JTextArea getKeterangan() {
        return tfKeterangan;
    }

    public void setKeterangan(JTextArea Keterangan) {
        this.tfKeterangan = Keterangan;
    }

    public JButton getbtnLaporkan() {
        return btnLaporkan;
    }
    public JButton getbtnHome() {
        return btnHome;
    }    
    public void setUsername(String Username) {
        this.Username.setText(Username);
    }
    
        public void addActionListener(ActionListener x){
        btnHome.addActionListener(x);
        btnLaporkan.addActionListener(x);
    }
    public JTable getTbBantuan() {
        return tbBantuan;
    }
    
    public int getSelecctedTbBantuan(){
        return tbBantuan.getSelectedRow();
    }
    
    public void setTbBantuan(DefaultTableModel x){
        tbBantuan.setModel(x);
    }
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BantuSesama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BantuSesama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BantuSesama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BantuSesama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BantuSesama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bantu;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Masuk1;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLaporkan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbBantuan;
    private javax.swing.JTextField tfJenisBantuan;
    private javax.swing.JTextArea tfKeterangan;
    private javax.swing.JTextField tfTanggalPengiriman;
    // End of variables declaration//GEN-END:variables
}
