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

    public DossierMedical() {
    }

    public DossierMedical(int id_dossier_medical, int id_dossier_patient_dm, String taille, String poids, String allergie, String antecedants, String contres_indications, String vaccins) {
        this.id_dossier_medical = id_dossier_medical;
        super.id_dossierPatient = id_dossier_patient_dm;
        this.taille = taille;
        this.poids = poids;
        this.allergie = allergie;
        this.antecedants = antecedants;
        this.contres_indications = contres_indications;
        this.vaccins = vaccins;
    }



   
    
    
}
