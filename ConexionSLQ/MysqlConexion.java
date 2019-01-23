 
package ConexionSLQ;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

 
public class MysqlConexion {
    
    Connection conectar = null;
    
    
    public Connection conexion()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/clinica","root", "");
            
            
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Error al conectar con la BD "+e.getMessage());
        }
        return conectar;
    }
}
