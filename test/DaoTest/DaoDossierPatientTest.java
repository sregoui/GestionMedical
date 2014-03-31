/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DaoTest;

import static com.sun.org.apache.regexp.internal.RETest.test;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import dao.DaoDossierPatient;
import java.util.List;
import metier.patient.DossierPatient;
import metier.personnel.Utilisateur;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Samia
 */
public class DaoDossierPatientTest {
    
    private DaoDossierPatient ddp;
    private Utilisateur u;
    
    
    public DaoDossierPatientTest() {
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ddp = new DaoDossierPatient();
        u = new Utilisateur();
    }
    
    @Test
    public void selectAllTest(){
      List l = null;

      l = ddp.selectAll();
		
      assertTrue(l.size()>0);

    }
    
    @Test
    public void selectByIdTest(){

       DossierPatient dp = null;
       dp = ddp.selectById(2);
		
        boolean result = dp instanceof DossierPatient;
		
	assertTrue(result);
    }
    
    
    @Test
    public void selectAllwithUserTest(){
      List l = null;

      l = ddp.selectAll(u);
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
