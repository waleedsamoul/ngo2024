/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.DefaultListModel;
;
/**
 *
 * @author User
 */
public class AvdelningHandlaggare extends javax.swing.JFrame {
    
    private InfDB idb;
    private String InloggadAnvandare;
    private DefaultComboBoxModel<String> comboBoxModel;
    private ArrayList<String> projektAvdelning;
    private DefaultListModel<String> listModel;
    private String avdelning;
    private ArrayList<String> forNamnPaAvdelning;
  


  
    /**
     * Creates new form AvdelningHandlaggare
     */
    public AvdelningHandlaggare(InfDB idb, String InloggadAnvandare) {
        
      this.idb = idb;
      this.InloggadAnvandare = InloggadAnvandare;
      avdelning = ProjektBakgrund.getAvdelning(InloggadAnvandare);
      projektAvdelning = ProjektBakgrund.getProjektListaAvdelning(avdelning);
        initComponents();
        lblInloggad.setText(InloggadAnvandare);
        listModel = new DefaultListModel<>();
        comboBoxModel = new DefaultComboBoxModel<>();


        projektPaAvdelning.setModel(comboBoxModel);
        forNamnPaAvdelning = ProjektBakgrund.getPersonalForNamnPåAvdelning(avdelning);
        jListPersonal.setModel(listModel);
       
        for(String forNamn :forNamnPaAvdelning){
            listModel.addElement(forNamn);
            }
            
        
        for(String namn: projektAvdelning){
            System.out.println("Lägger till: " + namn);
        comboBoxModel.addElement(namn);
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

        lbAvdelningHandlaggare = new javax.swing.JLabel();
        projektPaAvdelning = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAvdProjektPid = new javax.swing.JLabel();
        lblAvdProjektNamn = new javax.swing.JLabel();
        lblAvdProjektBeskrivning = new javax.swing.JLabel();
        avdAvdProjektStart = new javax.swing.JLabel();
        lblAvdProjektSlut = new javax.swing.JLabel();
        lblAvdProjektKostnad = new javax.swing.JLabel();
        lblAvdStatus = new javax.swing.JLabel();
        lblAvdPrioritet = new javax.swing.JLabel();
        lblAvdProjektchef = new javax.swing.JLabel();
        lblAvdLand = new javax.swing.JLabel();
        tftSokOrd = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPersonal = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        btnAngraSok = new javax.swing.JButton();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        tftSokDatum = new javax.swing.JTextField();
        btnSokDatum = new javax.swing.JButton();
        btnAngraDatum = new javax.swing.JButton();
        tftSokDatumSlut = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        lblInloggad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAvdelningHandlaggare.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbAvdelningHandlaggare.setText("Avdelning");

        projektPaAvdelning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        projektPaAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektPaAvdelningActionPerformed(evt);
            }
        });

        jLabel1.setText("pid:");

        jLabel2.setText("Projektnamn:");

        jLabel3.setText("Beskrivning:");

        jLabel4.setText("Startdatum:");

        jLabel5.setText("Slutdatum:");

        jLabel6.setText("Kostand:");

        jLabel7.setText("Status:");

        jLabel8.setText("Prioritet:");

        jLabel9.setText("Projektchef:");

        jLabel10.setText("Land:");

        lblAvdProjektPid.setText("jLabel11");

        lblAvdProjektNamn.setText("jLabel12");

        lblAvdProjektBeskrivning.setText("jLabel13");

        avdAvdProjektStart.setText("jLabel14");

        lblAvdProjektSlut.setText("jLabel15");

        lblAvdProjektKostnad.setText("jLabel16");

        lblAvdStatus.setText("jLabel17");

        lblAvdPrioritet.setText("jLabel18");

        lblAvdProjektchef.setText("jLabel19");

        lblAvdLand.setText("jLabel20");

        tftSokOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftSokOrdActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Sök");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jListPersonal.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListPersonal);

        jLabel11.setText("Kollegor på din avdelning");

        btnAngraSok.setText("Ångra");
        btnAngraSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngraSokActionPerformed(evt);
            }
        });

        check1.setText("Pågående");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        check2.setText("Planerade");
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });

        check3.setText("Avslutade");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        btnSokDatum.setText("Sök");
        btnSokDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokDatumActionPerformed(evt);
            }
        });

        btnAngraDatum.setText("Ångra");
        btnAngraDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngraDatumActionPerformed(evt);
            }
        });

        jLabel12.setText("Startdatum");

        jLabel13.setText("Slutdatum");

        jToggleButton2.setText("Tillbaka");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Inloggad som:");

        lblInloggad.setText("Eposten står här");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAvdelningHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInloggad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAvdLand)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblAvdProjektBeskrivning)
                                                        .addComponent(lblAvdProjektPid)
                                                        .addComponent(lblAvdProjektNamn))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(check3)
                                                        .addComponent(check2)
                                                        .addComponent(check1))
                                                    .addGap(44, 44, 44))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel12)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel13))
                                                            .addComponent(lblAvdStatus)
                                                            .addComponent(lblAvdProjektKostnad)
                                                            .addComponent(lblAvdProjektSlut)
                                                            .addComponent(avdAvdProjektStart))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(tftSokDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(tftSokDatumSlut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btnSokDatum)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btnAngraDatum)))
                                                    .addGap(36, 36, 36)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblAvdProjektchef)
                                                    .addComponent(lblAvdPrioritet))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tftSokOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnAngraSok))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1))))))
                            .addComponent(projektPaAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAvdelningHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2)
                    .addComponent(jLabel14)
                    .addComponent(lblInloggad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSokDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(projektPaAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tftSokDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAngraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tftSokDatumSlut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAvdProjektPid)
                    .addComponent(check1)
                    .addComponent(tftSokOrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngraSok, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblAvdProjektNamn)
                            .addComponent(check2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblAvdProjektBeskrivning)
                            .addComponent(check3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(avdAvdProjektStart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblAvdProjektSlut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblAvdProjektKostnad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblAvdStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblAvdPrioritet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblAvdProjektchef)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblAvdLand))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projektPaAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projektPaAvdelningActionPerformed
     String valtObjekt = (String) projektPaAvdelning.getSelectedItem();
     lblAvdProjektPid.setText(ProjektBakgrund.getPid(valtObjekt));
   lblAvdProjektNamn.setText(valtObjekt);
   lblAvdProjektBeskrivning.setText(ProjektBakgrund.getBeskrivning(valtObjekt));
   avdAvdProjektStart.setText(ProjektBakgrund.getStartDatum(valtObjekt));
   lblAvdProjektSlut.setText(ProjektBakgrund.getSlutDatum(valtObjekt));
   lblAvdProjektKostnad.setText(ProjektBakgrund.getKostand(valtObjekt));
   lblAvdStatus.setText(ProjektBakgrund.getStatus(valtObjekt));
   lblAvdPrioritet.setText(ProjektBakgrund.getPrioritet(valtObjekt));
   lblAvdProjektchef.setText(ProjektBakgrund.getProjektChef(valtObjekt));
   lblAvdLand.setText(ProjektBakgrund.getLand(valtObjekt));
     
    }//GEN-LAST:event_projektPaAvdelningActionPerformed

    private void tftSokOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftSokOrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftSokOrdActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      String sokOrd = tftSokOrd.getText();
      DefaultListModel<String> listModel2 = new DefaultListModel<>();
      boolean hittad = false;
      for (int i = 0; i < listModel.getSize(); i++) {
            if (listModel.getElementAt(i).equals(sokOrd) ||  listModel.getElementAt(i).equals(AnstallBakgrund.getFornamn(sokOrd))){
                String laggsTill = listModel.getElementAt(i);
                
                 listModel2.addElement(laggsTill);      
                jListPersonal.setModel(listModel2);
                hittad = true;
            }
      }
      if(!hittad){
          tftSokOrd.setText("Kunde inte hitta handläggaren");
      }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnAngraSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngraSokActionPerformed
      jListPersonal.setModel(listModel);
    }//GEN-LAST:event_btnAngraSokActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
     DefaultComboBoxModel<String> modelErsatt = new DefaultComboBoxModel<>();
        if(check1.isSelected() == true){
            check2.setSelected(false);
            check3.setSelected(false);
         for(int i = 0; i < comboBoxModel.getSize(); i++){
             String projektNamn = comboBoxModel.getElementAt(i);
             System.out.println(ProjektBakgrund.getStatus(projektNamn));
             if(!ProjektBakgrund.getStatus(projektNamn).equals("Avslutat") && !ProjektBakgrund.getStatus(projektNamn).equals("Planerat")){
                 modelErsatt.addElement(projektNamn);    
             }
         }
         if(modelErsatt.getSize() > 0){
             projektPaAvdelning.setModel(modelErsatt);
                      }
          
      }
        
                    
    }//GEN-LAST:event_check1ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
      DefaultComboBoxModel<String> modelErsatt = new DefaultComboBoxModel<>();
        if(check2.isSelected() == true){
            check1.setSelected(false);
            check3.setSelected(false);
         for(int i = 0; i < comboBoxModel.getSize(); i++){
             String projektNamn = comboBoxModel.getElementAt(i);
             System.out.println(ProjektBakgrund.getStatus(projektNamn));
             if(ProjektBakgrund.getStatus(projektNamn).equals("Planerat")){
                 modelErsatt.addElement(projektNamn);    
             }
         }
         if(modelErsatt.getSize() > 0){
             projektPaAvdelning.setModel(modelErsatt);
                      }
          
      }
        else{
            checkboxcheck();
        }
    }//GEN-LAST:event_check2ActionPerformed
private void checkboxcheck(){
    if (!check2.isSelected() && !check2.isSelected() && !check3.isSelected()) {
   projektPaAvdelning.setModel(comboBoxModel);
    }
}
    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
    DefaultComboBoxModel<String> modelErsatt = new DefaultComboBoxModel<>();
        if(check3.isSelected() == true){
            check1.setSelected(false);
            check2.setSelected(false);
         for(int i = 0; i < comboBoxModel.getSize(); i++){
             String projektNamn = comboBoxModel.getElementAt(i);
             System.out.println(ProjektBakgrund.getStatus(projektNamn));
             if(ProjektBakgrund.getStatus(projektNamn).equals("Avslutat")){
                 modelErsatt.addElement(projektNamn);    
             }
         }
         if(modelErsatt.getSize() > 0){
             projektPaAvdelning.setModel(modelErsatt);
                      }
          
      }
        else{
            checkboxcheck();
        }
    }//GEN-LAST:event_check3ActionPerformed

    private void btnAngraDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngraDatumActionPerformed
      projektPaAvdelning.setModel(comboBoxModel);
    }//GEN-LAST:event_btnAngraDatumActionPerformed

    private void btnSokDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokDatumActionPerformed
       // lagg till validering
        
       String sokDatum = tftSokDatum.getText();
       String sokDatumSlut = tftSokDatumSlut.getText();
       int sokDatumint = Integer.parseInt(sokDatum);
       int sokDatumSlutInt = Integer.parseInt(sokDatumSlut);
       DefaultComboBoxModel<String> modelErsatt = new DefaultComboBoxModel<>();
       boolean hittad = false;
       for(int i = 0; i < comboBoxModel.getSize(); i++){
             String projektNamn = comboBoxModel.getElementAt(i);
             
             String hamtatStart = ProjektBakgrund.getStartDatum(projektNamn);
             String hamtatSlut = ProjektBakgrund.getSlutDatum(projektNamn);
             System.out.println(hamtatStart + " " + hamtatSlut);
             
             String hamtatStart2 = hamtatStart.replace("-", "").replaceAll("[\\p{C}\\p{Z}]+", "");
             String hamtatSlut2 = hamtatSlut.replace("-", "").replaceAll("[\\p{C}\\p{Z}]+", "");
             System.out.println(hamtatStart2 + " " + hamtatSlut2);
             
           
             
             int hamtatStartInt = Integer.parseInt(hamtatStart2);
             int hamtatSlutInt = Integer.parseInt(hamtatSlut2);
             System.out.println(hamtatStartInt +" "+ hamtatSlutInt);
             
             if(hamtatStartInt <= sokDatumint && hamtatSlutInt >= sokDatumSlutInt){
                  modelErsatt.addElement(projektNamn);                
                 
                 hittad = true;
             }
             }
       if(hittad){
           projektPaAvdelning.setModel(modelErsatt);
       }
       
       System.out.println(hittad);
       
       
    }//GEN-LAST:event_btnSokDatumActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new HandlaggarMeny(idb, InloggadAnvandare).setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AvdelningHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvdelningHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvdelningHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvdelningHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
    }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avdAvdProjektStart;
    private javax.swing.JButton btnAngraDatum;
    private javax.swing.JButton btnAngraSok;
    private javax.swing.JButton btnSokDatum;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListPersonal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lbAvdelningHandlaggare;
    private javax.swing.JLabel lblAvdLand;
    private javax.swing.JLabel lblAvdPrioritet;
    private javax.swing.JLabel lblAvdProjektBeskrivning;
    private javax.swing.JLabel lblAvdProjektKostnad;
    private javax.swing.JLabel lblAvdProjektNamn;
    private javax.swing.JLabel lblAvdProjektPid;
    private javax.swing.JLabel lblAvdProjektSlut;
    private javax.swing.JLabel lblAvdProjektchef;
    private javax.swing.JLabel lblAvdStatus;
    private javax.swing.JLabel lblInloggad;
    private javax.swing.JComboBox<String> projektPaAvdelning;
    private javax.swing.JTextField tftSokDatum;
    private javax.swing.JTextField tftSokDatumSlut;
    private javax.swing.JTextField tftSokOrd;
    // End of variables declaration//GEN-END:variables
}
