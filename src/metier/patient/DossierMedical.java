/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.patient;

import contrat.Metier;

/**
 *
 * @author Samia
 */
public class DossierMedical extends DossierPatient {
    
    private int id_dossier_medical;
    private int id_dossier_patient_dm;
    private String taille;
    private String poids;
    private String allergie;
    private String antecedants;
    private String contres_indications;
    private String vaccins;
    private int id_user;
    
    public DossierMedical() {
    }
    
    

    public DossierMedical(int id_dossier_medical, int id_dossier_patient_dm, String taille, String poids, String allergie, String antecedants, String contres_indications, String vaccins, int id_user) {
        this.id_dossier_medical = id_dossier_medical;
        this.id_dossier_patient_dm = id_dossier_patient_dm;
        this.taille = taille;
        this.poids = poids;
        this.allergie = allergie;
        this.antecedants = antecedants;
        this.contres_indications = contres_indications;
        this.vaccins = vaccins;
        this.id_user = id_user;
    }

    public int getId_dossier_medical() {
        return id_dossier_medical;
    }

    public void setId_dossier_medical(int id_dossier_medical) {
        this.id_dossier_medical = id_dossier_medical;
    }

    public int getId_dossier_patient_dm() {
        return id_dossier_patient_dm;
    }

    public void setId_dossier_patient_dm(int id_dossier_patient_dm) {
        this.id_dossier_patient_dm = id_dossier_patient_dm;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getAllergie() {
        return allergie;
    }

    public void setAllergie(String allergie) {
        this.allergie = allergie;
    }

    public String getAntecedants() {
        return antecedants;
    }

    public void setAntecedants(String antecedants) {
        this.antecedants = antecedants;
    }

    public String getContres_indications() {
        return contres_indications;
    }

    public void setContres_indications(String contres_indications) {
        this.contres_indications = contres_indications;
    }

    public String getVaccins() {
        return vaccins;
    }

    public void setVaccins(String vaccins) {
        this.vaccins = vaccins;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    

    @Override
    public String toString() {
     
        return "Dossier n°" + id_dossier_medical;
    }
    
}
