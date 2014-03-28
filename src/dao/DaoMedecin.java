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
import metier.personnel.*;

/**
 *
 * @author Samia
 */
public class DaoMedecin implements IDao<Medecin> {

    @Override
    public void insert(Medecin objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Medecin objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medecin> selectAll() {
         List<Medecin> l = new ArrayList<>();
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from user where id_role >=3";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
               Medecin m = new Medecin(res.getInt("id_user"), res.getString("login_user"), res.getString("pwd_user"), res.getInt("id_role_user"), res.getString("nom"), res.getString("prenom"), res.getString("email"), res.getString("tel_Por"), res.getString("tel_Fixe"));
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

    @Override
    public void update(Medecin objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectRetunRes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medecin selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medecin> selectAllbyMedecin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectAll(Utilisateur user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
