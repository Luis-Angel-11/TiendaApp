/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tiendaapp.Interfaces;

import java.util.List;

/**
 *
 * @author Dell
 */
public interface Dao<E,ID> {
    List<E> getAll();
    E getByID(ID id);
    String Insert(E entidad);
    String Update(E entidad);
    String DeleteID(ID id);
    String getMessage();
}
