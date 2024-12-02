/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;


public class EstadoPendiente implements EstadoPedido {
     
    @Override
    public void procesar(Pedido pedido){
            System.out.println("Pedido procesado");
            pedido.setEstado(new EstadoEnviado());
    }
    
    @Override
    public void enviar(Pedido pedido){
            System.out.println("El pedido no se puede enviar, aún está pendiente.");
    }
    
    @Override
    public void entregar(Pedido pedido){
            System.out.println("El pedido no se puede enviar, aún está pendiente.");
    }
}
