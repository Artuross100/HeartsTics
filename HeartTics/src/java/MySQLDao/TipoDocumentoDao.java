/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLDao;

import ClasesDTO.TipoDocumento;
import InterfazDatos.ITipoDocumentoDao;
import Util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class TipoDocumentoDao implements ITipoDocumentoDao {

    private Conexion conexion;
    
    public TipoDocumentoDao() throws SQLException{
        this.conexion = new Conexion();
    }
    
    @Override
    public ArrayList<TipoDocumento> cargarTiposDocumento() {
        ArrayList<TipoDocumento> tipos=new ArrayList<>();
        String consulta= "SELECT * FROM TipoDocumento";
        try {
            PreparedStatement stmt = this.conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                tipos.add(new TipoDocumento(rs.getInt("idTipoDocumento"),rs.getString("nombre")));
            }
            rs.close();
            stmt.close();
            this.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return tipos;
    }
    /*
    
    */
}
