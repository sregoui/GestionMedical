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
public class Medicament extends Metier implements Serializable {
    private int id_medicament;
    private String libelle;
    private String descriptif;
    private String dosage;

    public Medicament(int id_medicament, String libelle, String descriptif, String dosage) {
        this.id_medicament = id_medicament;
        this.libelle = libelle;
        this.descriptif = descriptif;
        this.dosage = dosage;
    }

    public Medicament(String libelle) {
        this.libelle = libelle;
    }

    public int getId_medicament() {
        return id_medicament;
    }

    public void setId_medicament(int id_medicament) {
        this.id_medicament = id_medicament;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    

    @Override
    public String toString() {
        return libelle;
    }
    
}
