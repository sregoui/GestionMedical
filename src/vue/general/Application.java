/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue.general;

import contrat.IDao;
import factory.FactoryDao;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.personnel.Admin;
import metier.personnel.Dentiste;
import metier.personnel.Generaliste;
import metier.personnel.Medecin;
import metier.personnel.Radiologue;
import metier.personnel.Secretaire;
import metier.personnel.Utilisateur;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import vue.medecin.FactureFrame;
import vue.medecin.FrameGenerique;
import vue.medecin.GestionDossierMedical;
import vue.medecin.GestionDocument;

/**
 *
 * @author Samia
 */
public class Application extends javax.swing.JFrame {
    private List listeUtilisateur; 
    private String userText; 
    private String mdpText;
    private Utilisateur u; 
    private Medecin m;
    private Generaliste g;
    private Dentiste d;
    private Radiologue r;
    private Secretaire s;
    private Admin a;
    private static IDao dao;
    private static List l;

    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
        this.menuBar.setVisible(false); // n'affiche pas le menu pendant l'authentification
        this.jButton5.setVisible(false);
        this.jButton1.setVisible(false);
        this.jButton2.setVisible(false);
        this.jButton3.setVisible(false);
        this.ItemGererDossierMedical2.setVisible(false);
       
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
        jBconnection = new javax.swing.JButton();
        jLmessage = new javax.swing.JLabel();
        jTpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ItemGererDossierMedical2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        SecretaireMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        MedecinMenu = new javax.swing.JMenu();
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
                                    .addComponent(jTpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jBconnection)
                .addGap(13, 13, 13)
                .addComponent(jLmessage)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        desktopPane.add(jInternalFrame1);
        jInternalFrame1.setBounds(520, 220, 250, 190);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facture.png"))); // NOI18N
        jButton1.setText("FACTURE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(0, 80, 170, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medoc.png"))); // NOI18N
        jButton2.setText("MEDICAMENT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton2);
        jButton2.setBounds(0, 160, 170, 80);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caduccee.png"))); // NOI18N
        jButton3.setText("UTILITAIRES");
        desktopPane.add(jButton3);
        jButton3.setBounds(0, 320, 170, 80);

        ItemGererDossierMedical2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trousse.png"))); // NOI18N
        ItemGererDossierMedical2.setText("DOSSIER ");
        ItemGererDossierMedical2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGererDossierMedical2ActionPerformed(evt);
            }
        });
        desktopPane.add(ItemGererDossierMedical2);
        ItemGererDossierMedical2.setBounds(0, 0, 170, 80);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doc.png"))); // NOI18N
        jButton5.setText("DOCUMENT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton5);
        jButton5.setBounds(0, 240, 170, 80);

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

        MedecinMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clients.png"))); // NOI18N
        MedecinMenu.setMnemonic('e');
        MedecinMenu.setText("Medecin");
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
        
        
        /**
         * Après le clic sur le bouton se connecter
         */
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
                u = new Utilisateur(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                jLmessage.setText("Authentification réussie");

                this.jInternalFrame1.setVisible(false);
                this.menuBar.setVisible(true);
                
                //Menu selon le role de l'utilisateur
                    switch (u.getId_role()){
                    case 1://Cas d'un admin(DIRECTEUR)
                        a = new Admin(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        this.MedecinMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.RadiologieMenu.setVisible(false);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.DentisteMenu.setVisible(false);
                        this.AdminMenu.setVisible(true);
                        this.jButton5.setVisible(false);
                        this.jButton1.setVisible(false);
                        this.jButton2.setVisible(false);
                        this.jButton3.setVisible(false);
                        this.ItemGererDossierMedical2.setVisible(false);
                    break;
                    case 2://Cas d'une secretaire
                        s = new Secretaire(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        this.MedecinMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(true);
                        this.RadiologieMenu.setVisible(false);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.DentisteMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                        this.jButton5.setVisible(false);
                        this.jButton1.setVisible(false);
                        this.jButton2.setVisible(false);
                        this.jButton3.setVisible(false);
                        this.ItemGererDossierMedical2.setVisible(false);
                    break;
                    case 3://Cas d'un generaliste
                        m = new Medecin(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        g = new Generaliste(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        this.MedecinMenu.setVisible(true);
                        this.GeneralisteMenu.setVisible(true);
                        this.DentisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                        this.RadiologieMenu.setVisible(false);
                        this.jButton5.setVisible(true);
                        this.jButton1.setVisible(true);
                        this.jButton2.setVisible(true);
                        this.jButton3.setVisible(true);
                        this.ItemGererDossierMedical2.setVisible(true);
                    break;
                    case 4://Cas d'un Dentiste
                        m = new Medecin(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        d = new Dentiste(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        this.MedecinMenu.setVisible(true);
                        this.DentisteMenu.setVisible(true);
                        this.RadiologieMenu.setVisible(false);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                        this.jButton5.setVisible(true);
                        this.jButton1.setVisible(true);
                        this.jButton2.setVisible(true);
                        this.jButton3.setVisible(true);
                        this.ItemGererDossierMedical2.setVisible(true);
                    break;
                    case 5://Cas d'un Radiologue
                        m = new Medecin(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        r = new Radiologue(u.getId(),u.getLogin(),u.getPassword(),u.getId_role(),u.getNom(),u.getPrenom(),u.getEmail(),u.getTelPort(),u.getTelFixe());
                        this.MedecinMenu.setVisible(true);
                        this.RadiologieMenu.setVisible(true);
                        this.GeneralisteMenu.setVisible(false);
                        this.ChirurgienMenu.setVisible(false);
                        this.DentisteMenu.setVisible(false);
                        this.SecretaireMenu.setVisible(false);
                        this.AdminMenu.setVisible(false);
                        this.jButton5.setVisible(true);
                        this.jButton1.setVisible(true);
                        this.jButton2.setVisible(true);
                        this.jButton3.setVisible(true);
                        this.ItemGererDossierMedical2.setVisible(true);
                    break;
                    default:
                    break;
                    }
            break;
            }else{
                jLmessage.setText("Authentification ratée");
            }
        }
        
                
        try {         
         // --- Partie 1 : Creation du DOM en memoire
         org.jdom2.Document arbreDom = new org.jdom2.Document(new Element("racine"));

         // --- Partie 2 : fermeture ou Output (dom2fichier)
         // --- Ecriture sur le DD dans le document XML
         // --- du contenu de l'arbre DOM qui est en RAM        
         
                  // --- Les variables
         String lsFichier  = "infos.xml";
         SAXBuilder sxb    = new SAXBuilder();
         Element racine    = new Element("Contact");


         XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
         sortie.output(arbreDom, new FileOutputStream(lsFichier));
         
         arbreDom = sxb.build(new File(lsFichier));
         
         // --- Recuperation de l'element racine
         racine = arbreDom.getRootElement();
         

         dao = FactoryDao.getDAO("Utilisateur");
         Utilisateur user = (Utilisateur) dao.selectById(u.getId());

            
         Element userBalise = new Element("utilisateur");
         userBalise.setAttribute("id", String.valueOf(user.getId()));
            
         Element nom           = new Element("nom");
         nom.setText(user.getNom());
         Element prenom          = new Element("prenom");
         prenom.setText(user.getPrenom());
         Element tel_port         = new Element("tel_port");
         tel_port.setText(user.getTelPort());
         Element tel_fixe          = new Element("tel_fixe");
         tel_fixe.setText(user.getTelFixe());
         Element email          = new Element("email");
         email.setText(user.getEmail());
         
         userBalise.addContent(nom);
         userBalise.addContent(prenom);
         userBalise.addContent(tel_port);
         userBalise.addContent(tel_fixe);
         userBalise.addContent(email);
         racine.addContent(userBalise);
            


         // --- Partie 3 : fermeture ou Output (dom2fichier)
         // --- Ecriture sur le DD dans le document XML
         // --- du contenu de l'arbre DOM qui est en RAM
         XMLOutputter sortie2 = new XMLOutputter(Format.getPrettyFormat());
         sortie.output(arbreDom, new FileOutputStream(lsFichier));

         System.out.println("Article ajouté");

      } // FIN TRY

      catch (Exception e) {
         System.err.println(e.getMessage());
      }
            
        
        
        
    }//GEN-LAST:event_jBconnectionActionPerformed

    private void ItemGererDossierMedical2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGererDossierMedical2ActionPerformed

        //On va reccuperer l'InternalFrame GestionDossierMedical lors du clic
        this.internalFrameGestionMedical = new GestionDossierMedical(m);
        this.desktopPane.add(this.internalFrameGestionMedical);
        internalFrameGestionMedical.setTitle("Gestion des Patients");
    }//GEN-LAST:event_ItemGererDossierMedical2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //On va reccuperer l'InternalFrame VoirDocument lors du clic
        this.internalVoirDocument = new GestionDocument(m);
        this.desktopPane.add(this.internalVoirDocument);
        internalVoirDocument.setTitle("Gestion des Document");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //On va reccuperer l'InternalFrame Facture lors du clic
        this.internalFacture = new FactureFrame(m);
        this.desktopPane.add(this.internalFacture);
        internalFacture.setTitle("Facture");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            //On va reccuperer l'InternalFrame FrameGenerique lors du clic
            this.internalFrameMedicament = new FrameGenerique("Medicament");
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPane.add(this.internalFrameMedicament);
       internalFrameMedicament.setTitle("Medicament");
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton ItemGererDossierMedical2;
    private javax.swing.JMenu MedecinMenu;
    private javax.swing.JMenu RadiologieMenu;
    private javax.swing.JMenu SecretaireMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jBconnection;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLmessage;
    private javax.swing.JTextField jTUser;
    private javax.swing.JPasswordField jTpassword;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

private GestionDossierMedical internalFrameGestionMedical;
private FrameGenerique internalFrameMedicament;
private GestionDocument internalVoirDocument;
private FactureFrame internalFacture;
}
