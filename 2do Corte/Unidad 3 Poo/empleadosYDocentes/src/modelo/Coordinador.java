/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Coordinador extends Empleado {

    public Coordinador() {
        super("Coordinador");
    }

    @Override
    public double CalcularSueldo() {
        return 5000;
    }
}
