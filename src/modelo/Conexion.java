package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    String db = "farmacia";
    String url = "jdbc:mysql://localhost/"+db;
    String user = "root";
    String pass = "";

    public Conexion() {
    }
    
    public Connection Connectar(){
        Connection con = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, e);
        }
        return con;
    }
}
