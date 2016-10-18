/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import ClasesDTO.Curso;
import ClasesDTO.Docente;
import ClasesDTO.TipoDocumento;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public interface INegocioUtil {
    
    public ArrayList<TipoDocumento> cargarTiposDocumento();
    
    public boolean registrarDocumento(String nombre);
    
    public String eliminarTipoDoc(String []eliminar);
    
    public ArrayList<Curso> listarCursos();
    
    public ArrayList<Docente> listarDocentes();
    
}