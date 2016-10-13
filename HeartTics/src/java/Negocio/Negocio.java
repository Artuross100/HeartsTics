/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClasesDTO.TipoDocumento;
import Fachada.INegocio;
import FactoryBD.DaoFactory;
import InterfazDatos.IUsuarioDao;
import java.sql.SQLException;
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
            String departamentoNacimiento, String paisNacimiento, String paisActual, String usuario, String contra) {
        
        try {
            IUsuarioDao user = this.factory.getUsuario();
            return user.registrarEstudiante(tipoDoc, numDoc, correo, fechaNacimiento, 
                    tipoSangre, ciudadActual, departamentoActual, genero, eps, nombres, 
                    apellidos, telefono, ciudadNacimiento, departamentoNacimiento, paisNacimiento, 
                    paisActual, usuario, contra);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;

    }

}
