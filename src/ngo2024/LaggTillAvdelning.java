/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author walee
 */
public class LaggTillAvdelning extends javax.swing.JFrame {
    
    private InfDB idb;
    private String InloggadAnvandare;
    

    /**
     * Creates new form LaggTillAvdelning
     */
    public LaggTillAvdelning(InfDB idb, String InloggadAnvandare) {
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

        jLabel1 = new javax.swing.JLabel();
        jLVemInlogg = new javax.swing.JLabel();
        jLNamnAvdelning = new javax.swing.JLabel();
        jLBeskrivningAvdelning = new javax.swing.JLabel();
        jLAdressAvdelning = new javax.swing.JLabel();
        jLEpostAvdelning = new javax.swing.JLabel();
        jLTelefonAvdelning = new javax.swing.JLabel();
        jLStadAvdelning = new javax.swing.JLabel();
        jLChefAvdelning = new javax.swing.JLabel();
        jTFNamnAvdelning = new javax.swing.JTextField();
        jTFBeskrivningAvdelning = new javax.swing.JTextField();
        jTFAdressAvdelning = new javax.swing.JTextField();
        jTFEpostAvdelning = new javax.swing.JTextField();
        jTFTelefonAvdelning = new javax.swing.JTextField();
        jTFStadAvdelning = new javax.swing.JTextField();
        jTFChefAvdelning = new javax.swing.JTextField();
        jBLaggTill = new javax.swing.JButton();
        jBAvbryt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Lägg till Avdelning");

        jLVemInlogg.setText("jLabel2");

        jLNamnAvdelning.setText("Namn");

        jLBeskrivningAvdelning.setText("Beskrivning");

        jLAdressAvdelning.setText("Adress");

        jLEpostAvdelning.setText("Epost");

        jLTelefonAvdelning.setText("Telefon");

        jLStadAvdelning.setText("Stad");

        jLChefAvdelning.setText("Chef");

        jTFTelefonAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefonAvdelningActionPerformed(evt);
            }
        });

        jBLaggTill.setText("Lägg Till");
        jBLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLaggTillActionPerformed(evt);
            }
        });

        jBAvbryt.setText("Avbryt");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLChefAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLStadAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLTelefonAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLEpostAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLAdressAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLNamnAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLBeskrivningAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNamnAvdelning)
                                    .addComponent(jTFBeskrivningAvdelning)
                                    .addComponent(jTFAdressAvdelning)
                                    .addComponent(jTFEpostAvdelning)
                                    .addComponent(jTFTelefonAvdelning)
                                    .addComponent(jTFStadAvdelning)
                                    .addComponent(jTFChefAvdelning, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLVemInlogg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jBLaggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLVemInlogg)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNamnAvdelning)
                    .addComponent(jTFNamnAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBeskrivningAvdelning)
                    .addComponent(jTFBeskrivningAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAdressAvdelning)
                    .addComponent(jTFAdressAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEpostAvdelning)
                    .addComponent(jTFEpostAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefonAvdelning)
                    .addComponent(jTFTelefonAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStadAvdelning)
                    .addComponent(jTFStadAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLChefAvdelning)
                    .addComponent(jTFChefAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLaggTill)
                    .addComponent(jBAvbryt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFTelefonAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefonAvdelningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefonAvdelningActionPerformed

    private void jBLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLaggTillActionPerformed
       String namn = jTFNamnAvdelning.getText();
       String beskrivning = jTFBeskrivningAvdelning.getText();
       String adress = jTFAdressAvdelning.getText();
       String epost = jTFEpostAvdelning.getText();
       String telefon = jTFTelefonAvdelning.getText();
       String stad = jTFStadAvdelning.getText();
       String chef = jTFChefAvdelning.getText();
       
       int newAvdid = 1;
       
       try{
            String maxAvdidSql = "SELECT MAX(avdid) FROM avdelning";
            String maxAvdidStr = idb.fetchSingle(maxAvdidSql);
            
            if(maxAvdidStr != null && !maxAvdidStr.isEmpty()){
                newAvdid = Integer.parseInt(maxAvdidStr) + 1;
            }
            
            
            String sqlAvdelning = "INSERT INTO avdelning (avdid, namn, beskrivning, adress, epost, telefon, stad, chef) VALUES ("
    + newAvdid + ", '" + namn + "', '" + beskrivning + "', '" + adress + "', '" + epost + "', '" + telefon + "', '" + stad + "', '" + chef + "')";
       
            idb.insert(sqlAvdelning);
        System.out.println("Avdelning har lagts till.");
        
        jTFNamnAvdelning.setText("");
        jTFBeskrivningAvdelning.setText("");
        jTFAdressAvdelning.setText("");
        jTFEpostAvdelning.setText("");
        jTFTelefonAvdelning.setText("");
        jTFStadAvdelning.setText("");
        jTFChefAvdelning.setText("");
     
        }catch(InfException e){
            System.out.println("Ett fel uppstod:" + e.getMessage() );
        }
    }//GEN-LAST:event_jBLaggTillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new AdminMeny(idb, InloggadAnvandare).setVisible(true);
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
            java.util.logging.Logger.getLogger(LaggTillAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LaggTillAvdelning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAvbryt;
    private javax.swing.JButton jBLaggTill;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLAdressAvdelning;
    private javax.swing.JLabel jLBeskrivningAvdelning;
    private javax.swing.JLabel jLChefAvdelning;
    private javax.swing.JLabel jLEpostAvdelning;
    private javax.swing.JLabel jLNamnAvdelning;
    private javax.swing.JLabel jLStadAvdelning;
    private javax.swing.JLabel jLTelefonAvdelning;
    private javax.swing.JLabel jLVemInlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFAdressAvdelning;
    private javax.swing.JTextField jTFBeskrivningAvdelning;
    private javax.swing.JTextField jTFChefAvdelning;
    private javax.swing.JTextField jTFEpostAvdelning;
    private javax.swing.JTextField jTFNamnAvdelning;
    private javax.swing.JTextField jTFStadAvdelning;
    private javax.swing.JTextField jTFTelefonAvdelning;
    // End of variables declaration//GEN-END:variables
}