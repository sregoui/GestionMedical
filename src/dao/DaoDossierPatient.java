/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import contrat.IDao;
import static contrat.IDao.bdd;
import java.sql.Connection;
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
               DossierPatient dp = new DossierPatient(res.getInt("id_dossier_patient"), res.getString("nom"), res.getString("prenom"), res.getString("sexe"), res.getString("date_de_naissance"), res.getString("nss"), res.getString("adresse"), res.getString("ville"), res.getString("zip_code"));
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
