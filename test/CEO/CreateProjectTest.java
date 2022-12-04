/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CEO;

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
public class CreateProjectTest {
    String title, deadline, pm, desc, tm1, tm2, tm3;
    int expResult;
    
    public CreateProjectTest(String title, String deadline, String pm, String desc, String tm1, String tm2, String tm3, int exp) {
        this.title = title;
        this.deadline = deadline;
        this.desc = desc;
        this.pm = pm;
        this.tm1 = tm1;
        this.tm2 = tm2;
        this.tm3 = tm3;
        expResult = exp;
    }
    
    @BeforeClass
    public static void setUpClass() {
        CurrentUser.setUser("nisa2"); // ceo login
    }
    
    @AfterClass
    public static void tearDownClass() {
        CurrentUser.logOut();
    }
    
    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{{"","","","","","","",1},{"wejwj","2023-12-12","sdkjs","adsk","","","",1},{"Test project","abcd","komal3","description","nabeeha1","","",2},{"Test project","2023-12-12","nabeeha1","description","komal1","","",3},{"Test project","2023-12-12","komal3","description","nisa2","nabeeha1","",4},{"Test project","2023-12-12","komal3","description","nabeeha1","xyz123jdks","komal1",4},{"Test project","2023-12-12","komal3","description","komal1","nabeeha1","nisa2",4},{"Test project","2023-12-12","komal3","description","nabeeha1","nabeeha1","",5},{"Test project","2023-12-12","komal3","description","","nabeeha1","",0}});
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        CreateProject cp = new CreateProject();
        cp.setTestValues(title, deadline, pm, desc, tm1, tm2, tm3);
        cp.show();
        int ans = cp.createProject();
        assertEquals(ans,expResult);
        cp.dispose();
    }
    
}
