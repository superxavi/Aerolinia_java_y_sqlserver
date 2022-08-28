
package ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.*; 
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conectar {
    

   private static Conectar UnicaConexion = null;
   @Id
    private Connection Conex;
    
    Conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=modelos"; 
        Conex = DriverManager.getConnection(connectionUrl,"sa","123456");
    } 
    
    public synchronized static Conectar getConexion()  throws ClassNotFoundException, SQLException{
        if(UnicaConexion == null){
            UnicaConexion = new Conectar();
        }        
        return UnicaConexion;
    }
    
    public Connection getConex(){
        return Conex;
    }    
    
    public void Destroy() throws SQLException{
        Conex.close();
    }

   
    
    
}
