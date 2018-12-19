/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.comportamentales;

import facturador.creacional.ComprobanteElectronico;

/**
 *
 * @author dannyleo
 */
public class EsquemaOnline implements Esquema{
    
 
    public EsquemaOnline(){
    }

    @Override
    public void autorizar(ComprobanteElectronico comprobante){
        String key = "abc0345";
        comprobante.setClaveAcceso(key);
        System.out.println("\t*Autorización online");
    }
}
