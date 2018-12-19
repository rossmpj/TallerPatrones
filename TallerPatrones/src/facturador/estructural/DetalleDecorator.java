/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;
import java.util.List;

/**
 *
 * @author Administrador
 */
public abstract class DetalleDecorator extends ComprobanteElectronico{
    
    protected ComprobanteElectronico comprobante;
    
    public DetalleDecorator(){
    }
    public DetalleDecorator(ComprobanteElectronico comprobante){
        this.comprobante=comprobante;
    }

    @Override
    public List<String> getDetallesEmisor() {
        return comprobante.getDetallesEmisor();
    }
    
    
}
