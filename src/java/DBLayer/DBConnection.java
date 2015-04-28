/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asad
 */
public class DBConnection 
{
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
    
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author i110100
 */
    public static Connection Connect()
    {
        try
        {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String connString  = "jdbc:derby://localhost:1527/MyDatabase";
        String username = "asad";
        String password = "asad";

        Connection conn= DriverManager.getConnection(connString, username, password);
        return conn;
    
        }
        catch(Exception E)
        {
            E.printStackTrace();
            return null;

        }

        


    }

}

    


    

