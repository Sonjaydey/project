/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DCL
 */
public class connector {
   Connection conn;
 ResultSet rs;
 PreparedStatement pst;
    
    public   static Connection connectdb(){
        try{
           Class.forName("org.sqlite.JDBC");
          Connection  conn=DriverManager.getConnection("jdbc:sqlite:mydatabase.sqlite");
           return conn;
        }catch(Exception ex)
        {
           JOptionPane.showMessageDialog(null,ex);
           return null;
        }
    }
}
