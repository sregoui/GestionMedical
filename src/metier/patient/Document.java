/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.patient;

import contrat.Metier;
import java.io.Serializable;

/**
 *
 * @author Samia
 */
public class Document extends Metier implements Serializable {
    
    private int id_document;
    private int id_type_document;
    private String libelle;

    public Document(int id_document, int id_type_document, String libelle) {
        this.id_document = id_document;
        this.id_type_document = id_type_document;
        this.libelle = libelle;
    }

    public Document(int id_type_document, String libelle) {
        this.id_type_document = id_type_document;
        this.libelle = libelle;
    }
    

    public Document(String libelle) {
        this.libelle = libelle;
    }

    public int getId_document() {
        return id_document;
    }

    public void setId_document(int id_document) {
        this.id_document = id_document;
    }

    public int getId_type_document() {
        return id_type_document;
    }

    public void setId_type_document(int id_type_document) {
        this.id_type_document = id_type_document;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Document{" + "id_document=" + id_document + ", id_type_document=" + id_type_document + ", libelle=" + libelle + '}';
    }
    
    
    
}
