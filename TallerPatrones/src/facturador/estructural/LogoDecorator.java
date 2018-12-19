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
public class LogoDecorator extends DetalleDecorator {
    public LogoDecorator(){}
    
    public LogoDecorator(ComprobanteElectronico comprobante1) {
        super(comprobante1);
    }

    @Override
    public List<String> getDetallesEmisor() {
        super.getDetallesEmisor().add("Logo Decorator");
        return detallesEmisor;
    }
  
    
}
