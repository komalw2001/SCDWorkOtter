/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SoftwareDeveloper;

import Login.CurrentUser;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.*;

/**
 *
 * @author Lenovo
 */
@RunWith(Parameterized.class)
public class ViewTaskTest {
    String inputProgress;
    int expResult;
    static int projectID;
    static int taskID;
    
    public ViewTaskTest(String prog, int exp) {
        inputProgress = prog;
        expResult = exp;
    }
    
    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{{"-1",1},{"101",1},{"abc",3},{"2",2},{"",3},{"15",0}});
    }
    
    @BeforeClass
    public static void setUpClass() {
        CurrentUser.setUser("komal1");
        projectID = 2;
        taskID = 2;
    }
    
    @AfterClass
    public static void tearDownClass() {
        CurrentUser.logOut();
    }

    @Test
    public void testSomeMethod() {
        ViewTask vt = new ViewTask(taskID,projectID);
        int res = vt.update(inputProgress);
        assertEquals(res,expResult);
    }
    
}
