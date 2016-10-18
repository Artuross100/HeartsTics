/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLDao;

import InterfazDatos.IEstudianteDao;
import Util.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Andrea
 */
public class EstudianteDao implements IEstudianteDao {
    
    private Conexion conexion;
    
    public EstudianteDao() throws SQLException{
        this.conexion = new Conexion();
    }

    public boolean registrarEstudiante(int id, int grupo){
    String consulta2 = "INSERT INTO Estudiante (idUsuario,idGrupo,estado ) VALUES(?,?,?)";        
    try{
        PreparedStatement stmt2 = this.conexion.getConexion().prepareStatement(consulta2);
        stmt2.setInt(1, id);
        stmt2.setInt(2, grupo);
        stmt2.setInt(3,1);
        boolean con2 = stmt2.execute();
        stmt2.close();
    }catch(SQLException e){
        e.printStackTrace();
        return false;
    }
    return false;
    }
}
