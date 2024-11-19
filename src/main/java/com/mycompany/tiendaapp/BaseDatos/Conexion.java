
package com.mycompany.tiendaapp.BaseDatos;


import java.sql.*;
import java.sql.DriverManager;
public class Conexion {
    
     //aplicando patron Singleton
    private static Conexion conexion;
    public String driver;
    public String url;
    public String login;
    public String clave;

    //constructor
    private Conexion() {
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/db_tienda?serverTimezone=UTC";
        this.login = "root";
        this.clave = "";
    }

    public static Conexion getConexion() {
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;

    }

    public Connection conectar() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, login, clave);
            System.out.println("Conexion correcta");
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
            System.out.println("no conecta");
        } catch (SQLException e1) {
            e1.printStackTrace();
            System.out.println("No conecta 1");
        }
        return cn;
    }

}
