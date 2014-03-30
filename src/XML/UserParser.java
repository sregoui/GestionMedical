/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package XML;


import dao.DaoUtilisateur;
import metier.personnel.Utilisateur;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author a.lahideb
 */
public class UserParser extends DefaultHandler{
    
    private String valeur;
    private Utilisateur user;
    private DaoUtilisateur dao;

    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        super.characters(chars, i, i1); //To change body of generated methods, choose Tools | Templates.

       if(i1!= 0){ 
        
       this.valeur =  new String(chars, i, i1);
       }
        //System.out.println("J'ai trouvé du texte : " + txt);
     
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        super.endElement(string, string1, string2); //To change body of generated methods, choose Tools | Templates.
                
        switch (string2){
        case "nom":
          this.user.setNom(this.valeur);
         break;
        case "prenom":
          this.user.setPrenom(this.valeur);
         break;
         case "email":
          this.user.setEmail(this.valeur);
         break;
         case "telephoneFixe":
          this.user.setTelFixe(this.valeur);
         break;
         case "telephonePort":
          this.user.setTelPort(this.valeur);
         break;
        case "utilisateur":
        break;
        default:
            break;
        }
    }

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
        super.startElement(string, string1, string2, atrbts); //To change body of generated methods, choose Tools | Templates.        
        
        switch (string2){
        case "utilisateur":
        this.user = new Utilisateur();
        break;
    
        default:
            break;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument(); //To change body of generated methods, choose Tools | Templates.
        
          System.out.println("Début du document");
    }

    @Override
    public void setDocumentLocator(Locator lctr) {
        super.setDocumentLocator(lctr); //To change body of generated methods, choose Tools | Templates.
    }
    
}
