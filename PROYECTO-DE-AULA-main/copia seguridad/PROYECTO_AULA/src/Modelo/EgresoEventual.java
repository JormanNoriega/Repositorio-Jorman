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
public class EgresoEventual extends Egreso{
    
    private LocalDate fechaEgresoEventual;

    public EgresoEventual() {
    }

    public EgresoEventual(double egreso, String asunto) {
        super(egreso, asunto);
        this.fechaEgresoEventual = LocalDate.now();
    }

    public LocalDate getFechaEgresoEventual() {
        return fechaEgresoEventual;
    }

    public void setFechaEgresoEventual(LocalDate fechaEgresoEventual) {
        this.fechaEgresoEventual = fechaEgresoEventual;
    }

    @Override
    public String toString() {
        return super.toString()+"|| Fecha Egreso Eventual: " + fechaEgresoEventual;
    } 
}
