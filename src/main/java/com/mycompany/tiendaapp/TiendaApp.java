/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaapp;

import com.mycompany.tiendaapp.BaseDatos.Conexion;
import com.mycompany.tiendaapp.Interfaces.FabricaMuebles;
import com.mycompany.tiendaapp.clases.FabricaLondon;
import com.mycompany.tiendaapp.clases.Producto;
import java.sql.Connection;
import java.sql.SQLException;

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
        
        //Conexion cone = Conexion.getConexion();
        //cone.conectar();

        try {
            // Obtener la instancia de la conexión
            Conexion conexion = Conexion.getInstance();
            
            // Intentar obtener la conexión
            Connection con = conexion.getConexion();
            
            // Verificar si la conexión es exitosa
            if (con != null) {
                System.out.println("Conexión exitosa a la base de datos");
            } else {
                System.out.println("La conexión no fue exitosa");
            }
        } catch (SQLException e) {
            // Si ocurre un error de SQL, lo mostramos
            System.out.println("Error de conexión: " + e.getMessage());
        }
        
        
    }
}
