/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.personnel;

import contrat.Metier;

/**
 *
 * @author Toiha
 */
public class Role extends Metier {
    
    private int id;
    private String intitule;

    public Role(int id, String intitule) {
        this.id = id;
        this.intitule = intitule;
    }

    public Role(String intitule) {
        this.intitule = intitule;
    }

    public Role() {
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

    @Override
    public String toString() {
        return "Role{" + "id=" + id + ", intitule=" + intitule + '}';
    }
    
    
}
