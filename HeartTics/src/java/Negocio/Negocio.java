/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClasesDTO.Estudiante;
import ClasesDTO.TipoDocumento;
import Fachada.INegocio;
import FactoryBD.DaoFactory;
import InterfazDatos.IDocenteDao;
import InterfazDatos.IEstudianteDao;
import InterfazDatos.IUsuarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class Negocio implements INegocio {

    private DaoFactory factory;

    public Negocio() {
        this.factory = new DaoFactory();
    }

    @Override
    public boolean registrarEstudiante(TipoDocumento tipoDoc, String numDoc, String correo,
            Date fechaNacimiento, String tipoSangre, String ciudadActual,
            String departamentoActual, String genero, String eps,
            String nombres, String apellidos, String telefono, String ciudadNacimiento,
            String departamentoNacimiento, String paisNacimiento, String paisActual, String usuario, String contra, int grupo) {
        int a = 0;
        try {
            IUsuarioDao user = this.factory.getUsuario();
            IEstudianteDao est = this.factory.getEstudiante();
            a= user.registrarUsuario(tipoDoc, numDoc, correo, fechaNacimiento, 
                    tipoSangre, ciudadActual, departamentoActual, genero, eps, nombres, 
                    apellidos, telefono, ciudadNacimiento, departamentoNacimiento, paisNacimiento, 
                    paisActual, usuario, contra,1);
            return est.registrarEstudiante(a, grupo);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;

    }
    
    @Override
    public boolean registrarDocente(TipoDocumento tipoDoc, String numDoc, String correo,
            Date fechaNacimiento, String tipoSangre, String ciudadActual,
            String departamentoActual, String genero, String eps,
            String nombres, String apellidos, String telefono, String ciudadNacimiento,
            String departamentoNacimiento, String paisNacimiento, String paisActual, String usuario, String contra) {
        
        int a=0;
        
        try {
            IUsuarioDao user = this.factory.getUsuario();
            IDocenteDao doc = this.factory.getDocente();
            a = user.registrarUsuario(tipoDoc, numDoc, correo, fechaNacimiento, 
                    tipoSangre, ciudadActual, departamentoActual, genero, eps, nombres, 
                    apellidos, telefono, ciudadNacimiento, departamentoNacimiento, paisNacimiento, 
                    paisActual, usuario, contra,2);
            return doc.registrarDocente(a);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;

    }

    @Override
    public ArrayList<Estudiante> listarEstudiantes() {
        try {
            IUsuarioDao user= this.factory.getUsuario();
            return user.listarEstudiantes();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
