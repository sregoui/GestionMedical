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
public class Admin extends Utilisateur {

    public Admin(int id, String login, String password, int id_role, String nom, String prenom, String email, String telPort, String telFixe) {
        super(id, login, password, id_role, nom, prenom, email, telPort, telFixe);
    }


    
}
