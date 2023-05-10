/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Contratos implements IRecaudoIVA{
    
    private double montoContrato;
    private double totalGastos;

    public Contratos(double montoContrato, double totalGastos) {
        this.montoContrato = montoContrato;
        this.totalGastos = totalGastos;
    }

    public double getMontoContrato() {
        return montoContrato;
    }

    public void setMontoContrato(double montoContrato) {
        this.montoContrato = montoContrato;
    }

    public double getTotalGastos() {
        return totalGastos;
    }

    public void setTotalGastos(double totalGastos) {
        this.totalGastos = totalGastos;
    }
    
    @Override
    public double IvaRecaudado(){
        double honorariosContratista=this.montoContrato-this.totalGastos;       
        return honorariosContratista*19/100;
    }    
}
