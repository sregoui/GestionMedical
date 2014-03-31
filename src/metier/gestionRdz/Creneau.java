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
public class Creneau extends Metier {
    
    private int id;
    private String intitule;

    public Creneau(int id, String intitule) {
        this.id = id;
        this.intitule = intitule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Creneau() {
    }

    @Override
    public String toString() {
        return intitule;
    }
    
    
    
}
