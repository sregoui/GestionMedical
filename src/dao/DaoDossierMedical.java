/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import contrat.IDao;
import static contrat.IDao.bdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.patient.*;
import metier.personnel.Utilisateur;


/**
 *
 * @author Samia
 */
public class DaoDossierMedical implements IDao<DossierMedical> {

    @Override
    public void insert(DossierMedical objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(DossierMedical objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DossierMedical objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DossierMedical selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DossierMedical> selectAllbyMedecin() {
         List<DossierMedical> l = new ArrayList<>();
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from DossierMedical";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
               DossierMedical dm = new DossierMedical(res.getInt("id_dossier_medical"), res.getInt("id_dossier_patient_dm"), res.getString("taille"), res.getString("poids"), res.getString("allergie"), res.getString("antecedants"), res.getString("contres_indications"), res.getString("vaccins"), res.getInt("id_user"));
                l.add(dm);
                
            }

            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
       
    }

    @Override
    public List<DossierMedical> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    /**
     * Methode qui retourne les dossierMedical à partir de l'id de l'user.
     * @param user
     * @return 
     */
    @Override
    public List<DossierMedical> selectAll(Utilisateur user) {
       
        List<DossierMedical> l = new ArrayList<>();
        DossierMedical dm = null;
        
        try {
            
            Connection cnx = bdd.seConnecter();
            String sql = "select * from DossierMedical where id_user=?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, user.getId());
            // Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery();
            
    
            while (res.next()) {
               
               dm = new DossierMedical(res.getInt("id_dossier_medical"), res.getInt("id_dossier_patient_dm"), res.getString("taille"), res.getString("poids"), res.getString("allergie"), res.getString("antecedants"), res.getString("contres_indications"), res.getString("vaccins"), res.getInt("id_user"));
               l.add(dm);
                
            }

            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
        
        
    }
}
