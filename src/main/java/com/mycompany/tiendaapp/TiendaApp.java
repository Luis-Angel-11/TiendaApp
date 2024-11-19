/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaapp;

import com.mycompany.tiendaapp.BaseDatos.Conexion;
import com.mycompany.tiendaapp.Interfaces.FabricaMuebles;
import com.mycompany.tiendaapp.clases.FabricaLondon;
import com.mycompany.tiendaapp.clases.Producto;

/**
 compra y gestion de productos
 */
public class TiendaApp {

    public static void main(String[] args) {
        //var aplicativo = new App();
        /*App.setLookAndFeel();
        App aplicativo = new App();
        aplicativo.setVisible(true);
        aplicativo.setLocationRelativeTo(null);
        /*CarroProducto carr = new CarroProducto();*/
        
        
        /*System.out.println("**********************");
        carr.agregarProducto(laptop);
        carr.agregarProducto(mesa);
        carr.mostrarCarrito();
        FabricaMuebles l = new FabricaLondon();
        Producto mesa = l.crearMesa();
        System.out.println(mesa);*/
        
        Conexion cone = Conexion.getConexion();
        cone.conectar();

        
        
        
    }
}
