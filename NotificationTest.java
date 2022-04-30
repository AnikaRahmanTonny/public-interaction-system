/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_models;

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
public class NotificationTest {
    Notification N;
    private final String username ="shanto";
    private final boolean checkNoti = false;
    
   
  
    
    @Before
    public void setUp() throws Exception {
        N = new Notification();
        
    }
    
   
     @Test
     public void testcheckNotifications() {
         assertEquals(N.checkNotifications(username),checkNoti);
         
     }
}
