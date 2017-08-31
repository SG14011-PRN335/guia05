/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Fatima Calderon
 */
@LocalBean
@Dependent

public class Utilities implements Serializable{
    
    public String getResume(String texto){
   String Captura = texto;
   String SubCaptura= Captura.substring(1,21);
       
    return SubCaptura;
    }
    
    public String capitalizar(String texto){
        String captura = texto;
        String capitalizado = "";
        String[] palabras = captura.split(" ");
        for(int i = 0; i < palabras.length; i++) {
 
        capitalizado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1, palabras[i].length()).toLowerCase() + " ";
        }
        capitalizado = capitalizado.trim();
        
        return capitalizado;
    }
    
    public int ContarCoincidencias(String frase,String texto){
          
        return 1;
    }

}
