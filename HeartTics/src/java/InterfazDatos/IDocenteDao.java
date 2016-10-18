/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazDatos;

import ClasesDTO.Docente;
import java.util.ArrayList;

/**
 *
 * @author Andrea
 */
public interface IDocenteDao {
    
    public boolean registrarDocente(int tipo);
    
    public ArrayList<Docente> listarDocentes();
    
}
