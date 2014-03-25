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
   
   /**
    * Attributs classe utilisateur
    * id : represente l'id de l'user
    * login : correspond à l'identifiant de connexion de l'utilisateur
    * password: mot de passe 
    * id_role: correspond à l'identifiant du role (medecin, secretaire..) de l'utilisateur
    */
   private int id;
   private String login;
   private String password;
   private int id_role;
   private String nom;
   private String prenom;
   private String email;
   private String telPort;
   private String telFixe;

   /**
    * 
    * @param id
    * @param login
    * @param password
    * @param id_role
    * @param nom
    * @param prenom
    * @param email
    * @param telPort
    * @param telFixe 
    */
    public Utilisateur(int id, String login, String password, int id_role, String nom, String prenom, String email, String telPort, String telFixe) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.id_role = id_role;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telPort = telPort;
        this.telFixe = telFixe;
    }



  /**
   * 
   * @param login
   * @param password
   * @param id_role
   * @param nom
   * @param prenom
   * @param email
   * @param telPort
   * @param telFixe 
   */
    public Utilisateur(String login, String password, int id_role, String nom, String prenom, String email, String telPort, String telFixe) {
        this.login = login;
        this.password = password;
        this.id_role = id_role;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telPort = telPort;
        this.telFixe = telFixe;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", login=" + login + ", password=" + password + ", id_role=" + id_role + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", telPort=" + telPort + ", telFixe=" + telFixe + '}';
    }
    
}
