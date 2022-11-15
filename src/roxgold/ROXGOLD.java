/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roxgold;

import java.sql.Connection;

/**
 *
 * @author sdram
 */
public class ROXGOLD {
  
    Connection con =new ConnectionDB().connect();
    
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                new ConnectionDB();
            }
        });

    }
    
}
