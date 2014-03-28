/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.facturation;

import contrat.Metier;
import java.io.Serializable;
import java.sql.Date;
import java.text.DateFormat;
import metier.personnel.Medecin;

/**
 *
 * @author Samia
 */
public class Facture extends Metier implements Serializable {
    
    private int id_facture;
    private int id_patient;
    private int id_medecin;
    private String actes;
    private String montant;
    private Date date;

    public Facture() {
    }

    public Facture(int id_facture, int id_patient, int id_medecin, String actes, String montant, Date date) {
        this.id_facture = id_facture;
        this.id_patient = id_patient;
        this.id_medecin = id_medecin;
        this.actes = actes;
        this.montant = montant;
        this.date = date;
    }

    public Facture(int id_patient, int id_medecin, String actes, String montant, Date date) {
        this.id_patient = id_patient;
        this.id_medecin = id_medecin;
        this.actes = actes;
        this.montant = montant;
        this.date = date;
    }



    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

    public int getId_patient() {
        return id_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public int getId_medecin() {
        return id_medecin;
    }

    public void setId_medecin(int id_medecin) {
        this.id_medecin = id_medecin;
    }

    public String getActes() {
        return actes;
    }

    public void setActes(String actes) {
        this.actes = actes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Facture{" + "id_facture=" + id_facture + ", id_patient=" + id_patient + ", id_medecin=" + id_medecin + ", actes=" + actes + ", date=" + date + '}';
    }

    
}
