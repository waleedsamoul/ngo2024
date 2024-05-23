/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Ägaren
 */
public class AdminLaggTillPartner extends javax.swing.JFrame {

    private InfDB idb;
    private String InloggadAnvandare;

    /**
     * Creates new form AdminLaggTillPartner
     */
    public AdminLaggTillPartner(InfDB idb, String InloggadAnvandare) {
        this.idb = idb;
        this.InloggadAnvandare = InloggadAnvandare;
        initComponents();
        jLVemInlogg.setText(InloggadAnvandare);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFKontaktperson = new javax.swing.JTextField();
        jTFKontaktepost1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFTelefon = new javax.swing.JTextField();
        jLPartner = new javax.swing.JLabel();
        jTFAdress = new javax.swing.JTextField();
        jLKontaktperson = new javax.swing.JLabel();
        jTFStad = new javax.swing.JTextField();
        jLKontaktepost = new javax.swing.JLabel();
        jTFBranch = new javax.swing.JTextField();
        jLTelefon = new javax.swing.JLabel();
        jLAdress = new javax.swing.JLabel();
        jLBranch = new javax.swing.JLabel();
        jLVemInlogg = new javax.swing.JLabel();
        jLStad = new javax.swing.JLabel();
        jTFPartner = new javax.swing.JTextField();
        jBLaggTillPartner = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFKontaktepost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFKontaktepost1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Lägg till Partner");

        jLPartner.setText("Partner");

        jLKontaktperson.setText("Kontaktperson");

        jLKontaktepost.setText("Kontaktepost");

        jLTelefon.setText("Telefon");

        jLAdress.setText("Adress");

        jLBranch.setText("Branch");

        jLVemInlogg.setText("jLabel2");

        jLStad.setText("Stad");

        jBLaggTillPartner.setText("Lägg Till");
        jBLaggTillPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLaggTillPartnerActionPerformed(evt);
            }
        });

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jBLaggTillPartner))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFStad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLVemInlogg)
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)))
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLKontaktperson)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFKontaktperson, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLPartner)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLKontaktepost)
                                .addComponent(jLAdress)
                                .addComponent(jLTelefon)
                                .addComponent(jLBranch))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFBranch, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jTFAdress)
                                .addComponent(jTFTelefon)
                                .addComponent(jTFKontaktepost1)))
                        .addComponent(jLStad))
                    .addContainerGap(180, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLVemInlogg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jTFStad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLaggTillPartner)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPartner)
                        .addComponent(jTFPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLKontaktperson, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTFKontaktperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLKontaktepost)
                        .addComponent(jTFKontaktepost1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLTelefon)
                        .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLAdress)
                        .addComponent(jTFAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLBranch)
                        .addComponent(jTFBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLStad)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFKontaktepost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFKontaktepost1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFKontaktepost1ActionPerformed

    private void jBLaggTillPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLaggTillPartnerActionPerformed

        if (Validering.textFaltHarVarde(jTFPartner) && Validering.textFaltHarVarde(jTFKontaktperson) && Validering.textFaltHarVarde(jTFKontaktepost1) && Validering.textFaltHarVarde(jTFTelefon) && Validering.textFaltHarVarde(jTFTelefon) && Validering.textFaltHarVarde(jTFAdress) && Validering.textFaltHarVarde(jTFStad) && Validering.isValidDate(jTFBranch) && Validering.isHelTal(jTFTelefon) && Validering.isValidEpost(jTFKontaktepost1)) {

            String partner = jTFPartner.getText();
            String kontaktperson = jTFKontaktperson.getText();
            String kontaktepost = jTFKontaktepost1.getText();
            String telefon = jTFTelefon.getText();
            String adress = jTFAdress.getText();
            String stad = jTFStad.getText();
            String branch = jTFBranch.getText();

            int newPid = 1;

            try {
                String maxPidSql = "SELECT MAX(pid) FROM partner";
                String maxPidStr = idb.fetchSingle(maxPidSql);

                if (maxPidStr != null && !maxPidStr.isEmpty()) {
                    newPid = Integer.parseInt(maxPidStr) + 1;
                }

                String sql = "INSERT INTO partner (pid, namn, kontaktperson, kontaktepost, telefon, adress, branch, stad) VALUES ("
                        + newPid + ", '" + partner + "', '" + kontaktperson + "', '" + kontaktepost + "', '" + telefon + "', '" + adress + "', '" + branch + "', '" + stad + "')";

                idb.insert(sql);
                System.out.println("Partner har lagts till.");

                jTFPartner.setText("");
                jTFKontaktperson.setText("");
                jTFKontaktepost1.setText("");
                jTFTelefon.setText("");
                jTFAdress.setText("");
                jTFBranch.setText("");
                jTFStad.setText("");
            } catch (InfException e) {
                System.out.println("Ett fel uppstod:" + e.getMessage());
            }
        }
    }//GEN-LAST:event_jBLaggTillPartnerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminHanteraPartner(idb, InloggadAnvandare).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLaggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLaggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLaggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLaggTillPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminLaggTillPartner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLaggTillPartner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLAdress;
    private javax.swing.JLabel jLBranch;
    private javax.swing.JLabel jLKontaktepost;
    private javax.swing.JLabel jLKontaktperson;
    private javax.swing.JLabel jLPartner;
    private javax.swing.JLabel jLStad;
    private javax.swing.JLabel jLTelefon;
    private javax.swing.JLabel jLVemInlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFAdress;
    private javax.swing.JTextField jTFBranch;
    private javax.swing.JTextField jTFKontaktepost1;
    private javax.swing.JTextField jTFKontaktperson;
    private javax.swing.JTextField jTFPartner;
    private javax.swing.JTextField jTFStad;
    private javax.swing.JTextField jTFTelefon;
    // End of variables declaration//GEN-END:variables
}
