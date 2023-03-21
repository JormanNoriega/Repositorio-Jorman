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

    public Ingreso(double ingreso, String asunto, LocalDate fecha) {
        this.ingreso = ingreso;
        this.asunto = asunto;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ingreso{" + "ingreso=" + ingreso + ", asunto=" + asunto + ", fecha=" + fecha + '}';
    }  
}
