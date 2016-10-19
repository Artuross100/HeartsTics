/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLDao;

import InterfazDatos.IAcudienteDao;
import Util.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Andrea
 */
public class AcudienteDao  implements IAcudienteDao{

    private Conexion conexion;
    
    public AcudienteDao() throws SQLException{
        this.conexion = new Conexion();
    }
    @Override
    public boolean registrarAcudiente(long a, long estudiante, String profesion) {
        String consulta = "INSERT INTO Acudiente (idUsuario, idEstudiante, profesion) values(?,?,?)";
        boolean exito;
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setLong(1, a);
            stmt.setLong(2, estudiante);
            stmt.setString(3, profesion);
            exito = stmt.execute();
            stmt.close();
            this.conexion.close();
            return exito;
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
    
}
