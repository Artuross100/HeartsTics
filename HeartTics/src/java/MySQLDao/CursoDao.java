/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLDao;

import ClasesDTO.Curso;
import InterfazDatos.ICursoDao;
import Util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class CursoDao implements ICursoDao {

    private Conexion conexion;

    public CursoDao() throws SQLException {
        this.conexion = new Conexion();
    }

    @Override
    public ArrayList<Curso> listarCursos() {
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        String consulta = "SELECT * FROM Curso ORDER BY idCurso";
        boolean a = false;
        int b = 0;
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                b = rs.getInt("estado");
                if (b == 1) {
                    a = true;
                }
                cursos.add(new Curso(rs.getInt("idCurso"), a));
            }
            rs.close();
            stmt.close();
            this.conexion.close();
            return cursos;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
