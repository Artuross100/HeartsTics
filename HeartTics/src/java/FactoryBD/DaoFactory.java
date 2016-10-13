/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryBD;

import MySQLDao.*;
import java.sql.SQLException;

/**
 *
 * @author estudiante
 */
public class DaoFactory {
    
    public TipoDocumentoDao getTipoDocumento() throws SQLException{
        return new TipoDocumentoDao();
    }
    
    public UsuarioDao getUsuario() throws SQLException{
        return new UsuarioDao();
    }
}
