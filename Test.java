package test;

import java.sql.*;

/**
 *
 * @author deora
 */
public class Testing {
    public static void main(String args[])
    {
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection f=DriverManager.getConnection(url,"system","sachin");
        System.out.println("coonection established");
        f.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Driver not loaded");
        }
        catch(SQLException f)
        {
            System.out.println("Connection not established");
        }
     }
    
}
