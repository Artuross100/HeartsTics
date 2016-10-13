/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClasesDTO.TipoDocumento;
import Fachada.INegocioUtil;
import FactoryBD.DaoFactory;
import InterfazDatos.ITipoDocumentoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class NegocioUtil implements INegocioUtil{
    
    private DaoFactory factory;
    
    public NegocioUtil(){
        this.factory = new DaoFactory();
    }

    @Override
    public ArrayList<TipoDocumento> cargarTiposDocumento() {

       ITipoDocumentoDao tipo = null;
        try {
            tipo = this.factory.getTipoDocumento();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return tipo.cargarTiposDocumento();
        
    }
    
}
