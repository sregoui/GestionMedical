
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contrat;

import dao.bdd;
import java.sql.ResultSet;
import java.util.List;
import metier.personnel.Utilisateur;

/**
 *
 * @author Samia
 * @param <T>
 */
public interface IDao<T extends Metier> {
    
    
    
    public bdd bdd = new bdd(); 
    public void insert(T objet);
    public void insertFromList(List l);
    public void delete(T objet);
    public List<T> selectAll();
    public void update(T objet);
    public ResultSet selectRetunRes();
    public T selectById(int id);
    public List<T> selectAllbyMedecin();

    public List selectAll(Utilisateur user);
}
