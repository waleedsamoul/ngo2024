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
public class LaggTillLand extends javax.swing.JFrame {
    
    private InfDB idb;
    private String InloggadAnvandare;

    /**
     * Creates new form LaggTillLand
     */
    public LaggTillLand(InfDB idb, String InloggadAnvandare) {
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
        jLNamnLand = new javax.swing.JLabel();
        jLSprakLand = new javax.swing.JLabel();
        jLValutaLand = new javax.swing.JLabel();
        jLTidszonLand = new javax.swing.JLabel();
        jLPolitiskStrukturLand = new javax.swing.JLabel();
        jLEkonomiLand = new javax.swing.JLabel();
        jTFNamnLand = new javax.swing.JTextField();
        jTFSprakLand = new javax.swing.JTextField();
        jTFValutaLand = new javax.swing.JTextField();
        jTFTidszonLand = new javax.swing.JTextField();
        jTFPolitiskStrukturLand = new javax.swing.JTextField();
        jTFEkonomiLand = new javax.swing.JTextField();
        jBLaggTillLand = new javax.swing.JButton();
        jBAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Lägg Till Land");

        jLVemInlogg.setText("jLabel2");

        jLNamnLand.setText("Namn");

        jLSprakLand.setText("Språk");

        jLValutaLand.setText("Valuta");

        jLTidszonLand.setText("Tidszon");

        jLPolitiskStrukturLand.setText("Politisk Struktur");

        jLEkonomiLand.setText("Ekonomi");

        jBLaggTillLand.setText("Lägg Till");
        jBLaggTillLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLaggTillLandActionPerformed(evt);
            }
        });

        jBAvbryt.setText("Avbryt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLVemInlogg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLNamnLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLSprakLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLValutaLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTidszonLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLEkonomiLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLPolitiskStrukturLand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNamnLand)
                                .addComponent(jTFSprakLand)
                                .addComponent(jTFValutaLand)
                                .addComponent(jTFTidszonLand)
                                .addComponent(jTFPolitiskStrukturLand)
                                .addComponent(jTFEkonomiLand, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLVemInlogg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNamnLand)
                    .addComponent(jTFNamnLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSprakLand)
                    .addComponent(jTFSprakLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValutaLand)
                    .addComponent(jTFValutaLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTidszonLand)
                    .addComponent(jTFTidszonLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPolitiskStrukturLand)
                    .addComponent(jTFPolitiskStrukturLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEkonomiLand)
                    .addComponent(jTFEkonomiLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLaggTillLand)
                    .addComponent(jBAvbryt))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLaggTillLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLaggTillLandActionPerformed
        String namn = jTFNamnLand.getText();
        String sprak = jTFSprakLand.getText();
        String valuta = jTFValutaLand.getText();
        String tidszon = jTFTidszonLand.getText();
        String politisk_struktur = jTFPolitiskStrukturLand.getText();
        String ekonomi = jTFEkonomiLand.getText();
        
        int newLid = 1;
         
        try{
            String maxLidSql = "SELECT MAX(lid) FROM land";
            String maxLidStr = idb.fetchSingle(maxLidSql);
            
            if(maxLidStr != null && !maxLidStr.isEmpty()){
                newLid = Integer.parseInt(maxLidStr) + 1;
            }
        
    String sqlLand = "INSERT INTO land (lid, namn, sprak, valuta, tidszon, politisk_struktur, ekonomi) VALUES ("
    + newLid + ", '" + namn + "', '" + sprak + "', '" + valuta + "', '" + tidszon + "', '" + politisk_struktur + "', '" + ekonomi + "')";
       
        idb.insert(sqlLand);
        System.out.println("Land har lagts till.");
            
        jTFNamnLand.setText("");
        jTFSprakLand.setText("");
        jTFValutaLand.setText("");
        jTFTidszonLand.setText("");
        jTFPolitiskStrukturLand.setText("");
        jTFEkonomiLand.setText("");
        
        }catch(InfException e){
            System.out.println("Ett fel uppstod:" + e.getMessage() );
        }
        
    }//GEN-LAST:event_jBLaggTillLandActionPerformed

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
            java.util.logging.Logger.getLogger(LaggTillLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LaggTillLand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAvbryt;
    private javax.swing.JButton jBLaggTillLand;
    private javax.swing.JLabel jLEkonomiLand;
    private javax.swing.JLabel jLNamnLand;
    private javax.swing.JLabel jLPolitiskStrukturLand;
    private javax.swing.JLabel jLSprakLand;
    private javax.swing.JLabel jLTidszonLand;
    private javax.swing.JLabel jLValutaLand;
    private javax.swing.JLabel jLVemInlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFEkonomiLand;
    private javax.swing.JTextField jTFNamnLand;
    private javax.swing.JTextField jTFPolitiskStrukturLand;
    private javax.swing.JTextField jTFSprakLand;
    private javax.swing.JTextField jTFTidszonLand;
    private javax.swing.JTextField jTFValutaLand;
    // End of variables declaration//GEN-END:variables
}