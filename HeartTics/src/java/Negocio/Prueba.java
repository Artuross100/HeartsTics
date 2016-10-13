/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClasesDTO.TipoDocumento;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Prueba {
    public static void main(String args[]){
        NegocioUtil n= new NegocioUtil();
        ArrayList <TipoDocumento> t =n.cargarTiposDocumento();
        System.out.println(t.toString());
    }
}
