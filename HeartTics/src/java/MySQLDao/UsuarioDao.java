/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLDao;

import ClasesDTO.TipoDocumento;
import InterfazDatos.IUsuarioDao;
import Util.Conexion;
import Util.Encriptador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class UsuarioDao implements IUsuarioDao {

    private Conexion conexion;
    
    public UsuarioDao() throws SQLException{
        this.conexion=new Conexion();
    }

    @Override
    public boolean registrarEstudiante(TipoDocumento tipoDoc, String numDoc,
            String correo, Date fechaNacimiento, String tipoSangre, String ciudadActual,
            String departamentoActual, String genero, String eps, String nombres,
            String apellidos, String telefono, String ciudadNacimiento, String departamentoNacimiento,
            String paisNacimiento, String paisActual, String usuario, String contra) {

        String pass = Encriptador.encriptar(contra);

        String consulta = "INSERT INTO Usuario (idTipoDocumento ,idTipoUsuario "
                + ",numDoc ,correo ,fechaNacimiento ,foto ,tipoSangre ,ciudadActual ,departamentoActual,"
                + "genero ,eps ,nombres ,apellidos,telefono,ciudadNacimiento ,"
                + "departamentoNacimiento ,paisNacimiento ,paisActual, nombreUsuario, contra)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String consulta2 = "INSERT INTO Estudiante (idUsuario, estado) VALUES(?,?)";
        String consulta3 = "SELECT `AUTO_INCREMENT` FROM  INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'ufps_6' AND TABLE_NAME  = 'Usuario'";

        try {
            PreparedStatement state = this.conexion.getConexion().prepareStatement(consulta3);
            ResultSet rs1 = state.executeQuery();

            long id = 0;

            while (rs1.next()) {
                id = rs1.getLong(1);
            }
            this.conexion.getConexion().setAutoCommit(false);
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            PreparedStatement stmt2 = this.conexion.getConexion().prepareStatement(consulta2);
            stmt.setInt(1, tipoDoc.getIdTipoDoc());
            stmt.setInt(2, 1);
            stmt.setString(3, numDoc);
            stmt.setString(4, correo);
            stmt.setDate(5, new java.sql.Date(fechaNacimiento.getTime()));
            stmt.setString(6, "No disponible");
            stmt.setString(7, tipoSangre);
            stmt.setString(8, ciudadActual);
            stmt.setString(9, departamentoActual);
            stmt.setString(10, genero);
            stmt.setString(11, eps);
            stmt.setString(12, nombres);
            stmt.setString(13, apellidos);
            stmt.setString(14, telefono);
            stmt.setString(15, ciudadNacimiento);
            stmt.setString(16, departamentoNacimiento);
            stmt.setString(17, paisNacimiento);
            stmt.setString(18, paisActual);
            stmt.setString(19, usuario);
            stmt.setString(20, pass);
            boolean rs = stmt.execute();
            stmt2.setInt(1, (int)id);
            stmt2.setInt(2, 1);
            boolean con2 = stmt2.execute();
            stmt.close();
            stmt2.close();
            state.close();
            this.conexion.close();
            if (rs && con2) {
                return false;
            }
        } catch (SQLException ex) {
            if (this.conexion.getConexion() != null) {

                try {
                    System.err.println("Transacción Cancelada, Revirtiendo Cambios");
                    this.conexion.getConexion().rollback();
                } catch (SQLException e) {
                    System.err.println("Error al Momento de Revertir");
                    e.printStackTrace();
                }
                ex.printStackTrace();
            }
        }
        return true;
    }

}
