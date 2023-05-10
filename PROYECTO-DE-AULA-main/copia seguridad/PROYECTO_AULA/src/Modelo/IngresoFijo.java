/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Jorman
 */
public class IngresoFijo extends Ingreso{
    
    private LocalDate fechaInicioIngresoFijo;
    private int frecuenciaIngresoFijo;

    public IngresoFijo() {
    }
    

    public IngresoFijo(int frecuenciaIngresoFijo,LocalDate fechaInicioIngresoFijo ,double ingreso, String asunto) {
        super(ingreso, asunto);
        this.fechaInicioIngresoFijo = fechaInicioIngresoFijo;
        this.frecuenciaIngresoFijo = frecuenciaIngresoFijo;
    }

    public LocalDate getFechaInicioIngresoFijo() {
        return fechaInicioIngresoFijo;
    }

    public void setFechaInicioIngresoFijo(LocalDate fechaInicioIngresoFijo) {
        this.fechaInicioIngresoFijo = fechaInicioIngresoFijo;
    }

    public int getFrecuenciaIngresoFijo() {
        return frecuenciaIngresoFijo;
    }

    public void setFrecuenciaIngresoFijo(int frecuenciaIngresoFijo) {
        this.frecuenciaIngresoFijo = frecuenciaIngresoFijo;
    }

    @Override
    public String toString() {
        return super.toString() + "|| Inicio Del Ingreso Fijo: " + fechaInicioIngresoFijo + "|| Frecuencia Del Ingreso Fijo: " + frecuenciaIngresoFijo;
    }

}
