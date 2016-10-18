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
        ArrayList<TipoDocumento> tipos=new ArrayList<TipoDocumento>();
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
            ex.printStackTrace();
            return null;
        }
       
        return tipos;
    }
    @Override
    public boolean registrarDocumento(String nombre){
        String consulta = "INSERT INTO TipoDocumento (nombre) VALUES(?)";
        try{
            PreparedStatement stmt = this.conexion.getConexion().prpareStatement(consulta);
            stmt.setString(1,nombre);
            boolean rs = stmt.execute();
            stmt.close();
            this.conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
        return false;
    }
}
