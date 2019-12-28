/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabasePaketi;

import Login.Sekreter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CeRaL
 */
public class SekreterRandevu extends javax.swing.JFrame {
    Connection baglan = null;
    PreparedStatement pst =null;
    ResultSet rs = null;

    /**
     * Creates new form SekreterRandevu
     */
    public SekreterRandevu() {
        initComponents();
    }
    public void baglanti () {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Driver Sürücüsü Hatası : "+e.getMessage());
        }        
        try {
            baglan= DriverManager.getConnection("jdbc:mysql://localhost:3308/hys?serverTimezone=UTC","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bağlantı Hatası : "+e.getMessage());
        }
    }

    private void listeleme() {
     
    try{
            try {
                baglanti();
            } catch (Exception e) {
                Logger.getLogger(SekreterRandevu.class.getName()).log(Level.SEVERE, null, e);
            }
        String sorgu = "select * from brans";

        pst = baglan.prepareStatement(sorgu);
        rs=pst.executeQuery();
        rs.last();
        int ks = rs.getRow();
        String kss=""+ks;
        if(ks>0) {
            rs.beforeFirst();
            while (rs.next()) {
                cmbRandevu.addItem(rs.getString("Brans_adi"));
            }
        }
        else
            JOptionPane.showConfirmDialog(null,"Kayıtlı Branş Yok");
        
        String sorgu2 = "select * from p_tablo";

        pst = baglan.prepareStatement(sorgu2);
        rs=pst.executeQuery();
        rs.last();
        int ks2 = rs.getRow();
        String kss2=""+ks2;
        if(ks2>0) {
            rs.beforeFirst();
            while (rs.next()) {
                cmbdid.addItem(rs.getString("doktor_id"));
            }
        }
        else
            JOptionPane.showConfirmDialog(null,"Kayıtlı Doktor Yok");
    } catch (SQLException ex){
            Logger.getLogger(SekreterRandevu.class.getName()).log(Level.SEVERE,null,ex);
        JOptionPane.showConfirmDialog(null,"hata");
        }   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBrans = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTC = new javax.swing.JTextField();
        txthid = new javax.swing.JTextField();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtDt = new javax.swing.JTextField();
        txtDy = new javax.swing.JTextField();
        btnGetir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbRandevu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtRT = new javax.swing.JTextField();
        btnRV = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbdid = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Randevu Ver");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Randevu Verme Ekranı");

        jLabel2.setText("TC No :");

        jLabel3.setText("Adı :");

        jLabel4.setText("Soyadı :");

        jLabel5.setText("Doğum Yeri :");

        jLabel6.setText("Doğum Tarihi :");

        jLabel7.setText("Hasta Id :");

        btnGetir.setText("GETİR");
        btnGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetirActionPerformed(evt);
            }
        });

        jLabel8.setText("Bölüm :");

        cmbRandevu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz" }));

        jLabel9.setText("Randevu Tarihi :");

        btnRV.setText("Randevu Ver");
        btnRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRVActionPerformed(evt);
            }
        });

        btnGeri.setText("GERİ");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jLabel10.setText("Doktor Id :");

        cmbdid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz" }));

        javax.swing.GroupLayout cmbBransLayout = new javax.swing.GroupLayout(cmbBrans);
        cmbBrans.setLayout(cmbBransLayout);
        cmbBransLayout.setHorizontalGroup(
            cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmbBransLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cmbBransLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cmbBransLayout.createSequentialGroup()
                        .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cmbBransLayout.createSequentialGroup()
                                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDy, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(cmbBransLayout.createSequentialGroup()
                                        .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnGetir))
                                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cmbBransLayout.createSequentialGroup()
                                        .addComponent(btnRV)
                                        .addGap(341, 341, 341))
                                    .addGroup(cmbBransLayout.createSequentialGroup()
                                        .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnGeri)
                                            .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtRT, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmbRandevu, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(cmbBransLayout.createSequentialGroup()
                                .addComponent(cmbdid, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(cmbBransLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );
        cmbBransLayout.setVerticalGroup(
            cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmbBransLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetir)
                    .addComponent(jLabel8)
                    .addComponent(cmbRandevu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txthid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cmbBransLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cmbBransLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnRV)))
                .addGap(18, 18, 18)
                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cmbBransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbdid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnGeri)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(cmbBrans, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cmbBrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        Sekreter s1 = new Sekreter();
        s1.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRVActionPerformed
        try
        {
            baglanti();
            String sorgu = "insert into randevu_ver(TC,hasta_id,Adi,Soyadi,Brans,doktor_id,R_Tarihi) values ('"+txtTC.getText()+"','"+Integer.valueOf(txthid.getText())+"','"+txtAdi.getText()+"','"+txtSoyadi.getText()+"','"+cmbRandevu.getSelectedItem()+"','"+cmbdid.getSelectedItem()+"','"+txtRT.getText()+"')";
            Statement stmt = baglan.createStatement();
            JOptionPane.showMessageDialog(rootPane, "Randevu Verildi");
            stmt.executeUpdate(sorgu);
            baglan.close();
            //uygula.setInt(5,Integer.valueOf(txtBrans.getText()));

        }
        catch(Exception e)
        {
            Logger.getLogger(PersonelEkle.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnRVActionPerformed

    private void btnGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetirActionPerformed
        listeleme();
        try {
            try {
                baglanti();
            } catch (Exception e) {
                Logger.getLogger(SekreterRandevu.class.getName()).log(Level.SEVERE, null, e);
            }
            if(txtTC.getText().length()==11){
                String sorgu = "select * from h_tablo where TC='"+txtTC.getText()+"'";
                pst = baglan.prepareStatement(sorgu);
                rs=pst.executeQuery();
                rs.last();
                int ks3 = rs.getRow();
                String kss3=""+ks3;

                if(ks3==1){
                    txthid.setText(rs.getString("hasta_id"));
                    txtAdi.setText(rs.getString("Ad"));
                    txtSoyadi.setText(rs.getString("Soyad"));
                    txtDy.setText(rs.getString("D_yeri"));
                    txtDt.setText(rs.getString("D_tarih"));

                }else JOptionPane.showConfirmDialog(null,"Kişi Kayıtlı Değil Kayıt Menüsünden Kaydını Yapınız.");
            } else JOptionPane.showMessageDialog(null, "Lütfen TC'yi 11 karakter giriniz.");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(SekreterRandevu.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showConfirmDialog(null,"hata");
        }
    }//GEN-LAST:event_btnGetirActionPerformed

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
            java.util.logging.Logger.getLogger(SekreterRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SekreterRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SekreterRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SekreterRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SekreterRandevu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGetir;
    private javax.swing.JButton btnRV;
    private javax.swing.JPanel cmbBrans;
    private javax.swing.JComboBox<String> cmbRandevu;
    private javax.swing.JComboBox<String> cmbdid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtDt;
    private javax.swing.JTextField txtDy;
    private javax.swing.JTextField txtRT;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txthid;
    // End of variables declaration//GEN-END:variables
}
