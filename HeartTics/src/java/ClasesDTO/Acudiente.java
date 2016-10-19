/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDTO;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public class Acudiente extends Usuario{
    
    private ArrayList<Estudiante> estudiantes;
    private String profesion;

    public Acudiente(long idUsuario, TipoDocumento tipoDoc, String numDoc, 
            String correo, Date fechaNacimiento, String tipoSangre, String ciudadActual, 
            String departamentoActual, String genero, String eps, String nombres, 
            String apellidos, String telefono, String ciudadNacimiento, String departamentoNacimiento, 
            String paisNacimiento, String paisActual, String usuario, String contra, String profesion) {
        
        super(idUsuario, tipoDoc, numDoc, correo, fechaNacimiento, tipoSangre, 
                ciudadActual, departamentoActual, genero, eps, nombres, apellidos, 
                telefono, ciudadNacimiento, departamentoNacimiento, paisNacimiento, 
                paisActual, usuario, contra);
    }
    
}
