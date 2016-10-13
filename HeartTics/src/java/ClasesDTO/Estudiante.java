/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDTO;

import java.sql.Date;


/**
 *
 * @author estudiante
 */
public class Estudiante extends Usuario {

    private int grupo;
    private char curso;
    private String codigo;
    
    public Estudiante(TipoDocumento tipoDoc, String numDoc, String correo, 
            Date fechaNacimiento, String tipoSangre, String ciudadActual, 
            String departamentoActual, String genero, String eps, String nombres, 
            String apellidos, String telefono, String ciudadNacimiento, 
            String departamentoNacimiento, String paisNacimiento, String paisActual, 
            String usuario, String contra, int grupo, char curso, String codigo) {
        
        super(tipoDoc, numDoc, correo, fechaNacimiento, tipoSangre, ciudadActual, 
                departamentoActual, genero, eps, nombres, apellidos, telefono, 
                ciudadNacimiento, departamentoNacimiento, paisNacimiento, paisActual, 
                usuario, contra);
        this.grupo=grupo;
        this.curso=curso;
        this.codigo=codigo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public char getCurso() {
        return curso;
    }

    public void setCurso(char curso) {
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
