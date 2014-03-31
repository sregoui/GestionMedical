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
import java.util.logging.Logger;
import metier.personnel.*;

/**
 *
 * @author Toiha
 */
public class DaoRole implements IDao<Role>{

    @Override
    public void insert(Role objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Role objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Role objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> selectAllbyMedecin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertTim(Role objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromListTim(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTim(Role objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> selectAllTim() {
        Role role = null;
        List listROLE = new ArrayList();
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from role where ID_ROLE > 2";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                int _id = (rs.getInt("ID_ROLE"));
                String intitule = rs.getString("INTITULE");
                role = new Role(_id, intitule);
                listROLE.add(role);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
        return listROLE;
    }

    @Override
    public void updateTim(Role objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunResTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role selectByIdTim(int id) {
        Role role = null;
        
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from role where ID_ROLE="+id;
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                int _id = (rs.getInt("ID_ROLE"));
                String intitule = rs.getString("INTITULE");
                
                role = new Role(_id, intitule);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
        
        return role;
    }

    @Override
    public List<Role> selectAllbyMedecinTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectAll(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectAllTim(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> selectAllbyFiltreTim(String champFiltr, String valeur) {
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
    
}
