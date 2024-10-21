/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Carrito {
    
    private  List<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }
    public List<Producto> getProductos(){
        return productos;
    }
    public void vaciarCarrito(){
        productos.clear();
    }
    public void mostrarCarrito(){
        if(productos.isEmpty()){
            System.out.println("El carrito esta vacio");
        } else {
            for(Producto pr: productos){
                System.out.println(pr);
            }
        }
    }
}
