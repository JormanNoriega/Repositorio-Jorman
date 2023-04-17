/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Autobus extends Vehiculo {

    private int kmInicioRenta;
    private int kmDevolucion;
    private double precioKm;

    public Autobus(String placa) {
        super(placa);
    }

    public Autobus(int kmInicioRenta, int kmDevolucion, double precioKm, String placa) {
        super(placa);
        this.kmInicioRenta = kmInicioRenta;
        this.kmDevolucion = kmDevolucion;
        this.precioKm = precioKm;
    }

    public int getKmInicioRenta() {
        return kmInicioRenta;
    }

    public void setKmInicioRenta(int kmInicioRenta) {
        this.kmInicioRenta = kmInicioRenta;
    }

    public int getKmDevolucion() {
        return kmDevolucion;
    }

    public void setKmDevolucion(int kmDevolucion) {
        this.kmDevolucion = kmDevolucion;
    }

    public double getPrecioKm() {
        return precioKm;
    }

    public void setPrecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    public double getImporteRenta() {
        return (kmDevolucion - kmInicioRenta) * precioKm;
    }
    
    public String getDatosTipoVehiculo(){
        return "Autobus";
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
