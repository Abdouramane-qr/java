/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roxgold;

import java.util.Date;

/**
 *
 * @author sdram
 */
public class ServerDetails {

    private String server;
    private String port;
    private Date dateD;
    private Date dateF;
    private String Compagny;
    private String user;
    private String password;
    private String database;

    //Mise en place des Setters
    public void setServer(String Server) {

        this.server = Server;

    }

    public void setDateD(Date DateD) {

        this.dateD = DateD;

    }

    public void setDateF(Date DateF) {

        this.dateF = DateF;

    }

    public void setCompagny(String Compagnie) {

        this.Compagny = Compagnie;

    }

    public void setPort(String Port) {

        this.port = Port;

    }

    public void setUser(String User) {

        this.user = User;

    }

    public void setPass(String Pass) {

        this.password = Pass;

    }

    public void setDatabase(String Database) {

        this.server = Database;

    }

    //Mise en place des Getters
    public String getServer() {

        return server;

    }

    public String getPort() {

        return port;

    }

    public String getUser() {

        return user;

    }

    public String getPass() {

        return password;

    }

    public String getDatabase() {

        return database;

    }

    public Date getDateD() {
        return dateD;
    }

    public Date getDateF() {

        return dateF;

    }

    public String getCompagny() {

        return Compagny;

    }

   
}
