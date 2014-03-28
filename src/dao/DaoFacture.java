/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import contrat.IDao;
import static contrat.IDao.bdd;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.facturation.*;
import metier.personnel.Utilisateur;

/**
 *
 * @author Samia
 */
public class DaoFacture implements IDao<Facture> {

    @Override
    public void insert(Facture objet) {
         try {
            Connection cnx = bdd.seConnecter();

            String sql = "INSERT INTO `facture`(`id_medecin_fa`, `id_dossier_patient_fa`, `montant_fa`, `actes`, `date_facture`) VALUES (?,?,?,?,?)";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, objet.getId_medecin());
            stat.setInt(2, objet.getId_patient());
            stat.setString(3, objet.getMontant());
            stat.setString(4, objet.getActes());
            stat.setDate(5, (java.sql.Date) objet.getDate());


            stat.executeUpdate();
            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFacture.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFacture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Facture objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Facture> selectAll() {
        return null;
//         List<Facture> l = new ArrayList<>();
//        try {
//            Connection cnx = bdd.seConnecter();
//            String sql = "select * from facture";
//            Statement stat = cnx.createStatement();
//            ResultSet res = stat.executeQuery(sql);
//
//            while (res.next()) {
//               Facture m = new Facture(res.getInt("id_facture"), res.getInt("id_"), res.getString("pwd_user"), res.getInt("id_role_user"), res.getString("nom"), res.getString("prenom"), res.getString("email"), res.getString("tel_Por"), res.getString("tel_Fixe"));
//                l.add(m);
//            }
//
//            bdd.seDeconnecter(cnx);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return l;
    }

    @Override
    public void update(Facture objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes() {
        ResultSet res = null;
         Connection cnx = null;
        try {
             cnx = bdd.seConnecter();
            String sql = "SELECT `actes`, `montant_fa`, `date_facture` FROM `facture`";
            Statement stat = cnx.createStatement();
            res = stat.executeQuery(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFacture.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFacture.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//            bdd.seDeconnecter(cnx);
        }
        return res;
    }
    
     public ResultSet selectRetunRes(int id) {
        ResultSet res = null;
         Connection cnx = null;
        try {
             cnx = bdd.seConnecter();
            String sql = "SELECT `actes`, `montant_fa`, `date_facture` FROM `facture` WHERE id_medecin_fa=?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, id);
            res = stat.executeQuery();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoFacture.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFacture.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//            bdd.seDeconnecter(cnx);
        }
        return res;
    }

    @Override
    public Facture selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectAll(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertTim(Facture objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromListTim(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTim(Facture objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Facture> selectAllTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTim(Facture objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunResTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Facture selectByIdTim(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List selectAllTim(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
