/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorman
 */
public class AgenciaRenta{

    private List<Vehiculo> vehiculosAlquilados = new ArrayList<>();

    
    public void AgregarVehiculoRenta(Vehiculo v){
        vehiculosAlquilados.add(v);
        System.out.println("Vehiculo: "+v.getPlaca()+" Rentado.");
    }
    
    public void eliminarVehiculoDevuelto(Vehiculo v){
        vehiculosAlquilados.remove(v);
        v.getDatosVehiculo();
    }
    
    public int getTotalAlquilados(){
        return vehiculosAlquilados.size();
    }
}
