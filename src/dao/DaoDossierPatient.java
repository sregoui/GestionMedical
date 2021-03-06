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
        try {
            Connection cnx = bdd.seConnecter();

            String sql = "INSERT INTO `DossierPatient`(`NOM`, `PRENOM`, `SEXE`, `DATE_DE_NAISSANCE`, `NSS`, `ADRESSE`, `VILLE`, `ZIP_CODE`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, objet.getNom());
            stat.setString(2, objet.getPrenom());
            stat.setString(3, objet.getSexe());
            stat.setString(4, objet.getDate_de_naissance());
            stat.setString(5, objet.getNss());
            stat.setString(6, objet.getAdresse());
            stat.setString(7, objet.getVille());
            stat.setString(8, objet.getZip_code());

            stat.executeUpdate();
            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoDossierPatient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoDossierPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        DossierPatient dsp = null;
        List listDSP = new ArrayList();
        
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from dossierpatient";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                int _id = (rs.getInt("ID_DOSSIER_PATIENT"));
                String nom = rs.getString("NOM");
                String prenom = rs.getString("PRENOM");
                String sexe = rs.getString("SEXE");
                String nss = rs.getString("NSS");
                String adresse = rs.getString("ADRESSE");
                String date_de_naissance = rs.getString("DATE_DE_NAISSANCE");
                String ville = rs.getString("VILLE");
                String zip = rs.getString("ZIP_CODE");
                
//                dsp = new DossierPatient(_id, nom, prenom, sexe, date_de_naissance, nss, adresse, ville, zip, 0, 0);
                dsp = new DossierPatient(_id, nom, prenom, sexe, date_de_naissance, nss, adresse, ville, zip, 000);
                listDSP.add(dsp);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
        
        return listDSP;
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
        DossierPatient dsp = null;
        
        try {
            Connection cnx = bdd.seConnecter();
            String sql = "select * from dossierpatient where ID_DOSSIER_PATIENT="+id;
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                int _id = (rs.getInt("ID_DOSSIER_PATIENT"));
                String nom = rs.getString("NOM");
                String prenom = rs.getString("PRENOM");
                String sexe = rs.getString("SEXE");
                String nss = rs.getString("NSS");
                String adresse = rs.getString("ADRESSE");
                String date_de_naissance = rs.getString("DATE_DE_NAISSANCE");
                String ville = rs.getString("VILLE");
                String zip = rs.getString("ZIP_CODE");
                
//                dsp = new DossierPatient(_id, nom, prenom, sexe, date_de_naissance, nss, adresse, ville, zip, 0, 0);
                dsp = new DossierPatient(_id, nom, prenom, sexe, date_de_naissance, nss, adresse, ville, zip, 000);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
        
        return dsp;
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
    public List<DossierPatient> selectAllbyMedecin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DossierPatient> selectAllbyMedecinTim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DossierPatient> selectAllbyFiltreTim(String champFiltr, String valeur) {
        DossierPatient dsp = null;
        List listDSP = new ArrayList();
        
        try {
            String sql = null;
            Connection cnx = bdd.seConnecter();
            if (champFiltr.equals("NOM PRENOM")) {
                sql = "select * from dossierpatient where NOM like '"+valeur+"%' OR PRENOM like '"+valeur+"%'";
            }else{
                sql = "select * from dossierpatient where "+champFiltr+" like '"+valeur+"%'";
            }
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                int _id = (rs.getInt("ID_DOSSIER_PATIENT"));
                String nom = rs.getString("NOM");
                String prenom = rs.getString("PRENOM");
                String sexe = rs.getString("SEXE");
                String nss = rs.getString("NSS");
                String adresse = rs.getString("ADRESSE");
                String date_de_naissance = rs.getString("DATE_DE_NAISSANCE");
                String ville = rs.getString("VILLE");
                String zip = rs.getString("ZIP_CODE");
                
//                dsp = new DossierPatient(_id, nom, prenom, sexe, date_de_naissance, nss, adresse, ville, zip, 0, 0);
                dsp = new DossierPatient(_id, nom, prenom, sexe, date_de_naissance, nss, adresse, ville, zip, 000);
                listDSP.add(dsp);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
        }
        
        return listDSP;
    }
    
}
