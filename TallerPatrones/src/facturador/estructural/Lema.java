/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

/**
 *
 * @author cinviram
 */
public class Lema extends Decorator{
    private ComprobanteElectronico comprobante;

    public Lema(ComprobanteElectronico comprobanteE) {
        this.comprobante = comprobanteE;
    }
    
}
