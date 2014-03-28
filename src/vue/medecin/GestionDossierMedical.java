/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue.medecin;

import contrat.IDao;
import factory.FactoryDao;
import java.util.List;
import java.util.Vector;
import metier.patient.DossierMedical;
import metier.patient.DossierPatient;
import metier.personnel.Medecin;
import metier.personnel.Utilisateur;

/**
 *
 * @author SAMIA HOME
 */
public final class GestionDossierMedical extends javax.swing.JInternalFrame {

    private Medecin medecin; //Reutilisation des infos user
    private Vector p; 
    private DossierPatient dp; 
    private DossierMedical dm;
    
    /**
     * Creates new form GestionDossierMedical
     */
    public GestionDossierMedical(Medecin m) {
        initComponents();
        initListPatient(m); //Permet l'affichage de la liste
        this.setVisible(true);
    }
    
    public void initListPatient(Medecin m){
        this.jListPatient.clearSelection();
        //Reccuperation de l'ensemble des dossier Medicaux selon l'id de l'user
        IDao dao = FactoryDao.getDAO("DossierMedical");
        p = new Vector<>(dao.selectAll(m));
        
        this.jListPatient.setListData(p);   //Chargement de la liste

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPatient = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTTaille = new javax.swing.JTextField();
        jTPoids = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAllergies = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTContreI = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAntécédents = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTVaccins = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelDateNaissance = new javax.swing.JLabel();
        jLabelSexe = new javax.swing.JLabel();
        jBOrdonnance = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTHistorique = new javax.swing.JTable();
        jBDocument = new javax.swing.JButton();
        jLabelDateDuJour = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Dossier Medical");
        setAutoscrolls(true);

        jListPatient.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListPatient.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPatientValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListPatient);

        jLabel3.setText("Patient du :");

        jLabel4.setText("Taille");

        jLabel5.setText("Poids");

        jLabel6.setText("Allergies");

        jLabel7.setText("Antécédent");

        jLabel8.setText("Contre-Indications");

        jLabel9.setText("Etat des vaccins");

        jTAllergies.setColumns(20);
        jTAllergies.setRows(5);
        jScrollPane2.setViewportView(jTAllergies);

        jTContreI.setColumns(20);
        jTContreI.setRows(5);
        jScrollPane3.setViewportView(jTContreI);

        jTAntécédents.setColumns(20);
        jTAntécédents.setRows(5);
        jScrollPane4.setViewportView(jTAntécédents);

        jTVaccins.setColumns(20);
        jTVaccins.setRows(5);
        jScrollPane5.setViewportView(jTVaccins);

        jButton1.setText("Valider Modification");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBOrdonnance.setText("Creer Documents");
        jBOrdonnance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdonnanceActionPerformed(evt);
            }
        });

        jLabel14.setText("Historique du patient");

        jTHistorique.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Actes", "Dates"
            }
        ));
        jScrollPane6.setViewportView(jTHistorique);

        jBDocument.setText("Voir Documents");
        jBDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDocumentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDateDuJour)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelSexe)
                                            .addComponent(jLabelPrenom)
                                            .addComponent(jLabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDateNaissance))
                                        .addGap(658, 658, 658))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jBOrdonnance)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)))
                                                .addGap(70, 70, 70)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTTaille, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTPoids, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDateDuJour))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTTaille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNom))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTPoids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrenom))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBOrdonnance)
                                    .addComponent(jBDocument)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelDateNaissance)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelSexe))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(139, 139, 139))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel9)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOrdonnanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdonnanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBOrdonnanceActionPerformed

    private void jBDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDocumentActionPerformed

    private void jListPatientValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPatientValueChanged
        // TODO add your handling code here:

        DossierMedical dm = (DossierMedical) this.jListPatient.getSelectedValue(); //Reccupération de la valeur de l'élément séléctionner
        IDao daoA = FactoryDao.getDAO("DossierPatient"); //Appel de la daoDossierPattient via la factory
        
        dp = (DossierPatient) daoA.selectById(dm.getId_dossier_patient_dm()); //Reccupération dans une variable de type dossierPatient des infos

        this.jLabelNom.setText(dp.getNom());
        this.jLabelPrenom.setText(dp.getPrenom());
        this.jLabelDateNaissance.setText(dp.getDate_de_naissance());
        this.jLabelSexe.setText(dp.getSexe());    
        this.jTTaille.setText(dm.getTaille());
        this.jTPoids.setText(dm.getPoids());
        this.jTAllergies.setText(dm.getAllergie());
        this.jTAntécédents.setText(dm.getAntecedants());  
        this.jTContreI.setText(dm.getContres_indications());
        this.jTVaccins.setText(dm.getVaccins());

    }//GEN-LAST:event_jListPatientValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:*
         DossierMedical m = (DossierMedical) this.jListPatient.getSelectedValue();
         IDao daoA = FactoryDao.getDAO("DossierMedical");
         
            m.setTaille(jTTaille.getText());
            m.setPoids(jTPoids.getText());
            m.setAllergie(jTAllergies.getText());
            m.setAntecedants(jTAntécédents.getText());
            m.setContres_indications(jTContreI.getText());
            m.setVaccins(jTVaccins.getText());
            m.setId_dossier_medical(m.getId_dossier_medical());
            daoA.update(m); //Mise à jour des infos via la méthode update
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDocument;
    private javax.swing.JButton jBOrdonnance;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDateDuJour;
    private javax.swing.JLabel jLabelDateNaissance;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelSexe;
    private javax.swing.JList jListPatient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTAllergies;
    private javax.swing.JTextArea jTAntécédents;
    private javax.swing.JTextArea jTContreI;
    private javax.swing.JTable jTHistorique;
    private javax.swing.JTextField jTPoids;
    private javax.swing.JTextField jTTaille;
    private javax.swing.JTextArea jTVaccins;
    // End of variables declaration//GEN-END:variables
}
