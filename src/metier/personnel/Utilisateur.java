/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier.personnel;

import contrat.Metier;
import java.io.Serializable;

/**
 *
 * @author Samia
 */
public class Utilisateur extends Metier implements Serializable {
    
   private int id;
   private String login;
   private String password;
   private int id_role;

    public Utilisateur(int id, String login, String password, int id_role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.id_role = id_role;
    }

    public Utilisateur(String login, String password, int id_role) {
        this.login = login;
        this.password = password;
        this.id_role = id_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", login=" + login + ", password=" + password + ", id_role=" + id_role + '}';
    }
   
    
}
