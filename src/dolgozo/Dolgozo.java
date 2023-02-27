/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dolgozo;

import java.io.IOException;
import java.util.ArrayList;
import modell.Ember;
import modell.Modell;

/**
 *
 * @author dervalics.a.laszlo
 */
public class Dolgozo extends javax.swing.JFrame {

    private final static String FIU = "F";
    private final static String LANY = "L";

    ArrayList<Ember> emberek = new ArrayList<>();
    Modell modell = new Modell();

    public Dolgozo() throws IOException {
        initComponents();
        emberek = modell.EmberGeneralas();
        setComboBoxes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lanyComboBox = new javax.swing.JComboBox<>();
        fiuComboBox = new javax.swing.JComboBox<>();
        osszesitoPanel = new javax.swing.JPanel();
        oldestLabel = new javax.swing.JLabel();
        lanyRadioButton = new javax.swing.JRadioButton();
        sixYearLabel = new javax.swing.JLabel();
        fiuRadioButton = new javax.swing.JRadioButton();
        allAgeLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        dataPanel = new javax.swing.JPanel();
        ageLabel = new javax.swing.JLabel();
        workingSinceLabel = new javax.swing.JLabel();
        notBothCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dolgozók");

        jLabel1.setText("Lányok");

        jLabel2.setText("Fiúk");

        lanyComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lanyComboBoxItemStateChanged(evt);
            }
        });

        fiuComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fiuComboBoxItemStateChanged(evt);
            }
        });

        osszesitoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Összesítő"));

        oldestLabel.setText("legidősebb:");

        buttonGroup1.add(lanyRadioButton);
        lanyRadioButton.setText("lány");
        lanyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanyRadioButtonActionPerformed(evt);
            }
        });

        sixYearLabel.setText("6 éve dolgozó:");

        buttonGroup1.add(fiuRadioButton);
        fiuRadioButton.setText("fiú");
        fiuRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiuRadioButtonActionPerformed(evt);
            }
        });

        allAgeLabel.setText("összes kor:");

        javax.swing.GroupLayout osszesitoPanelLayout = new javax.swing.GroupLayout(osszesitoPanel);
        osszesitoPanel.setLayout(osszesitoPanelLayout);
        osszesitoPanelLayout.setHorizontalGroup(
            osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(osszesitoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(osszesitoPanelLayout.createSequentialGroup()
                        .addComponent(lanyRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiuRadioButton))
                    .addComponent(sixYearLabel)
                    .addComponent(allAgeLabel)
                    .addComponent(oldestLabel))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        osszesitoPanelLayout.setVerticalGroup(
            osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(osszesitoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lanyRadioButton)
                    .addComponent(fiuRadioButton))
                .addGap(18, 18, 18)
                .addComponent(oldestLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allAgeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sixYearLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        saveButton.setText("Ment");

        dataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Adatok"));

        ageLabel.setText("kor:");

        workingSinceLabel.setText("Mitóta dolgozik:");

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(workingSinceLabel))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ageLabel)
                .addGap(18, 18, 18)
                .addComponent(workingSinceLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        notBothCheckbox.setText("Mindkető nem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lanyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(osszesitoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notBothCheckbox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fiuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lanyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notBothCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton))
                    .addComponent(osszesitoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fiuRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiuRadioButtonActionPerformed
        int oldest = getOldest(FIU);
        int osszKor = korOsszeadas(FIU);
        String sixYears = getSixYear(FIU);
        setOldestLabel(oldest);
        setOsszKor(osszKor);
        setSixYearLabe(sixYears);
    }//GEN-LAST:event_fiuRadioButtonActionPerformed

    private void lanyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanyRadioButtonActionPerformed
        int oldest = getOldest(LANY);
        int osszKor = korOsszeadas(LANY);
        String sixYears = getSixYear(LANY);
        setOldestLabel(oldest);
        setOsszKor(osszKor);
        setSixYearLabe(sixYears);
    }//GEN-LAST:event_lanyRadioButtonActionPerformed

    private void lanyComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lanyComboBoxItemStateChanged
        String kivalasztott = (String)evt.getItem();
        Ember emberunk = wichEmber(kivalasztott);
        setAdatokPanel(emberunk.getKor(), emberunk.getMunkToltEv());
    }//GEN-LAST:event_lanyComboBoxItemStateChanged

    private void fiuComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fiuComboBoxItemStateChanged
        String kivalasztott = (String)evt.getItem();
        Ember emberunk = wichEmber(kivalasztott);
        setAdatokPanel(emberunk.getKor(), emberunk.getMunkToltEv());
    }//GEN-LAST:event_fiuComboBoxItemStateChanged

    private Ember wichEmber(String kivalasztott){
        Ember kivalsaztottEmber = null;
        
        for (Ember ember : emberek) {
            if(ember.getNev() == kivalasztott){
                kivalsaztottEmber = ember;
            }
        }
        
        return kivalsaztottEmber;
    }
    
    private void setOsszKor(int osszKor) {
        allAgeLabel.setText(
                "összes kor: " + osszKor
        );
    }

    private void setOldestLabel(int oldestAge) {
        oldestLabel.setText(
                "legidősebb: " + oldestAge
        );
    }

    private void setSixYearLabe(String sixYearStatus) {
        sixYearLabel.setText(
                "6 éve dolgozó: " + sixYearStatus
        );
    }

    private int korOsszeadas(String nem) {
        int osszesen = 0;
        for (Ember ember : emberek) {
            if (ember.getNeme().equals(nem)) {
                osszesen += ember.getKor();
            }
        }

        return osszesen;
    }

    private int getOldest(String nem) {
        int oldest = emberek.get(0).getKor();

        for (Ember ember : emberek) {
            if (ember.getNeme().equals(nem)) {
                if (ember.getKor() > oldest) {
                    oldest = ember.getKor();
                }
            }
        }

        return oldest;
    }

    private String getSixYear(String nem) {
        String workingForSixYear = "nincs";

        for (Ember ember : emberek) {
            if (ember.getNeme().equals(nem)) {
                if (ember.getMunkToltEv() >= 6) {
                    workingForSixYear = ember.getNev();
                }
            }
        }

        return workingForSixYear;
    }
    
    private void setComboBoxes(){
        for (Ember ember : emberek) {
            if (ember.getNeme().equals(FIU)) {
                fiuComboBox.addItem(ember.getNev());
            }else{
                lanyComboBox.addItem(ember.getNev());
            }
        }
        fiuComboBox.setSelectedIndex(-1);
        lanyComboBox.setSelectedIndex(-1);
    }
    
    private void setAdatokPanel(int kor, int dolgozottEv){
        setAgeLabel(kor);
        setWorkedHere(dolgozottEv);
    }

    
    private void setAgeLabel(int kor) {
        ageLabel.setText(
                "kor: " + kor + " év"
        );
    }
    
    private void setWorkedHere(int dolgozottEv) {
        workingSinceLabel.setText(
                "mióta dolgozik: " + dolgozottEv + " éve"
        );
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel allAgeLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JComboBox<String> fiuComboBox;
    private javax.swing.JRadioButton fiuRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> lanyComboBox;
    private javax.swing.JRadioButton lanyRadioButton;
    private javax.swing.JCheckBox notBothCheckbox;
    private javax.swing.JLabel oldestLabel;
    private javax.swing.JPanel osszesitoPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sixYearLabel;
    private javax.swing.JLabel workingSinceLabel;
    // End of variables declaration//GEN-END:variables
}
