/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Sueldo {
    private double numHoras;
    private double tarifa;

    public Sueldo() {
        this.numHoras = 0;
        this.tarifa = 4000;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public void setTarifa(double valorHora) {
        this.tarifa = valorHora;
    }
    
    public double calcularSueldo(){
        return (this.numHoras*this.tarifa)*31;
    }
      
}
