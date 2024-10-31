 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;

/**
 *
 * @author LAB-USR-SJL
 */
public class EstadoEnviado implements EstadoPedido {

    @Override
    public void procesar(Pedido pedido) {
        System.out.println("El pedido ya esta enviado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("El pedido esta enviado");
        pedido.setEstado(new EstadoEntregado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("El pedido no puede ser entregado, esta en camino");
    }
    
}
