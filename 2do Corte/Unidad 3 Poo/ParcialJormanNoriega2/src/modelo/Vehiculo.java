/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Vehiculo implements IRecaudoIVA{
    
    private String marcaVehiculo;
    private String lineaVehiculo;
    private String modeloVehiculo;
    private double valorComercial;

    public Vehiculo(String marcaVehiculo, String lineaVehiculo, String modeloVehiculo, double valorComercial) {
        this.marcaVehiculo = marcaVehiculo;
        this.lineaVehiculo = lineaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.valorComercial = valorComercial;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getLineaVehiculo() {
        return lineaVehiculo;
    }

    public void setLineaVehiculo(String lineaVehiculo) {
        this.lineaVehiculo = lineaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }
    
    

    @Override
    public double IvaRecaudado(){
        if(valorComercial<=4947000){
            return valorComercial*1.5/100;
        }else{
            if(valorComercial>4947000 && valorComercial<111305000){
                return valorComercial*2.5/100;
            }else{
                if(valorComercial>11130500){
                    return valorComercial*3.5/100;
                }else{
                    System.out.println("Ingrese un valor valido...");
                }
            }
        }
        return 0;    
    }
       
    
    
    
    
}
