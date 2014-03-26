/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue.general;

import contrat.IDao;
import factory.FactoryDao;
import java.util.List;
import metier.personnel.Utilisateur;
import vue.medecin.GestionDossierMedical;

/**
 *
 * @author Samia
 */
public class Application extends javax.swing.JFrame {
    private List listeUtilisateur; 
    private String userText; 
    private String mdpText;
    private Utilisateur u; 

    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
        this.menuBar.setVisible(false); // n'affiche pas le menu pendant l'authentification
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTUser = new javax.swing.JTextField();
        jTpassword = new javax.swing.JTextField();
        jBconnection = new javax.swing.JButton();
        jLmessage = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        SecretaireMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        MedecinMenu = new javax.swing.JMenu();
        ItemGererDossierMedical = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        AdminMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        RadiologieMenu = new javax.swing.JMenu();
        DentisteMenu = new javax.swing.JMenu();
        GeneralisteMenu = new javax.swing.JMenu();
        ChirurgienMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Authentification");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("user");

        jLabel2.setText("password");

        jTpassword.setToolTipText("");

        jBconnection.setText("Se Connecter");
        jBconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconnectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLmessage))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBconnection)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTUser, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(jTpassword))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBconnection)
                .addGap(13, 13, 13)
                .addComponent(jLmessage)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        desktopPane.add(jInternalFrame1);
        jInternalFrame1.setBounds(520, 220, 250, 190);

        SecretaireMenu.setMnemonic('f');
        SecretaireMenu.setText("Secretaire");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Gerer DossierAdministratif");
        SecretaireMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Gestion Paiement");
        SecretaireMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Gerer Rdz");
        SecretaireMenu.add(saveAsMenuItem);

        menuBar.add(SecretaireMenu);

        MedecinMenu.setMnemonic('e');
        MedecinMenu.setText("Medecin");

        ItemGererDossierMedical.setMnemonic('t');
        ItemGererDossierMedical.setText("Gerer Dossier Medical");
        ItemGererDossierMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGererDossierMedicalActionPerformed(evt);
            }
        });
        MedecinMenu.add(ItemGererDossierMedical);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Gerer ses factures");
        MedecinMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Voir Médicaments");
        MedecinMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Creer Documents");
        MedecinMenu.add(deleteMenuItem);

        menuBar.add(MedecinMenu);

        AdminMenu.setMnemonic('h');
        AdminMenu.setText("Directeur");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Statistique");
        AdminMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Gestion Personnel");
        AdminMenu.add(aboutMenuItem);

        menuBar.add(AdminMenu);

        RadiologieMenu.setText("Radiologie");
        menuBar.add(RadiologieMenu);

        DentisteMenu.setText("Dentiste");
        menuBar.add(DentisteMenu);

        GeneralisteMenu.setText("Generaliste");
        menuBar.add(GeneralisteMenu);

        ChirurgienMenu.setText("Chirurgien");
        menuBar.add(ChirurgienMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBconnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconnectionActionPerformed

       
        IDao dao = FactoryDao.getDAO("Utilisateur"); //Appel de la factory pour reccuperer le DaoUtilisateur
        listeUtilisateur = dao.selectAll(); //Reccupération d'un type liste via la méthode selectAll (ensemble des users)
        userText = this.jTUser.getText();//Reccupération des champs saisies
        mdpText = this.jTpassword.getText();

        /**
         * Authentification en bouclant sur la liste d'utilisateur
         */      
        for(Object o: listeUtilisateur){
            u = (Utilisateur) o;

            if(u.getLogin().equals(userText) && u.getPassword().equals(mdpText))
            {
                jLmessage.setText("Authentification réussie");

                this.jInternalFrame1.setVisible(false);
                this.menuBar.setVisible(true);
                
                    switch (u.getId_role()){
                    case 1://Cas d'un admin(DIRECTEUR)
                        this.MedecinMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.RadiologieMenu.setVisible(false);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.DentisteMenu.setVisible(false);
                        this.AdminMenu.setVisible(true);
                    break;
                    case 2://Cas d'une secretaire
                        this.MedecinMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(true);
                        this.RadiologieMenu.setVisible(false);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.DentisteMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                    break;
                    case 3://Cas d'un generaliste
                        this.MedecinMenu.setVisible(true);
                        this.GeneralisteMenu.setVisible(true);
                        this.RadiologieMenu.setVisible(false);
                        this.DentisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                    break;
                    case 4://Cas d'un Dentiste
                        this.MedecinMenu.setVisible(true);
                        this.DentisteMenu.setVisible(true);
                        this.RadiologieMenu.setVisible(false);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                    break;
                    case 5://Cas d'un Radiologue
                        this.MedecinMenu.setVisible(true);
                        this.RadiologieMenu.setVisible(true);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.DentisteMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                    break;
                    default:
                    break;
                    }
            }else{
                jLmessage.setText("Authentification ratée");
            }
        }
    }//GEN-LAST:event_jBconnectionActionPerformed

    private void ItemGererDossierMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGererDossierMedicalActionPerformed
        // TODO add your handling code here:
        this.internalFrameGestionMedical = new GestionDossierMedical();
        internalFrameGestionMedical.setTitle("Gestion User");
        this.desktopPane.add(this.internalFrameGestionMedical);
        internalFrameGestionMedical.setTitle("Gestion des Patients");
    }//GEN-LAST:event_ItemGererDossierMedicalActionPerformed

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdminMenu;
    private javax.swing.JMenu ChirurgienMenu;
    private javax.swing.JMenu DentisteMenu;
    private javax.swing.JMenu GeneralisteMenu;
    private javax.swing.JMenuItem ItemGererDossierMedical;
    private javax.swing.JMenu MedecinMenu;
    private javax.swing.JMenu RadiologieMenu;
    private javax.swing.JMenu SecretaireMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jBconnection;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLmessage;
    private javax.swing.JTextField jTUser;
    private javax.swing.JTextField jTpassword;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
private GestionDossierMedical internalFrameGestionMedical;
}
