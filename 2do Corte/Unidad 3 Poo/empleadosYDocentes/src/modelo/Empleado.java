/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public abstract class Empleado implements Trabajador {

    protected double sueldo;
    protected String cargo;

    public Empleado() {
    }
 
    public Empleado(String cargo) {
        this.sueldo = CalcularSueldo();
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double Sueldo() {
        return sueldo;
    }

    @Override
    public double Bonificacion() {
        return sueldo * 100 / 100;
    }

    public abstract double CalcularSueldo();
}
