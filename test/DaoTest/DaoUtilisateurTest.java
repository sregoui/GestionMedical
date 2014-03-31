/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoTest;

import dao.DaoDossierPatient;
import dao.DaoUtilisateur;
import java.util.List;
import metier.patient.DossierPatient;
import metier.personnel.Utilisateur;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samia
 */
public class DaoUtilisateurTest {
    
    private DaoUtilisateur u;
    
    
    public DaoUtilisateurTest() {
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        u = new DaoUtilisateur();
    }
    
    @Test
    public void selectAllTest(){
      List l = null;

      l = u.selectAll();
		
      assertTrue(l.size()>0);

    }
    
    @Test
    public void selectByIdTest(){

       Utilisateur dp = null;
       dp = u.selectById(2);
		
        boolean result = dp instanceof Utilisateur;
		
	assertTrue(result);
    }
    
   
    
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
