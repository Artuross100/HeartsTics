/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import ClasesDTO.Estudiante;
import ClasesDTO.TipoDocumento;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author estudiante
 */
public interface INegocio {
    
     public boolean registrarEstudiante(TipoDocumento tipoDoc, String numDoc, String correo, 
                Date fechaNacimiento, String tipoSangre, String ciudadActual, 
                String departamentoActual, String genero, String eps, 
                String nombres, String apellidos, String telefono, String ciudadNacimiento, 
                String departamentoNacimiento, String paisNacimiento, String paisActual, 
                String usuario, String contra, int grupo);
     
     public ArrayList<Estudiante> listarEstudiantes();
     
     public boolean registrarDocente(TipoDocumento tipoDoc, String numDoc, String correo, 
                Date fechaNacimiento, String tipoSangre, String ciudadActual, 
                String departamentoActual, String genero, String eps, 
                String nombres, String apellidos, String telefono, String ciudadNacimiento, 
                String departamentoNacimiento, String paisNacimiento, String paisActual, 
                String usuario, String contra);
     
     public boolean registrarAcudiente(TipoDocumento tipoDoc, String numDoc, String correo, 
                Date fechaNacimiento, String tipoSangre, String ciudadActual, 
                String departamentoActual, String genero, String eps, 
                String nombres, String apellidos, String telefono, String ciudadNacimiento, 
                String departamentoNacimiento, String paisNacimiento, String paisActual, 
                String usuario, String contra, long estudiante, String profesion);
}
