/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Jorman
 */
public class Ingreso {
    private double ingreso;
    private String asunto;
    private LocalDate fecha;

    public Ingreso() {
    }

    public Ingreso(double ingreso, String asunto) {
        this.ingreso = ingreso;
        this.asunto = asunto;
        this.fecha = LocalDate.now();
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
        
    @Override
    public String toString() {
        return "Ingreso: " + ingreso + ", Asunto: " + asunto + ", Fecha: " + fecha+"\n";
    }  
}
