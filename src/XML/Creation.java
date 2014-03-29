/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package XML;

import contrat.IDao;
import factory.FactoryDao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import metier.personnel.Utilisateur;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Samia
 */
public class Creation {
         
    private static IDao dao;
    private static List l;
    
   // -----------------------------------
   public static void main(String[] args) {
   // -----------------------------------

      try {         
         // --- Partie 1 : Creation du DOM en memoire
         Document arbreDom = new Document(new Element("racine"));

         // --- Partie 2 : fermeture ou Output (dom2fichier)
         // --- Ecriture sur le DD dans le document XML
         // --- du contenu de l'arbre DOM qui est en RAM        
         
                  // --- Les variables
         String lsFichier  = "test.xml";
         SAXBuilder sxb    = new SAXBuilder();
         Element racine    = new Element("Contact");


         arbreDom = sxb.build(new File(lsFichier));
         
         // --- Recuperation de l'element racine
         racine = arbreDom.getRootElement();
         

         dao = FactoryDao.getDAO("Utilisateur");
         l = dao.selectAll();

        for(Object o: l){
            Utilisateur user = (Utilisateur) o;
            
         Element userBalise = new Element("user");
         userBalise.setAttribute("id", String.valueOf(user.getId()));
            
         Element nom           = new Element("nom");
         nom.setText(user.getNom());
         Element prenom          = new Element("prenom");
         prenom.setText(user.getPrenom());

         
         userBalise.addContent(nom);
         userBalise.addContent(prenom);
         racine.addContent(userBalise);
            
        }


         // --- Partie 3 : fermeture ou Output (dom2fichier)
         // --- Ecriture sur le DD dans le document XML
         // --- du contenu de l'arbre DOM qui est en RAM
         XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
         sortie.output(arbreDom, new FileOutputStream(lsFichier));

         System.out.println("Article ajouté");

      } // FIN TRY

      catch (Exception e) {
         System.err.println(e.getMessage());
      }
}
}
