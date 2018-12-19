/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.comportamentales;

import facturador.creacional.ComprobanteElectronico;

/**
 *
 * @author Palacios
 */
public class AutorizadorSRI{
    private Esquema esquema;
   
    public String numAutorizacionAsignado(){
        return String.valueOf((Math.random()*100)+1);
    }

    public AutorizadorSRI(Esquema esquema){
       this.esquema = esquema;
    }

    public void executeStrategy(ComprobanteElectronico comprobante){
        esquema.autorizar(comprobante);
    }    
}
