/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public abstract class Alimentos implements IRecaudoIVA{
    
    protected String codigoProducto;
    protected String descripcion;
    protected double precioVenta;
    protected int cantidadVendida;

    public Alimentos(String codigoProducto, String descripcion, double precioVenta, int cantidadVendida) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidadVendida = cantidadVendida;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    @Override
    public abstract double IvaRecaudado();
    
}
