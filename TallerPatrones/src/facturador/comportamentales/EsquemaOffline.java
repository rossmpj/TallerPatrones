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
public class EsquemaOffline extends AutorizadorSRI implements Esquema{

    public EsquemaOffline() {
    }
    
    @Override
    public void autorizar(ComprobanteElectronico comprobante){
        comprobante.setNumeroAutorizacion(comprobante.getClaveAcceso());
    }
}
