/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaapp;

import com.mycompany.tiendaapp.clases.Carrito;
import com.mycompany.tiendaapp.clases.Producto;

/**
 compra y gestion de productos
 */
public class TiendaApp {

    public static void main(String[] args) {
        Carrito carr = new Carrito();
        Producto laptop = new Producto
                .ProductoBuilder(1, "Asus", "Tecnologico", 1500)
                .setColor("Negro")
                .setEnvuelto(true)
                .setTamaño("mediano")
                .setTipoEnvio(1)
                .build();
        System.out.println(laptop);
        Producto mesa = new Producto
                .ProductoBuilder(2, "mesa London", "Mueble", 300)
                .setColor("Almendra")
                .build();
        System.out.println("**********************");
        carr.agregarProducto(laptop);
        carr.agregarProducto(mesa);
        carr.mostrarCarrito();
    }
}
