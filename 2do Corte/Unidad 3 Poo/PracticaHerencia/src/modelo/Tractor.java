/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import Datos.IAlquilados;

/**
 *
 * @author Jorman
 */
public class Tractor extends Vehiculo {

    private int noDiasRenta;
    private double precioDia;

    public Tractor(String placa) {
        super(placa);
    }

    public Tractor(int noDiasRenta, double precioDia, String placa) {
        super(placa);
        this.noDiasRenta = noDiasRenta;
        this.precioDia = precioDia;
    }

    public int getNoDiasRenta() {
        return noDiasRenta;
    }

    public void setNoDiasRenta(int noDiasRenta) {
        this.noDiasRenta = noDiasRenta;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public double getImporteRenta() {
        return noDiasRenta * precioDia;
    }

    public String getDatosTipoVehiculo() {
        return "Tractor";
    }

    @Override
    public void AgregarVehiculoRenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarVehiculoDevuelto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getTotalAlquilados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
