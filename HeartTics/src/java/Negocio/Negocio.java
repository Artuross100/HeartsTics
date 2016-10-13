/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClasesDTO.TipoDocumento;
import Fachada.INegocio;
import FactoryBD.DaoFactory;
import java.sql.Date;

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

        return true;

    }

}
