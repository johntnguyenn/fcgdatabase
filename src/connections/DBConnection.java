package connections;

import common.CommonAttributes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
   
public class DBConnection {


    public Connection getConnection()
    {
        String dbuser = CommonAttributes.Username;
        String dbpass = CommonAttributes.Password;
        String dburl  = "jdbc:mysql://localhost:3306/clients?useSSL=false&allowPublicKeyRetrieval=true";
        String jdbcdriver="com.mysql.cj.jdbc.Driver";
  
        Connection con=null;
          try
                   {
                    Class.forName(jdbcdriver);
                    con= DriverManager.getConnection(dburl,dbuser,dbpass);
                   }
          catch(Exception ex){
          
        	  System.out.println(ex.getMessage());
          }
        return con;
    
    }
    /* public static void main(String[] args) {
        
        try {
           Connection con = new DBConnection().getConnection();
            
            System.out.println(con.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    } */
}