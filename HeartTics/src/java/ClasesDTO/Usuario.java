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
public class Usuario {

    private long idUsuario;
    private int idTipoUsuario;
    private TipoDocumento tipoDoc;
    private String numDoc;
    private String correo;
    private Date fechaNacimiento;
    private String foto;
    private String tipoSangre;
    private String ciudadActual;
    private String departamentoActual;
    private String genero;
    private String eps;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Date fechaActualizacion;
    private String ciudadNacimiento;
    private String departamentoNacimiento;
    private String paisNacimiento;
    private String paisActual;
    private String usuario;
    private String contra;

    public Usuario(long idUsuario,TipoDocumento tipoDoc, String numDoc, String correo, Date fechaNacimiento, String tipoSangre, String ciudadActual, String departamentoActual, String genero, String eps, String nombres, String apellidos, String telefono, String ciudadNacimiento, String departamentoNacimiento, String paisNacimiento, String paisActual, String usuario, String contra) {
        this.idUsuario = idUsuario;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.ciudadActual = ciudadActual;
        this.departamentoActual = departamentoActual;
        this.genero = genero;
        this.eps = eps;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.ciudadNacimiento = ciudadNacimiento;
        this.departamentoNacimiento = departamentoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.paisActual = paisActual;
        this.usuario = usuario;
        this.contra = contra;
    }

    //METODOS GETTER AND SETTER
    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public TipoDocumento getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDocumento tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getCiudadActual() {
        return ciudadActual;
    }

    public void setCiudadActual(String ciudadActual) {
        this.ciudadActual = ciudadActual;
    }

    public String getDepartamentoActual() {
        return departamentoActual;
    }

    public void setDepartamentoActual(String departamentoActual) {
        this.departamentoActual = departamentoActual;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public String getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    public void setDepartamentoNacimiento(String departamentoNacimiento) {
        this.departamentoNacimiento = departamentoNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getPaisActual() {
        return paisActual;
    }

    public void setPaisActual(String paisActual) {
        this.paisActual = paisActual;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return tipoDoc.getNombreDoc() + numDoc + correo + fechaNacimiento
                + foto + tipoSangre + ciudadActual
                + departamentoActual + genero + eps + nombres + apellidos
                + telefono + fechaActualizacion + ciudadNacimiento
                + departamentoNacimiento + paisNacimiento + paisActual + usuario;
    }

}
