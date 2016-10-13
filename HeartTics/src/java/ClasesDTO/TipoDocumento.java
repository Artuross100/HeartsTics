/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDTO;

/**
 *
 * @author estudiante
 */
public class TipoDocumento {
    
    private int idTipoDoc;
    private String nombreDoc;

    public TipoDocumento(int idTipoDoc, String nombreDoc) {
        this.idTipoDoc = idTipoDoc;
        this.nombreDoc = nombreDoc;
    }

    public TipoDocumento() {
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }
    
    
    
}
