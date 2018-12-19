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
 * @author cinviram
 */
public class FooterDecorator extends DetalleDecorator{
    public FooterDecorator(){}
 
 public FooterDecorator(ComprobanteElectronico comprobante2){
     super(comprobante2);
 }

 @Override
    public List<String> getDetallesEmisor() {
        super.getDetallesEmisor().add("Footer Decorator...");
        return comprobante.getDetallesEmisor();
    }
    
}
