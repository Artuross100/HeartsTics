/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazDatos;

import ClasesDTO.Estudiante;
import ClasesDTO.TipoDocumento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public interface IUsuarioDao {
    
    public int registrarUsuario(TipoDocumento tipoDoc, String numDoc, String correo,
            Date fechaNacimiento, String tipoSangre, String ciudadActual,
            String departamentoActual, String genero, String eps,
            String nombres, String apellidos, String telefono, String ciudadNacimiento,
            String departamentoNacimiento, String paisNacimiento, String paisActual,
            String usuario, String contra);
    
    public ArrayList<Estudiante> listarEstudiantes() throws SQLException;
}