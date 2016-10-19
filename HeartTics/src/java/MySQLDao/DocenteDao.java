/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLDao;

import ClasesDTO.Docente;
import ClasesDTO.TipoDocumento;
import InterfazDatos.IDocenteDao;
import Util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class DocenteDao implements IDocenteDao {

    private Conexion conexion;

    public DocenteDao() throws SQLException {
        this.conexion = new Conexion();
    }

    @Override
    public boolean registrarDocente(int tipo) {
        String consulta = "INSERT INTO Docente values(?)";
        boolean a;
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setInt(1, tipo);
            a = stmt.execute();
            stmt.close();
            this.conexion.close();
            return a;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<Docente> listarDocentes() {
        ArrayList<Docente> docentes = new ArrayList<Docente>();
        String consulta = "SELECT * FROM Usuario where idTipoUsuario=?";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            stmt.setInt(1,2);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                docentes.add(new Docente(rs.getLong("idUsuario"),obtenerTipoDoc(rs.getInt("idTipoDocumento")),
                        rs.getString("numDoc"),
                        rs.getString("correo"), rs.getDate("fechaNacimiento"),
                        rs.getString("tipoSangre"), rs.getString("ciudadActual"),
                        rs.getString("departamentoActual"), rs.getString("genero"),
                        rs.getString("eps"), rs.getString("nombres"), rs.getString("apellidos"),
                        rs.getString("telefono"), rs.getString("ciudadNacimiento"),
                        rs.getString("departamentoNacimiento"), rs.getString("paisNacimiento"),
                        rs.getString("paisActual"), rs.getString("nombreUsuario"),
                        rs.getString("contra")));
            }
            return docentes;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private TipoDocumento obtenerTipoDoc(int tipo) throws SQLException {
        TipoDocumentoDao tDao = new TipoDocumentoDao();
        ArrayList<TipoDocumento> tipos = tDao.cargarTiposDocumento();
        for (TipoDocumento t : tipos) {
            if (t.getIdTipoDoc() == tipo) {
                return t;
            }
        }
        return null;
    }

}
