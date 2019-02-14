/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;

import java.sql.SQLException;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.apache.derby.jdbc.ClientDataSource;

/**
 *
 * @author axelzgiat
 */
public class Connector 
{
    public Connection createConnection() throws NamingException, SQLException
    {
        ClientDataSource dc = new org.apache.derby.jdbc.ClientDataSource();
        dc.setServerName("localhost");
        dc.setUser("app");
        dc.setPassword("app");
        dc.setPortNumber(1527);
        dc.setDatabaseName("Exotica");
        Context ctx = new InitialContext();
        ctx.rebind("jdbc/MyDB", dc);
        DataSource ds = (DataSource)ctx.lookup("jdbc/MyDB");
        Connection con = ds.getConnection();
        return con;
    }
    
}
