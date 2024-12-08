/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaapp.DaoBd;

import com.mycompany.tiendaapp.BaseDatos.Conexion;
import com.mycompany.tiendaapp.Interfaces.DaoCliente;
import com.mycompany.tiendaapp.clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class DaoClienteDB implements DaoCliente{
    private String mensaje;
    private final Conexion con;

    public DaoClienteDB() {
        con = Conexion.getInstance();
    }

    @Override
    public List<Cliente> getAll() {
        List<Cliente> lista= null;
        String sql ="select * from Cliente";
        try(Connection c = con.getConexion();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            lista = new ArrayList<>();
            while(rs.next()){
                Cliente cl = new Cliente();
                cl.setId(rs.getInt(1));
                cl.setNombre(rs.getString(2));
                cl.setApellido(rs.getString(3));
                cl.setDni(rs.getString(4));
                cl.setTelefono(rs.getString(5));
                cl.setUser(rs.getString(6));
                cl.setPassword(rs.getString(7));
                lista.add(cl);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    @Override
    public Cliente getByID(Integer id) {
        Cliente cl = null;
        String sql = "SELECT id, nombre, apellido, dni, telefono, user ,password from Cliente where id = ?";
        try(Connection c = con.getConexion(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setInt(1, id);
            try(ResultSet rs = ps.executeQuery()) {
                //cl = new Cliente();
                if(rs.next()){
                    cl = new Cliente();
                    cl.setId(rs.getInt(1));
                    cl.setNombre(rs.getString(2));
                    cl.setApellido(rs.getString(3));
                    cl.setDni(rs.getString(4));
                    cl.setTelefono(rs.getString(5));
                    cl.setUser(rs.getString(6));
                    cl.setPassword(rs.getString(7));
                }
            } catch (Exception e) {
                mensaje = e.getMessage();
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return cl;
    }

    @Override
    public String Insert(Cliente entidad) {
        /*if (entidad.getId() == null) {
        Integer nuevoId = generarId();
        if (nuevoId == null) {
            return "Error al generar ID: " + mensaje;
        }
            entidad.setId(nuevoId);
        }*/
        String sql ="INSERT INTO Cliente(id,nombre,apellido,dni,telefono,user,password) VALUES(?,?,?,?,?,?,?)";
        try(Connection c = con.getConexion();PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, entidad.getId());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getApellido());
            ps.setString(4, entidad.getDni());
            ps.setString(5, entidad.getTelefono());
            ps.setString(6, entidad.getUser());
            ps.setString(7, entidad.getPassword());
            return (ps.executeUpdate()==0)
                    ? mensaje = "Error al insertar el cliente"
                    : null;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String Update(Cliente entidad) {
        String sql = """
                     UPDATE Cliente SET
                     nombre = ?
                     apellido = ?
                     dni = ?
                     telefono = ?
                     user = ?
                     password = ?
                     WHERE id  = ?;
                     """;
        try(Connection c = con.getConexion(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getApellido());
            ps.setString(3, entidad.getDni());
            ps.setString(4, entidad.getTelefono());
            ps.setString(5, entidad.getUser());
            ps.setString(6, entidad.getPassword());
            ps.setInt(7, entidad.getId());
            return (ps.executeUpdate() == 0)
                    ? mensaje = "Error al actualizar el cliente"
                    : null;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String DeleteID(Integer id) {
        String sql = "DELETE FROM Cliente WHERE id = ?";
        try(Connection c = con.getConexion(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            return(ps.executeUpdate()==0)
                    ? mensaje = "Error al eliminar el cliente"
                    : null;
        } catch (Exception e) {
        }
        return mensaje;
    }

    @Override
    public String getMessage() {
        return mensaje;
    }
    public Integer generarId() {
        String sql = """
                     SELECT COALESCE(MAX(id), 0) + 1 
                     AS nuevoId 
                     FROM Cliente;
                     """;
        try (Connection c = con.getConexion(); 
             PreparedStatement ps = c.prepareStatement(sql); 
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("nuevoId");
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return 1;
    }
}
