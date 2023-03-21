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
public class Egreso {
    private double egreso;
    private String asunto;
    private LocalDate fecha;

    public Egreso() {
    }

    public Egreso(double egreso, String asunto, LocalDate fecha) {
        this.egreso = egreso;
        this.asunto = asunto;
        this.fecha = fecha;
    }

    public double getEgreso() {
        return egreso;
    }

    public void setEgreso(double egreso) {
        this.egreso = egreso;
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
        return "Egreso{" + "egreso=" + egreso + ", asunto=" + asunto + ", fecha=" + fecha + '}';
    }  
}
