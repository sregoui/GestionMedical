/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.personnel;

import contrat.Metier;

/**
 *
 * @author Samia
 */
public class Generaliste extends Medecin {

    public Generaliste(int id, String login, String password, int id_role) {
        super(id, login, password, id_role);
    }
    
}
