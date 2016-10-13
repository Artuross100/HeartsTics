/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import ClasesDTO.TipoDocumento;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public interface INegocioUtil {
    public ArrayList<TipoDocumento> cargarTiposDocumento();
}
