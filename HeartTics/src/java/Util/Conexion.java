package Util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion implements Serializable{

    private Connection conexion;
    private String db_url = "jdbc:mysql://sandbox2.ufps.edu.co/ufps_6";
    private String db_driver = "com.mysql.jdbc.Driver";
    private String db_usuario = "ufps_6";
    private String db_contrasena = "ufps_29";

    public Conexion() throws SQLException{
        try {
            Class.forName(db_driver).newInstance();
            conexion = DriverManager.getConnection(db_url, db_usuario, db_contrasena);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (InstantiationException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() throws SQLException{

        if (conexion != null) {
            try {
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }

    }

    public Connection getConexion() {
        return conexion;
    }
}
