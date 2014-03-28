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
import metier.personnel.Medecin;
import metier.personnel.Utilisateur;


/**
 *
 * @author Samia
 */
public class DaoDossierPatient implements IDao<DossierPatient> {

    @Override
    public void insert(DossierPatient objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(DossierPatient objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DossierPatient> selectAll() {
        List<DossierPatient> l = new ArrayList<>();
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from DossierPatient";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
               DossierPatient dp = new DossierPatient(res.getInt("id_dossier_patient"), res.getString("nom"), res.getString("prenom"), res.getString("sexe"), res.getString("date_de_naissance"), res.getString("nss"), res.getString("adresse"), res.getString("ville"), res.getString("zip_code"), res.getInt("id_medecin_user"));
                l.add(dp);
                
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
    public void update(DossierPatient objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DossierPatient selectById(int id) {
        DossierPatient dp = null;
        try {
            Connection cnx= bdd.seConnecter();
            
            String sql = "select * from dossierPatient where id_dossier_patient=?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet res = stat.executeQuery();
            res.first();
            
            dp = new DossierPatient(res.getInt("id_dossier_patient"), res.getString("nom"),res.getString("prenom"), res.getString("sexe"),res.getString("date_de_naissance"), res.getString("nss"), res.getString("adresse"),res.getString("ville"), res.getString("zip_code"), res.getInt("id_medecin_user"));
            bdd.seDeconnecter(cnx);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DossierPatient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DossierPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    
    }


    @Override
    public List selectAll(Utilisateur user) {
        List<DossierPatient> l = new ArrayList<>();
        DossierPatient dm = null;
        
        try {
            
            Connection cnx = bdd.seConnecter();
            String sql = "select * from DossierPatient where id_medecin_user=?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, user.getId());
            // Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery();
    
            while (res.next()) {
               
               dm = new DossierPatient(res.getInt("id_dossier_patient"), res.getString("nom"), res.getString("prenom"), res.getString("sexe"), res.getString("date_de_naissance"), res.getString("nss"), res.getString("adresse"), res.getString("ville"), res.getString("zip_code"), res.getInt("id_medecin_user"));
                System.out.println(dm);
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
    public void insertTim(DossierPatient objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromListTim(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTim(DossierPatient objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DossierPatient> selectAllTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTim(DossierPatient objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunResTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DossierPatient selectByIdTim(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectAllTim(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes(int id_dossierPatient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
