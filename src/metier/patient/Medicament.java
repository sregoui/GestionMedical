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

    public Medicament(int id_medicament, String libelle) {
        this.id_medicament = id_medicament;
        this.libelle = libelle;
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

    @Override
    public String toString() {
        return "Medicament{" + "id_medicament=" + id_medicament + ", libelle=" + libelle + '}';
    }
    
}
