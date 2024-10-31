/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;

/**
 *
 * @author LAB-USR-SJL
 */
public class EstadoEntregado implements EstadoPedido{

    @Override
    public void procesar(Pedido pedido) {
        System.out.println("El pedido ya fue entregado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("El pedido ya fue entregado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("El pedido ya fue entregado");
    }
    
}
