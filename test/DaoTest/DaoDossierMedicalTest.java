/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoTest;

import dao.DaoDossierMedical;
import dao.DaoDossierPatient;
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
public class DaoDossierMedicalTest {
    private DaoDossierMedical ddm;
    private Utilisateur u;
    
    
    public DaoDossierMedicalTest() {
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ddm = new DaoDossierMedical();
        u = new Utilisateur();
    }
    
    @Test
    public void selectAllwithUserTest(){
      List l = null;

      l = ddm.selectAll(u);
      boolean result = u instanceof Utilisateur;	
      assertFalse(l.size()>0);
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
