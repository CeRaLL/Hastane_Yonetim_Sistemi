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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author CeRaL
 */
public class HastaKayit extends javax.swing.JFrame {

    Connection baglanti = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    /**
     * Creates new form HastaKayit
     */
    public HastaKayit() {
        initComponents();
    }
    public void baglanti () {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Driver Sürücüsü Hatası : "+e.getMessage());
        }        
        try {
            baglanti= DriverManager.getConnection("jdbc:mysql://localhost:3308/hys?serverTimezone=UTC","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bağlantı Hatası : "+e.getMessage());
        }
    }
    public void ekle() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        baglanti();
        try {
            PreparedStatement uygula = baglanti.prepareStatement("INSERT INTO h_tablo(TC, Ad, Soyad, D_yeri, D_tarih) VALUES (?,?,?,?,?)");
            
            uygula.setString(1,txtTC.getText());
            uygula.setString(2,txtAdi.getText());
            uygula.setString(3,txtSoyadi.getText());
            uygula.setString(4,txtDY.getText());
            uygula.setString(5,txtDT.getText());
            
            int donut=uygula.executeUpdate();
            if(donut>0)JOptionPane.showMessageDialog(null, "Kayıt Yapıldı");
            else JOptionPane.showMessageDialog(null, "Kayıt Esnasında Hata Oluştu");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Güncelleme Hatası : "+e.getMessage());
        }
    }
    
    private boolean duzeltmeKontrol(){
        boolean donut = false;
        String mesaj = "";
        
        if(txtTC.getText().isEmpty()) mesaj=mesaj+"TC boş bırakılamaz.\n";
        if(txtAdi.getText().isEmpty()) mesaj=mesaj+"Adı boş bırakılamaz.\n";
        if(txtSoyadi.getText().isEmpty()) mesaj=mesaj+"Soyadı boş bırakılamaz.\n";
        if(txtDY.getText().isEmpty()) mesaj=mesaj+"Doğum Yeri boş bırakılamaz.\n";
        if(txtDT.getText().isEmpty()) mesaj=mesaj+"Doğum Tarihi boş bırakılamaz.\n";

        
        if(mesaj=="") donut=true;
        else JOptionPane.showMessageDialog(null, mesaj);
        return donut;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTC = new javax.swing.JTextField();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtDY = new javax.swing.JTextField();
        txtDT = new javax.swing.JTextField();
        btnKaydet = new javax.swing.JButton();
        btnListe = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasta Kayıt");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Hasta Kayıt");

        jLabel2.setText("TC No :");

        jLabel3.setText("Adı : ");

        jLabel4.setText("Soyadı :");

        jLabel5.setText("Doğum Yeri :");

        jLabel6.setText("Doğum Tarihi :");

        btnKaydet.setBackground(new java.awt.Color(0, 204, 0));
        btnKaydet.setText("KAYDET");
        btnKaydet.setBorderPainted(false);
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnListe.setBackground(new java.awt.Color(255, 0, 0));
        btnListe.setText("LİSTELE");
        btnListe.setBorderPainted(false);
        btnListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeActionPerformed(evt);
            }
        });

        btnGeri.setText("GERİ");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListe)
                    .addComponent(btnKaydet)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDT, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(txtTC)
                                .addComponent(txtAdi)
                                .addComponent(txtSoyadi)
                                .addComponent(txtDY)))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(txtDY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnKaydet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGeri)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        if(duzeltmeKontrol()) ekle();
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeActionPerformed
        HastaListesi h_liste = new HastaListesi();
        h_liste.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnListeActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        Sekreter s1 = new Sekreter();
        s1.setVisible(true);
        this.hide();
                
    }//GEN-LAST:event_btnGeriActionPerformed

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
            java.util.logging.Logger.getLogger(HastaKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnListe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtDY;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTC;
    // End of variables declaration//GEN-END:variables
}