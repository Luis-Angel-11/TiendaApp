/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;

/**
 *
 * @author LAB-USR-SJL
 */
public class Pedido {
    private EstadoPedido estado;
    
    public Pedido(){
        estado = new EstadoPendiente();
    }
    public void setEstado(EstadoPedido estado){
        this.estado = estado;
    }
    
    public void procesar() {
        estado.procesar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    public void entregar() {
        estado.entregar(this);
    }
}
