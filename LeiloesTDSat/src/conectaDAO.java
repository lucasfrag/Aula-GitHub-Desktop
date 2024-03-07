
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
<<<<<<< HEAD

            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=q1w2e3r4");

        } catch (SQLException erro) {
=======
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=");
            
        } catch (SQLException erro){
>>>>>>> parent of 34a05e4 (Remoção de comentários e organização do código)
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }
    
}
