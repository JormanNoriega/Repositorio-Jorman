/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import modelo.Vehiculo;

/**
 *
 * @author Jorman
 */
public interface IAlquilados {
    
    public abstract boolean AgregarVehiculoRenta();
    public Vehiculo eliminarVehiculoDevuelto();
    public int getTotalAlquilados();
}
