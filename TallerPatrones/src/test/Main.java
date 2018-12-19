/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;
import facturador.estructural.DetalleDecorator;
import facturador.estructural.FooterDecorator;
import facturador.estructural.LogoDecorator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        ComprobantesFactory compFactory = new ComprobantesFactory();
        List<String> detallesEmisor = new ArrayList<>();
        detallesEmisor.add("empleado Andres Vera");
        
        ComprobanteElectronico fact = compFactory.getComprobante("FACTURA");
        
        fact.setClaveAcceso("1223");
        fact.setCodigo(12324);
        fact.setFecha(LocalDate.now());
        fact.setNombreCliente("ROSA");
        fact.setNumeroAutorizacion("244475687");
        fact.elegirEsquema("Offline");
        fact.setDetallesEmisor(detallesEmisor);
        System.out.println("Logo de Comprobante ");
        DetalleDecorator logo = new LogoDecorator(fact);
        System.out.println(logo.getDetallesEmisor());
        System.out.println("Footer de Comprobante");
        DetalleDecorator footer = new FooterDecorator(fact);
        System.out.println(footer.getDetallesEmisor());
        
        System.out.println(fact);
        
        ComprobanteElectronico guia = compFactory.getComprobante("GUIAREMISION");
        guia.setCodigo(243546);
        guia.setClaveAcceso("fd46358d");
        guia.setDetallesEmisor(detallesEmisor);
        guia.setNombreCliente("Carlos Andrade");
        guia.setNumeroAutorizacion("aut001");
        guia.elegirEsquema("Online");
        guia.setFecha(LocalDate.now());
        System.out.println("Logo de Comprobante ");
        DetalleDecorator logo2 = new LogoDecorator(guia);
        //System.out.println(logo2.getDetallesEmisor());
        System.out.println("Footer de Comprobante");
        DetalleDecorator footer2 = new FooterDecorator(guia);
        //System.out.println(footer2.getDetallesEmisor());
        System.out.println(guia);
        
        ComprobanteElectronico nota = compFactory.getComprobante("NOTACREDITO");
        nota.setNumeroAutorizacion("2436");
        nota.setFecha(LocalDate.now());
        nota.setClaveAcceso("not002");
        nota.setCodigo(1110001);
        nota.setNombreCliente("Juan Parraga");
        nota.setDetallesEmisor(detallesEmisor);
        nota.elegirEsquema("Offline");
        System.out.println("Logo de Comprobante ");
        DetalleDecorator logo3 = new LogoDecorator(nota);
        //System.out.println(logo3.getDetallesEmisor());
        System.out.println("Footer de Comprobante");
        DetalleDecorator footer3 = new FooterDecorator(nota);
        //System.out.println(footer3.getDetallesEmisor());
        System.out.println(nota);
        
    }
    
}