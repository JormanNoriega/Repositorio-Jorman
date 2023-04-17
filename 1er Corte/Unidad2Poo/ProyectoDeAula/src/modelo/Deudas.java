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
public class Deudas {
    
    private double deuda;
    private String asunto;
    private LocalDate fecha;

    public Deudas() {
    }

    public Deudas(double deuda, String asunto, LocalDate fecha) {
        this.deuda = deuda;
        this.asunto = asunto;
        this.fecha = fecha;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
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
        return "Deudas{" + "deuda=" + deuda + ", asunto=" + asunto + ", fecha=" + fecha + '}';
    }   
}
