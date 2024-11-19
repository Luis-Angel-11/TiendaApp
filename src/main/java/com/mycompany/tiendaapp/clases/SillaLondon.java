/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;

/**
 *
 * @author ASUS
 */
public class SillaLondon extends Producto{
    
    public SillaLondon(int id,String nombre,double precio) {
        super(new Producto.ProductoBuilder(id, nombre, "Muebles", precio)
        .setColor("blanco"));
    }
    
}
