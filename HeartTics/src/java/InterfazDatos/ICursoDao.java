/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazDatos;

import ClasesDTO.Curso;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public interface ICursoDao {
    
    public ArrayList<Curso> listarCursos();
    
}
