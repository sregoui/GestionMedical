/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue.medecin;


import XML.UserParser;
import contrat.IDao;
import dao.DaoDocument;
import dao.DaoMedicament;
import factory.FactoryDao;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import metier.patient.Document;
import metier.personnel.Medecin;
import org.xml.sax.SAXException;

/**
 *
 * @author SAMIA HOME
 */
public class GestionDocument extends javax.swing.JInternalFrame implements DocumentListener {
    
    private Medecin medecin;
    private static final String COMMIT_ACTION = "commit";
    private static enum Mode { INSERT, COMPLETION };
    private final List<String> words;

    private Mode mode = Mode.INSERT;
    
    /**
     * Creates new form CreerDocument
     * @param m
     */
    public GestionDocument(Medecin m) {

        initComponents();
        
        textArea.getDocument().addDocumentListener(this);
         
        InputMap im = textArea.getInputMap();
        ActionMap am = textArea.getActionMap();
        im.put(KeyStroke.getKeyStroke("ENTER"), COMMIT_ACTION);
        am.put(COMMIT_ACTION, new GestionDocument.CommitAction());
        initList();
        this.setVisible(true);
        medecin = m;
        //IDao dao = FactoryDao.getDAO("Medicament"); //Appel de la factory pour reccuperer le DaoUtilisateur
       DaoMedicament dao = new DaoMedicament();
       words = dao.selectAll2(); //Reccupération d'un type liste via la méthode selectAll (ensemble des users)
        System.out.println(words);

    }

        public void initList(){
        
     DaoDocument daoA = new DaoDocument();
     List lDoc = daoA.selectAllTypeDoc();  

      for(Object o: lDoc){
            Document doc = (Document) o;
            this.dcmDor.addElement(doc);          
        }          
       
     this.jComboBox1.setModel(dcmDor);

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
        textArea = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Document Type");

        jButton1.setText("Imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sauvegarder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 551, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
 
 //Si la combobox est un arret maladie
 if(jComboBox1.getSelectedIndex() == 1){
        try {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
            
        UserParser userParser = new UserParser();
        // Reccuperer infos pour l'arret maladie
        parser.parse("infos.xml", userParser);
        
        
        
             //Affiche les infos dans le TextArea, Persistance de l'info
        String infoUser = "Docteur "+medecin.getNom();     
        infoUser+= " "+medecin.getPrenom();     
        infoUser += "\n "+medecin.getTelFixe();
        infoUser += "\n "+medecin.getTelPort();     
        infoUser += "\n "+medecin.getEmail();      
        textArea.setText(infoUser);  

            
        } catch (SAXException ex) {
            Logger.getLogger(GestionDocument.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionDocument.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(GestionDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 
 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Permet d'imprimer le document
        try {
            // TODO add your handling code here:
            textArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(GestionDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser saver = new JFileChooser("c:/");  
        //saver.setFileFilter(new Text_Filter());  
        int returnVal = saver.showSaveDialog(this);  
        File file = saver.getSelectedFile();  
        BufferedWriter writer = null;  
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
            try  
            {  
            writer = new BufferedWriter( new FileWriter( file.getName()+".txt"));  
            writer.write(textArea.getText());  
            writer.close( );  
            JOptionPane.showMessageDialog(this, "Le document à été sauvegarder!",  
                        "Success!", JOptionPane.INFORMATION_MESSAGE);  
            }  
            catch (IOException e)  
            {  
            JOptionPane.showMessageDialog(this, "Echec lors de la sauvegarde!",  
                        "Error!", JOptionPane.INFORMATION_MESSAGE);  
            }  
        }  

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

       // Listener methods
     
    public void changedUpdate(DocumentEvent ev) {
    }
     
    public void removeUpdate(DocumentEvent ev) {
    }
     
    public void insertUpdate(DocumentEvent ev) {
        if (ev.getLength() != 1) {
            return;
        }
         
        int pos = ev.getOffset();
        String content = null;
        try {
            content = textArea.getText(0, pos + 1);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
         
        // Find where the word starts
        int w;
        for (w = pos; w >= 0; w--) {
            if (! Character.isLetter(content.charAt(w))) {
                break;
            }
        }
        if (pos - w < 2) {
            // Too few chars
            return;
        }
         
        String prefix = content.substring(w + 1).toLowerCase();
        int n = Collections.binarySearch(words, prefix);
        if (n < 0 && -n <= words.size()) {
            String match = words.get(-n - 1);
            if (match.startsWith(prefix)) {
                // A completion is found
                String completion = match.substring(pos - w);
                // We cannot modify Document from within notification,
                // so we submit a task that does the change later
                SwingUtilities.invokeLater(
                        new CompletionTask(completion, pos + 1));
            }
        } else {
            // Nothing found
            mode = GestionDocument.Mode.INSERT;
        }
    }
     
    private class CompletionTask implements Runnable {
        String completion;
        int position;
         
        CompletionTask(String completion, int position) {
            this.completion = completion;
            this.position = position;
        }
         
        public void run() {
            textArea.insert(completion, position);
            textArea.setCaretPosition(position + completion.length());
            textArea.moveCaretPosition(position);
            mode = GestionDocument.Mode.COMPLETION;
        }
    }
     
    private class CommitAction extends AbstractAction {
        public void actionPerformed(ActionEvent ev) {
            if (mode == GestionDocument.Mode.COMPLETION) {
                int pos = textArea.getSelectionEnd();
                textArea.insert(" ", pos);
                textArea.setCaretPosition(pos + 1);
                mode = GestionDocument.Mode.INSERT;
            } else {
                textArea.replaceSelection("\n");
            }
        }
    }  
    
    
    private  DefaultComboBoxModel dcmDor= new DefaultComboBoxModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
