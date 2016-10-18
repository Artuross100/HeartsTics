/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.util.Date;
import java.util.ArrayList;
import Fachada.*;
import ClasesDTO.*;
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
        this.tipos = new ArrayList<TipoDocumento>();
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
            x = this.negocio.registrarEstudiante(t, numDoc, correo, fechaNacimiento, 
                    tipoSangre, ciudadActual, departamentoActual, genero, eps, nombres, 
                    apellidos, telefono, ciudadNacimiento, departamentoNacimiento, paisNacimiento, 
                    paisActual, usuario, contra);
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
    
    public ArrayList<Estudiante> listarEstudiantes(){
        return this.negocio.listarEstudiantes();
    }
    
    public boolean registrarDocumento(String nombre){
        return this.negocioUtil.registrarDocumento(nombre);
    }

    public String eliminarTipoDoc(String []eliminar){
        return this.negocioUtil.eliminarTipodoc(eliminar);
    }
    
    public boolean registrarDocente(int tipoDoc, String numDoc, String correo,
            Date fechaNacimiento, String tipoSangre, String ciudadActual,
            String departamentoActual, String genero, String eps, String nombres,
            String apellidos, String telefono, String ciudadNacimiento, String departamentoNacimiento,
            String paisNacimiento, String paisActual, String usuario, String contra) {
        
        boolean x = true;
        TipoDocumento t = this.buscarDocumento(tipoDoc);
        if (t != null) {
            x = this.negocio.registrarDocente(t, numDoc, correo, fechaNacimiento, 
                    tipoSangre, ciudadActual, departamentoActual, genero, eps, nombres, 
                    apellidos, telefono, ciudadNacimiento, departamentoNacimiento, paisNacimiento, 
                    paisActual, usuario, contra);
        }
        return x;
        
    }
}