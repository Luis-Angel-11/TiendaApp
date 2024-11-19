/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.clases;


public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private String color;
    private double precio;
    private String tamaño;
    private int TipoEnvio; //hacerlo con enum opcional
    private boolean envuelto;
    //agregar stock
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public double getPrecio() {
        return precio;
    }    
    public Producto(ProductoBuilder builder){
        this.id= builder.id;
        this.nombre= builder.nombre;
        this.categoria=  builder.categoria;
        this.color = builder.color;
        this.precio = builder.precio;
        this.tamaño =  builder.tamaño;
        this.TipoEnvio = builder.TipoEnvio;
        this.envuelto =  builder.envuelto;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("*Producto\n");
        sb.append("*Id: ").append(id);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nCategoria: ").append(categoria);
        sb.append("\nColor: ").append(color);
        sb.append("\nPrecio: ").append(precio);
        sb.append("\nTamanio: ").append(tamaño);
        sb.append("\nTipo de Envio: ").append(TipoEnvio);
        sb.append("\nEnvuelto: ").append(envuelto);
        return sb.toString();
    }
    public static class ProductoBuilder {
        private int id;
        private String nombre;
        private String categoria;
        private String color;
        private double precio;
        private String tamaño;
        private int TipoEnvio; 
        private boolean envuelto;
        //constructores obligatorios
        public ProductoBuilder(int id, String nombre, String categoria, double precio){
            this.id =id;
            this.nombre= nombre;
            this.categoria= categoria;
            this.precio = precio;
        }
        public ProductoBuilder setColor(String color){
            this.color=color;
            return this;
        }
        public ProductoBuilder setTamaño(String tamaño){
            this.tamaño=tamaño;
            return this;
        }
        public ProductoBuilder setTipoEnvio(int TipoEnvio){
            this.TipoEnvio=TipoEnvio;
            return this;
        }
        public ProductoBuilder setEnvuelto(boolean envuelto){
            this.envuelto=envuelto;
            return this;
        }
        
        public Producto build() {
            return new Producto(this);
        }
    }
}
