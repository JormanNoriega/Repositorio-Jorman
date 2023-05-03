/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Figura;
import java.util.ArrayList;
import java.util.List;

public class Pizarra {
    
   private List<Figura> figuras;

    public Pizarra(){
        this.figuras = new ArrayList<Figura>();
    }
 
   public void agregarFigura(Figura f){
       figuras.add(f);
   }
  
   public void borrarFigura(Figura f){
       figuras.remove(f);
       System.out.println("");
   }
    
   public void dibujarFiguras(){
           
           for(Figura f : figuras ){
               System.out.println(f);
           }
       }
   }
   
