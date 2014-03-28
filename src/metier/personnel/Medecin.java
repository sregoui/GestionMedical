/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.personnel;

import contrat.Metier;
import java.util.List;
import metier.facturation.Facture;
import metier.gestionRdz.Rdz;
import metier.patient.DossierMedical;
import metier.patient.DossierPatient;

/**
 *
 * @author Samia
 */
public class Medecin extends Utilisateur {
    protected List<DossierMedical> dossierMedical;
    protected List<Facture> facture;
    protected List<Rdz> rdz;

    public Medecin(int id, String login, String password, int id_role, String nom, String prenom, String email, String telPort, String telFixe) {
        super(id, login, password, id_role, nom, prenom, email, telPort, telFixe);
    }

    public Medecin(List<DossierMedical> dossierMedical, List<Facture> facture, List<Rdz> rdz) {
        this.dossierMedical = dossierMedical;
        this.facture = facture;
        this.rdz = rdz;
    }

    public Medecin(List<DossierMedical> dossierMedical) {
        this.dossierMedical = dossierMedical;
    }

    public List<DossierMedical> getDossierMedical() {
        return dossierMedical;
    }

    public void setDossierMedical(List<DossierMedical> dossierMedical) {
        this.dossierMedical = dossierMedical;
    }

    public List<Facture> getFacture() {
        return facture;
    }

    public void setFacture(List<Facture> facture) {
        this.facture = facture;
    }

    public List<Rdz> getRdz() {
        return rdz;
    }

    public void setRdz(List<Rdz> rdz) {
        this.rdz = rdz;
    }

    @Override
    public String toString() {
        return "Medecin{" + "dossierMedical=" + dossierMedical + ", facture=" + facture + ", rdz=" + rdz + '}';
    }
}
