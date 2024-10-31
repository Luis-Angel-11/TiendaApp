/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tiendaapp.clases;

/**
 *
 * @author LAB-USR-SJL
 */
public interface EstadoPedido {
    void procesar(Pedido pedido);
    void enviar(Pedido pedido);
    void entregar(Pedido pedido);
}
