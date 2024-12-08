
package com.mycompany.tiendaapp.BaseDatos;


import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.sql.DriverManager;
public class Conexion {
    
     //aplicando patron Singleton
    private static Conexion instancia = null;
    
    public String driver="com.mysql.cj.jdbc.Driver";
    public String url="jdbc:mysql://localhost:3306/TiendaApp";
    public String user="root";
    public String password="root";

    //constructor
    private Conexion() {
        
    }
    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConexion() throws SQLException {
        Connection con = null;
        try {
            Class.forName(driver)
                    .getDeclaredConstructor().newInstance();
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException | SQLException e) {
            throw new SQLException(e.getMessage());
        }

        return con;
    }
    
    }