/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import contrat.IDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.gestionRdz.*;
import metier.personnel.Medecin;
import metier.personnel.Utilisateur;


/**
 *
 * @author Samia
 */
public class DaoRdz implements IDao<Rdz> {

    @Override
    public void insert(Rdz objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Rdz objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rdz> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Rdz objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rdz selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List selectAll(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertTim(Rdz objet) {
        try {
            Connection cnx = bdd.seConnecter();

            String sql = "INSERT INTO `rdz`(`ID_MEDECIN_RDZ`, `ID_DOSSIER_PATIENT_RDZ`, `ID_CRENEAU_RDZ`, `DATE`) VALUES (?,?,?,?)";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, objet.getMedecin());
            stat.setInt(2, objet.getPatient());
            stat.setInt(3, objet.getCreneau());
            stat.setString(4, objet.getDate());

            stat.executeUpdate();
            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertFromListTim(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTim(Rdz objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rdz> selectAllTim() {
        
        List rdzList = new ArrayList();
        
        try 
        {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from rdz";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                Rdz rdz = new Rdz();
                
                rdz.setId(rs.getInt("ID_RDV"));
                rdz.setDate(rs.getString("DATE"));
                rdz.setMedecin(rs.getInt("ID_MEDECIN_RDZ"));
                rdz.setPatient(rs.getInt("ID_DOSSIER_PATIENT_RDZ"));
                rdz.setCreneau(rs.getInt("ID_CRENEAU_RDZ"));
                
                rdzList.add(rdz);
            }
            
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rdzList;
    }

    @Override
    public void updateTim(Rdz objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunResTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rdz selectByIdTim(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List selectAllTim(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rdz> selectAllbyFiltreTim(String champFiltr, String valeur) {
        List rdzList = new ArrayList();
        
        try 
        {
            Connection cnx = bdd.seConnecter();
            
            String selectRole = "select ID_ROLE from role where INTITULE='"+valeur+"'";
            String selectMdc = "select ID_USER from user where ID_ROLE_USER =("+selectRole+")";
            String selectRdz = "select * from rdz where ID_MEDECIN_RDZ=("+selectMdc+")";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(selectRdz);
            
            while(rs.next())
            {
                Rdz rdz = new Rdz();
                
                rdz.setId(rs.getInt("ID_RDV"));
                rdz.setDate(rs.getString("DATE"));
                rdz.setMedecin(rs.getInt("ID_MEDECIN_RDZ"));
                rdz.setPatient(rs.getInt("ID_DOSSIER_PATIENT_RDZ"));
                rdz.setCreneau(rs.getInt("ID_CRENEAU_RDZ"));
                
                rdzList.add(rdz);
            }
            
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rdzList;
    }

    @Override
    public List<Rdz> selectAllbyMedecin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes(int id_dossierPatient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rdz> selectAllbyMedecinTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes2(int id_dossierPatient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
