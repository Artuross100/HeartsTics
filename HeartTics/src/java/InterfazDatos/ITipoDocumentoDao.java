/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazDatos;

import ClasesDTO.TipoDocumento;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public interface ITipoDocumentoDao {
    
    public ArrayList<TipoDocumento> cargarTiposDocumento();
    
    public boolean registrarDocumento(String nombre);
}