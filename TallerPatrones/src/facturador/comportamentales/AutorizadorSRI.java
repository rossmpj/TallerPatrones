/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.comportamentales;

import facturador.creacional.ComprobanteElectronico;
import java.util.Random;

/**
 *
 * @author Palacios
 */
public abstract class AutorizadorSRI implements Esquema{
      private String Esquema;
   
    public String numAutorizacionAsignado(){
        return String.valueOf((Math.random()*100)+1);
    }

    public String getEsquema() {
        return Esquema;
    }

    public void setEsquema(String Esquema) {
        this.Esquema = Esquema;
    }
    
}
