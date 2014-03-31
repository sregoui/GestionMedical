/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.gestionRdz;

import contrat.Metier;

/**
 *
 * @author Samia
 */
public class Rdz extends Metier {
    
    private int id;
    private int patient;
    private int medecin;
    private String date;
    private int creneau;

    public Rdz(int id, int patient, int medecin, String date, int creneau) {
        this.id = id;
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        this.creneau = creneau;
    }

    public Rdz(int patient, int medecin, String date, int creneau) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        this.creneau = creneau;
    }

    public Rdz() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public int getMedecin() {
        return medecin;
    }

    public void setMedecin(int medecin) {
        this.medecin = medecin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCreneau() {
        return creneau;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }

    @Override
    public String toString() {
        return "Rdz{ patient : " + patient + ", medecin : " + medecin + ", date : " + date + ", creneau : " + creneau + '}';
    }
    
    
    
}
