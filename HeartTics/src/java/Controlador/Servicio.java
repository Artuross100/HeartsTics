/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ClasesDTO.TipoDocumento;
import Fachada.INegocio;
import Fachada.INegocioUtil;
import Negocio.Negocio;
import Negocio.NegocioUtil;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Servicio {

    private INegocioUtil negocioUtil;
    private INegocio negocio;
    private ArrayList<TipoDocumento> tipos;

    public Servicio() {
        this.negocioUtil = new NegocioUtil();
        this.negocio = new Negocio();
        this.tipos = new ArrayList<>();
    }

    public ArrayList<TipoDocumento> cargarDocumentos() {
        this.tipos = this.negocioUtil.cargarTiposDocumento();
        return tipos;
    }

    public boolean registrarUsuario(int tipoDoc, String numDoc, String correo,
            Date fechaNacimiento, String tipoSangre, String ciudadActual,
            String departamentoActual, String genero, String eps, String nombres,
            String apellidos, String telefono, String ciudadNacimiento, String departamentoNacimiento,
            String paisNacimiento, String paisActual, String usuario, String contra) {

        boolean x = true;
        TipoDocumento t = this.buscarDocumento(tipoDoc);
        if (t != null) {
            System.out.println("Entro a servicio");
            x = this.negocio.registrarEstudiante(t, numDoc, correo, fechaNacimiento, 
                    tipoSangre, ciudadActual, departamentoActual, genero, eps, nombres, 
                    apellidos, telefono, ciudadNacimiento, departamentoNacimiento, paisNacimiento, 
                    paisActual, usuario, contra);
            System.out.println("Salio de servicio");
        }
        return x;
    }

    private TipoDocumento buscarDocumento(int tipo) {
        for (TipoDocumento t : this.tipos) {
            if (t.getIdTipoDoc() == tipo) {
                return t;
            }
        }
        return null;
    }

}
