/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class extensosDeIva extends Alimentos{

    public extensosDeIva(String codigoProducto, String descripcion, double precioVenta, int cantidadVendida) {
        super(codigoProducto, descripcion, precioVenta, cantidadVendida);
    }
    
    @Override
    public double IvaRecaudado() {
        return precioVenta*0.0;
    }  
}
