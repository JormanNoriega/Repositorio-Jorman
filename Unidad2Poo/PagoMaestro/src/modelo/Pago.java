/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Pago {

    
    private double tarifa;
    private double metroTrabajado;

    public Pago() {
        this.tarifa = 200;
        this.metroTrabajado = 0;
    }

    public double getTarifa() {
        return tarifa;
    }

    public double getMetroTrabajado() {
        return metroTrabajado;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setMetroTrabajado(double metroTrabajado) {
        this.metroTrabajado = metroTrabajado;
    }
    
    public double calcularPago(){
        return this.tarifa*this.metroTrabajado;
    }   
}
