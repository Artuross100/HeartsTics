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
    
    public EstudianteDao getEstudiante() throws SQLException{
        return new EstudianteDao();
    }
    
    public AcudienteDao getAcudiente() throws SQLException{
        return new AcudienteDao();
    }
    
    public DocenteDao getDocente() throws SQLException{
        return new DocenteDao();
    }
    
    public MateriaDao getMateria () throws SQLException{
        return new MateriaDao();
    }
    
    public CursoDao getCurso () throws SQLException{
        return new CursoDao();
    }
}
