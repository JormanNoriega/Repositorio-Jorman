/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Datos.IAlquilados;
import java.util.ArrayList;

/**
 *
 * @author Jorman
 */
public abstract class Vehiculo implements IAlquilados{

    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract double getImporteRenta();

    public abstract String getDatosTipoVehiculo();

    public String getDatosVehiculo() {
        return "Tipo de vehiculo: " + getDatosTipoVehiculo() + "Placa: " + getPlaca() + "Importe de renta: " + getImporteRenta();
    }
}
