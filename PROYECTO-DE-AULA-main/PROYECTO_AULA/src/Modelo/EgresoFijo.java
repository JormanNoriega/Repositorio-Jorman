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
public class EgresoFijo extends Egreso{
    
    private LocalDate fechaInicioEgresoFijo;
    private int frecuenciaEgresoFijo;

    public EgresoFijo() {
    }

    public EgresoFijo(int frecuenciaEgresoFijo,LocalDate fechaInicioEgresoFijo , double egreso, String asunto) {
        super(egreso, asunto);
        this.fechaInicioEgresoFijo = fechaInicioEgresoFijo;
        this.frecuenciaEgresoFijo = frecuenciaEgresoFijo;
    }

    public LocalDate getFechaInicioEgresoFijo() {
        return fechaInicioEgresoFijo;
    }

    public void setFechaInicioEgresoFijo(LocalDate fechaInicioEgresoFijo) {
        this.fechaInicioEgresoFijo = fechaInicioEgresoFijo;
    }

    public int getFrecuenciaEgresoFijo() {
        return frecuenciaEgresoFijo;
    }

    public void setFrecuenciaEgresoFijo(int frecuenciaEgresoFijo) {
        this.frecuenciaEgresoFijo = frecuenciaEgresoFijo;
    }

    @Override
    public String toString() {
        return super.toString()+"|| Inicio Del Egreso Fijo: " + fechaInicioEgresoFijo + "|| Frecuencia Del Egreso Fijo: " + frecuenciaEgresoFijo;
    }
    
    
    

 
}
