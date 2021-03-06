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
import metier.personnel.Generaliste;
import metier.personnel.Medecin;
import metier.personnel.Utilisateur;

/**
 *
 * @author Samia
 */
public class DaoMedicament implements IDao<Medicament> {

    @Override
    public void insert(Medicament objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Medicament objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicament> selectAll() {
       List<Medicament> l = new ArrayList<>();
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select libelle from medicament";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
               Medicament m = new Medicament(res.getString("libelle"));
                l.add(m);
            }

            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    

    public ArrayList selectAll2() {
    
       ArrayList<String> l = new ArrayList<String>();
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select libelle from medicament";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                
                l.add(res.getString("libelle"));
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
    public void update(Medicament objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes() {
       ResultSet res = null;
         Connection cnx = null;
        try {
             cnx = bdd.seConnecter();
            String sql = "SELECT `id_medicament`, `libelle`FROM `medicament`";
            Statement stat = cnx.createStatement();
            res = stat.executeQuery(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//            bdd.seDeconnecter(cnx);
        }
        return res;

    }

    @Override
    public Medicament selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List selectAll(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertTim(Medicament objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromListTim(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTim(Medicament objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicament> selectAllTim() {
         Medicament m = null;
        List listM = new ArrayList();
        
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from medicament";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                int _id = (rs.getInt("id_medicament"));
                String libelle = rs.getString("libelle");
                String descriptif = rs.getString("descriptif");
                String dosage = rs.getString("dosage");

                m = new Medicament(_id, libelle,descriptif,dosage);
                listM.add(m);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
        
        return listM;
    }

    @Override
    public void updateTim(Medicament objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunResTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medicament selectByIdTim(int id) {
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

    @Override
    public ResultSet selectRetunRes2(int id_dossierPatient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicament> selectAllbyMedecin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicament> selectAllbyMedecinTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicament> selectAllbyFiltreTim(String champFiltr, String valeur) {
        Medicament m = null;
        List listM = new ArrayList();
        
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from medicament where "+champFiltr+" like '"+valeur+"%'";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                int _id = (rs.getInt("id_medicament"));
                String libelle = rs.getString("libelle");
                String descriptif = rs.getString("descriptif");
                String dosage = rs.getString("dosage");

                m = new Medicament(_id, libelle,descriptif,dosage);
                listM.add(m);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
        
        return listM;
    }
    }


    

