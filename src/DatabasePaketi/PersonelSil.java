/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabasePaketi;

import Login.Admin;
import hastane_yonetim_sistemi.IKayitSil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author CeRaL
 */
public class PersonelSil extends javax.swing.JFrame implements IKayitSil{

    Connection baglanti = null;
    /**
     * Creates new form PersonelSil
     */
    public PersonelSil() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPerSil = new javax.swing.JTextField();
        btnSil = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        btnListele = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personel Silme");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Personel Sil");

        jLabel2.setText("Persenel id :");

        btnSil.setBackground(new java.awt.Color(0, 204, 0));
        btnSil.setText("SİL");
        btnSil.setBorderPainted(false);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnVazgec.setBackground(new java.awt.Color(255, 0, 0));
        btnVazgec.setText("VAZGEÇ");
        btnVazgec.setBorderPainted(false);
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });

        btnListele.setText("LİSTELE");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListele)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(193, 193, 193)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPerSil, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVazgec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPerSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnSil)
                .addGap(18, 18, 18)
                .addComponent(btnVazgec)
                .addGap(18, 18, 18)
                .addComponent(btnListele)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

    if (silKontrol()) sil();
     
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        
        Admin adm = new Admin();
         adm.setVisible(true);
          this.hide();

    }//GEN-LAST:event_btnVazgecActionPerformed

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
         PersonelListele listele = new PersonelListele();
         listele.setVisible(true);
          this.hide();
    }//GEN-LAST:event_btnListeleActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelSil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtPerSil;
    // End of variables declaration//GEN-END:variables

    @Override
    public void sil() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        try {
            PreparedStatement uygula = baglanti.prepareStatement("DELETE FROM p_tablo WHERE doktor_id=?");
            uygula.setInt(1,Integer.valueOf(txtPerSil.getText()));
            
            int donut=uygula.executeUpdate();
            if(donut>0)JOptionPane.showMessageDialog(null, "Kayıt Silindi");
            else JOptionPane.showMessageDialog(null, "Silme Esnasında Hata Oluştu");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Güncelleme Hatası : "+e.getMessage());
        }
    }
    
    private boolean silKontrol(){
        boolean donut = false;
        String mesaj = "";
        
        if(txtPerSil.getText().isEmpty()) mesaj=mesaj+"Lütfen Geçerli Bir ID Giriniz.\n";       
        
        if(mesaj=="") donut=true;
        else JOptionPane.showMessageDialog(null, mesaj);
        return donut;
    }
    
    
}
