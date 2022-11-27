/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roxgold;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static roxgold.Login.txtInputAdress;
import static roxgold.Login.txtInputPassword;
import static roxgold.Login.txtInputUser;

/**
 *
 * @author sdram
 */
public class RemotConn {

    private Connection RemotConn;

    public Connection Connect() {
        PreparedStatement ps;
        ResultSet Rs;

        ServerDetails sr = new ServerDetails();

        sr.setUser(txtInputUser.getText());
        sr.setPass(String.valueOf(txtInputPassword.getPassword()));
        sr.setServer(txtInputAdress.getText() + ":1433");
        String Url = "jdbc:sqlserver://" + sr.getServer();

        try {
            if (txtInputAdress.getText().equals("") || txtInputPassword.getPassword().equals("")) {
                JOptionPane.showMessageDialog(null, "Remplissez les svp!!");

            } else {
                RemotConn = DriverManager.getConnection(Url, sr.getUser(), sr.getPass());

//                JOptionPane.showMessageDialog(null, "Connection Reussit!!");
//
//                VenaData vn = new VenaData();
//                vn.setLocationRelativeTo(null);
//                vn.setExtendedState(JFrame.MAXIMIZED_BOTH);
//                vn.setVisible(true);
//                vn.pack();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de connection" + e);
        }

        return RemotConn;
    }
}
