/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabasePaketi;

import Login.Doktor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author CeRaL
 */
public class DoktorHastaListe extends javax.swing.JFrame {

    Connection baglanti = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    /**
     * Creates new form DoktorHastaListe
     */
    public DoktorHastaListe() {
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
    private void listele() {
        baglanti();
       
        try {
            
            String ceral = "SELECT * FROM randevu_ver";
            pst = baglanti.prepareStatement(ceral);
            rs=pst.executeQuery();
            tblhasta.setModel(DbUtils.resultSetToTableModel(rs));
                      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hatası : "+e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTC = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhasta = new javax.swing.JTable();
        btnGeri = new javax.swing.JButton();
        btnHepsi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasta Liste");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Hasta Listesi");

        jLabel2.setText("TC No : ");

        btnAra.setText("ARA");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        tblhasta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblhasta);

        btnGeri.setText("GERİ");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        btnHepsi.setText("Tüm Liste");
        btnHepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHepsiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAra)))
                        .addGap(18, 18, 18)
                        .addComponent(btnHepsi)
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGeri)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAra)
                        .addComponent(btnHepsi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGeri)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        Doktor ldoktor = new Doktor();
        ldoktor.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        baglanti();
        try
        {

        String sorgu = "select * from h_sorgu where TC='"+txtTC.getText()+"'";
        pst = baglanti.prepareStatement(sorgu);
        rs=pst.executeQuery(sorgu);
        rs.last();
        int ks = rs.getRow();
        String kss=""+ks;
        if(ks>0)//if(ks==1)
        {
        
        String ceral = "SELECT * FROM h_sorgu where TC='"+txtTC.getText()+"'";
        pst = baglanti.prepareStatement(ceral);
        rs=pst.executeQuery();
        tblhasta.setModel(DbUtils.resultSetToTableModel(rs));     
        
               }
        else
            JOptionPane.showConfirmDialog(null,"Kişi Kayıtlı Değil Kayıt Menüsünden Kaydını Yapınız.");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(SekreterRandevu.class.getName()).log(Level.SEVERE,null,ex);
        JOptionPane.showConfirmDialog(null,"hata");
        }   
    }//GEN-LAST:event_btnAraActionPerformed

    private void btnHepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHepsiActionPerformed
        listele();
    }//GEN-LAST:event_btnHepsiActionPerformed

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
            java.util.logging.Logger.getLogger(DoktorHastaListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorHastaListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorHastaListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorHastaListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorHastaListe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnHepsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblhasta;
    private javax.swing.JTextField txtTC;
    // End of variables declaration//GEN-END:variables
}
