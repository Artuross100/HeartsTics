/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClasesDTO.Curso;
import ClasesDTO.Docente;
import ClasesDTO.TipoDocumento;
import Fachada.INegocioUtil;
import FactoryBD.DaoFactory;
import InterfazDatos.ICursoDao;
import InterfazDatos.IDocenteDao;
import InterfazDatos.ITipoDocumentoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class NegocioUtil implements INegocioUtil {

    private DaoFactory factory;

    public NegocioUtil() {
        this.factory = new DaoFactory();
    }

    @Override
    public ArrayList<TipoDocumento> cargarTiposDocumento() {

        ITipoDocumentoDao tipo = null;
        try {
            tipo = this.factory.getTipoDocumento();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tipo.cargarTiposDocumento();

    }

    @Override
    public boolean registrarDocumento(String nombre) {

        try {
            ITipoDocumentoDao tipo = this.factory.getTipoDocumento();
            return tipo.registrarDocumento(nombre);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public String eliminarTipoDoc(String[] eliminar) {
        String rts = "Los cambios se realizaron con éxito";
        int c = 0;
        try {
            ITipoDocumentoDao tipo = this.factory.getTipoDocumento();
            for (String doc : eliminar) {
                if (tipo.eliminar(doc)) {
                    c++;
                }
            }
            if (c > 0) {
                rts = "Error al eliminar algunos documentos";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Error al intentar eliminar";
        }
        return rts;
    }

    @Override
    public ArrayList<Curso> listarCursos() {
        try {
            ICursoDao curso = this.factory.getCurso();
            return curso.listarCursos();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Docente> listarDocentes() {
        try{
            IDocenteDao doc = this.factory.getDocente();
            return doc.listarDocentes();
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
