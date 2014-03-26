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
public class DossierPatient extends Metier implements Serializable{
    
    protected int id_dossierPatient;
    private String nom;
    private String prenom;
    private String sexe;
    private String date_de_naissance;
    private String nss;
    private String adresse;
    private String ville;
    private String zip_code;

    public DossierPatient() {
    }
   

    public DossierPatient(int id_dossierPatient, String nom, String prenom, String sexe, String date_de_naissance, String nss, String adresse, String ville, String zip_code) {
        this.id_dossierPatient = id_dossierPatient;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.date_de_naissance = date_de_naissance;
        this.nss = nss;
        this.adresse = adresse;
        this.ville = ville;
        this.zip_code = zip_code;
    }

    public DossierPatient(String nom, String prenom, String sexe, String date_de_naissance, String nss, String adresse, String ville, String zip_code) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.date_de_naissance = date_de_naissance;
        this.nss = nss;
        this.adresse = adresse;
        this.ville = ville;
        this.zip_code = zip_code;
    }

    public int getId_dossierPatient() {
        return id_dossierPatient;
    }

    public void setId_dossierPatient(int id_dossierPatient) {
        this.id_dossierPatient = id_dossierPatient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return  nom + " " + prenom ;
    }
     
    
}
