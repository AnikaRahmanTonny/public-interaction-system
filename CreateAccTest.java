/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_models;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CreateAccTest {
    CreateAcc C;
    private final String username= "shanto";
    private final String pass = "1179069";
    private final boolean checkacc = false;
  
    
 
    
    @Before
    public void setUp() throws Exception {
        C = new CreateAcc();
        
    }
    
    
     @Test
     public void testcheckAcc() throws IOException {
         assertEquals(C.checkAcc( username, pass),checkacc);
     }
}
