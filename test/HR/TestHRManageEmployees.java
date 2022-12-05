/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package HR;

import HRManager.ManageEmployees;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Name
 */
public class TestHRManageEmployees {
    
    public TestHRManageEmployees() {
    }
    
    @Test
    public void hello() {
    ManageEmployees me = new ManageEmployees();
    String field[] = {"komalnew","pw","NABEEHA MUDASSIR","CEO","12344"};
    me.setTestFields(field);
   //assertTrue(,me.testAddEmployee());
    assertEquals(me.testAddEmployee(),true);
    }
}
