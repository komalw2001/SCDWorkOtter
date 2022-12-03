/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author Lenovo
 */
public class CurrentUser {
    private static String username;
    
    public static void setUser(String user)
    {
        username = user;
    }
    
    public static String getUser()
    {
        return username;
    }
    
    public static void logOut()
    {
        username = null;
    }
    
    public static boolean loginStatus()
    {
        return (username != null);
    }
}
