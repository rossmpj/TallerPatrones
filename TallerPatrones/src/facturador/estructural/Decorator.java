/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;
import java.util.LinkedList;

/**
 *
 * @author Administrador
 */
public class Decorator {
    
     private ComprobanteElectronico comprobante;

    public LinkedList<String> getDecorator() {
        return (LinkedList<String>) this.comprobante.getDetallesEmisor();
    }

    public ComprobanteElectronico getComprobante() {
        return this.comprobante;
    }
    
    
}
