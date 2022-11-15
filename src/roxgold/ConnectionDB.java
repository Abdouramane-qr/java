/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roxgold;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sdram
 */
public class ConnectionDB {
       private Connection ConnectionDB;

    public  Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Pilote Charges");
        } catch (ClassNotFoundException e) {
            System.out.println("Pilote Non charges");
        }
        String Url="jdbc:mysql://localhost:3306/mag";
        
        try {
            ConnectionDB = DriverManager.getConnection(Url,"root","");
            JOptionPane.showMessageDialog(null, "Connecte");
        } catch (SQLException e) {
            System.out.println("non Connecte");
        }
        return ConnectionDB;
    }
}
