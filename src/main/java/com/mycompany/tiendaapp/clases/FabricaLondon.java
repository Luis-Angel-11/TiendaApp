/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;

import com.mycompany.tiendaapp.Interfaces.FabricaMuebles;

/**
 *
 * @author ASUS
 */
public class FabricaLondon implements FabricaMuebles{

    @Override
    public Producto crearSilla() {
        return new SillaLondon(111, "Silla", 50);
    }

    @Override
    public Producto crearSofa() {
        return new SofaLondon(111, "Sofa", 150);
    }

    @Override
    public Producto crearMesa() {
        return new MesaLondon(111, "Mesa", 100);
    }
    
}
