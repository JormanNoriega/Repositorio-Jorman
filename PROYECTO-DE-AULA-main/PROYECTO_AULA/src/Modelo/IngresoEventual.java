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
public class IngresoEventual extends Ingreso {

    private LocalDate fechaIngresoEventual;

    public IngresoEventual() {
    }

    public IngresoEventual(double ingreso, String asunto) {
        super(ingreso, asunto);
        this.fechaIngresoEventual = LocalDate.now();
    }

    public LocalDate getFechaIngresoEventual() {
        return fechaIngresoEventual;
    }

    public void setFechaIngresoEventual(LocalDate fechaIngresoEventual) {
        this.fechaIngresoEventual = fechaIngresoEventual;
    }

    @Override
    public String toString() {
        return super.toString() + "|| FechaIngresoEventual: " + fechaIngresoEventual+"\n";
    }
    
   
}
