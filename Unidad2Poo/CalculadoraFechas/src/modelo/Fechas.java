/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Jorman
 */
public class Fechas {
    private Calendar fechaActual;

    public Fechas() {
        this.fechaActual = Calendar.getInstance();
    }
    
    
    
    
   

    
  
    //metodos constructores
    //@Override 
    public String fechaActual() {
        return ("Fecha: " + this.dia + "/" + this.mes + "/" + this.año + "Hora: " + this.hora + "/" + this.minuto + "/" + this.segundo);
    }
    
}