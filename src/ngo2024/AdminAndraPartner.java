/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Ägaren
 */
public class AdminAndraPartner extends javax.swing.JFrame {

    private InfDB idb;
    private String InloggadAnvandare;

    /**
     * Creates new form AdminAndraPartner
     */
    public AdminAndraPartner(InfDB idb, String InloggadAnvandare) {
        this.idb = idb;
        this.InloggadAnvandare = InloggadAnvandare;
        initComponents();
        fyllComboBox();
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

        jButton1 = new javax.swing.JButton();
        jLVemInlogg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLPartner = new javax.swing.JLabel();
        jLKontaktperson = new javax.swing.JLabel();
        jLKontaktepost = new javax.swing.JLabel();
        jLTelefon = new javax.swing.JLabel();
        jLAdress = new javax.swing.JLabel();
        jLBranch = new javax.swing.JLabel();
        jLStad = new javax.swing.JLabel();
        jTFPartner = new javax.swing.JTextField();
        jTFKontaktperson = new javax.swing.JTextField();
        jTFKontaktepost = new javax.swing.JTextField();
        jTFTelefon = new javax.swing.JTextField();
        jTFAdress = new javax.swing.JTextField();
        jTFBranch = new javax.swing.JTextField();
        jTFStad = new javax.swing.JTextField();
        jCBValjPartner = new javax.swing.JComboBox<>();
        jBAndraPartner = new javax.swing.JButton();
        jLPid = new javax.swing.JLabel();
        jTFPid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLVemInlogg.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ändra Information Om Partner");

        jLPartner.setText("Partner");

        jLKontaktperson.setText("Kontaktperson");

        jLKontaktepost.setText("Kontaktepost");

        jLTelefon.setText("Telefon");

        jLAdress.setText("Adress");

        jLBranch.setText("Branch");

        jLStad.setText("Stad");

        jTFPartner.setText("jTextField1");
        jTFPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPartnerActionPerformed(evt);
            }
        });

        jTFKontaktperson.setText("jTextField2");
        jTFKontaktperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFKontaktpersonActionPerformed(evt);
            }
        });

        jTFKontaktepost.setText("jTextField3");

        jTFTelefon.setText("jTextField4");

        jTFAdress.setText("jTextField5");

        jTFBranch.setText("jTextField6");

        jTFStad.setText("jTextField7");

        jCBValjPartner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBValjPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBValjPartnerActionPerformed(evt);
            }
        });

        jBAndraPartner.setText("Ändra");
        jBAndraPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAndraPartnerActionPerformed(evt);
            }
        });

        jLPid.setText("Pid");

        jTFPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBValjPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLVemInlogg))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLKontaktperson)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFKontaktperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLKontaktepost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFKontaktepost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLTelefon)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLAdress)
                                                    .addComponent(jLBranch)
                                                    .addComponent(jLStad))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTFStad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTFBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jTFAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jBAndraPartner)
                                                .addGap(6, 6, 6))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLPartner)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLPid)))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVemInlogg)
                    .addComponent(jCBValjPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPid)
                    .addComponent(jTFPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPartner)
                    .addComponent(jTFPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLKontaktperson)
                    .addComponent(jTFKontaktperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLKontaktepost)
                    .addComponent(jTFKontaktepost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefon)
                    .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAdress)
                    .addComponent(jTFAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBranch)
                    .addComponent(jTFBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStad)
                    .addComponent(jTFStad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jBAndraPartner))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//combobox för att välja partner.

    private void fyllComboBox() {
        jCBValjPartner.removeAllItems();
        try {
            String sql = "SELECT namn FROM partner";
            ArrayList<String> enPartner = idb.fetchColumn(sql);

            if (enPartner != null) {
                for (String partner : enPartner) {
                    jCBValjPartner.addItem(partner);
                }
            } else {
                System.out.println("Inga partners hittades.");
            }
        } catch (InfException e) {
            System.out.println("Ett fel uppstod vid hämtning av partners.");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminHanteraPartner(idb, InloggadAnvandare).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFKontaktpersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFKontaktpersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFKontaktpersonActionPerformed

    private void jTFPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPartnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPartnerActionPerformed

    private void jCBValjPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBValjPartnerActionPerformed
//    Knapp för att ändra.
        String valdPartner = (String) jCBValjPartner.getSelectedItem();
        if (valdPartner != null) {
            try {
                String sql = "SELECT * FROM partner WHERE namn = '" + valdPartner + "'";
                HashMap<String, String> partner = idb.fetchRow(sql);

                if (partner != null) {
                    jTFPid.setText(partner.get("pid"));
                    jTFPartner.setText(partner.get("namn"));
                    jTFKontaktperson.setText(partner.get("kontaktperson"));
                    jTFKontaktepost.setText(partner.get("kontaktepost"));
                    jTFTelefon.setText(partner.get("telefon"));
                    jTFAdress.setText(partner.get("adress"));
                    jTFBranch.setText(partner.get("branch"));
                    jTFStad.setText(partner.get("stad"));
                } else {
                    System.out.println("Kunde inte hitta partner.");
                }
            } catch (InfException e) {
                System.out.println("Ett fel uppstod vid hämtning av partnerdetaljer.");
            }
        }

    }//GEN-LAST:event_jCBValjPartnerActionPerformed

    private void jBAndraPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAndraPartnerActionPerformed

        if (Validering.textFaltHarVarde(jTFPid) && Validering.isHelTal(jTFPid) && Validering.textFaltHarVarde(jTFPartner) && Validering.textFaltHarVarde(jTFKontaktperson) && Validering.textFaltHarVarde(jTFKontaktepost) && Validering.textFaltHarVarde(jTFTelefon) && Validering.textFaltHarVarde(jTFAdress) && Validering.textFaltHarVarde(jTFBranch) && Validering.textFaltHarVarde(jTFStad) && Validering.isHelTal(jTFTelefon) && Validering.isValidEpost(jTFKontaktepost) && Validering.isHelTal(jTFStad)) {

            String pid = jTFPid.getText();
            String partner = jTFPartner.getText();
            String kontaktperson = jTFKontaktperson.getText();
            String kontaktepost = jTFKontaktepost.getText();
            String telefon = jTFTelefon.getText();
            String adress = jTFAdress.getText();
            String branch = jTFBranch.getText();
            String stad = jTFStad.getText();
            try {
//        Uppdaterar i databasen.
                String sqlAndring = "UPDATE partner SET namn = '" + partner + "', kontaktperson = '" + kontaktperson + "', kontaktepost = '" + kontaktepost + "', telefon = '" + telefon + "', adress = '" + adress + "', branch = '" + branch + "', stad = '" + stad + "' WHERE pid = '" + pid + "'";
                idb.update(sqlAndring);

                System.out.println("Ändringar har genomförts.");
            } catch (InfException e) {

                System.out.println("Ett fel uppstod. Ändringar kunde inte genomföras.");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBAndraPartnerActionPerformed

    private void jTFPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPidActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAndraPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new AdminAndraPartner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAndraPartner;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBValjPartner;
    private javax.swing.JLabel jLAdress;
    private javax.swing.JLabel jLBranch;
    private javax.swing.JLabel jLKontaktepost;
    private javax.swing.JLabel jLKontaktperson;
    private javax.swing.JLabel jLPartner;
    private javax.swing.JLabel jLPid;
    private javax.swing.JLabel jLStad;
    private javax.swing.JLabel jLTelefon;
    private javax.swing.JLabel jLVemInlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFAdress;
    private javax.swing.JTextField jTFBranch;
    private javax.swing.JTextField jTFKontaktepost;
    private javax.swing.JTextField jTFKontaktperson;
    private javax.swing.JTextField jTFPartner;
    private javax.swing.JTextField jTFPid;
    private javax.swing.JTextField jTFStad;
    private javax.swing.JTextField jTFTelefon;
    // End of variables declaration//GEN-END:variables
}
