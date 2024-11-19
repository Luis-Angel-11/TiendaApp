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
public class FabricaKali implements FabricaMuebles{

    @Override
    public Producto crearSilla() {
        return new SillaKali(111, "Silla", 50);
    }

    @Override
    public Producto crearSofa() {
        return new SofaKali(111, "Sofa", 150);
    }

    @Override
    public Producto crearMesa() {
        return new MesaKali(111, "Mesa", 100);
    }
    
}
