/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class DBCon {
    public static Connection connectDB() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scd_project?zeroDateTimeBehavior=CONVERT_TO_NULL","root","zohaib007");
        return con;
    }
}
