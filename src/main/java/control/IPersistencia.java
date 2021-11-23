/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhtey
 */
public interface IPersistencia <T>{
    public T buscar(T obj);
    public boolean registrar(T obj);
    public boolean actualizar(T obj);
    public boolean eliminar(int codigo);
    DefaultTableModel buscarNumPO();
    DefaultTableModel mostrarPOActivas();
    DefaultTableModel mostrarPOTerminadas();
}
