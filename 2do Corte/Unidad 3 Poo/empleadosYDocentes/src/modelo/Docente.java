/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Docente implements Trabajador {

    private int numHora;

    public Docente() {
    }
  
    public Docente(int numHora) {
        this.numHora = numHora;
    }

    public double getNumHora() {
        return numHora;
    }

    public void setNumHora(int numHora) {
        this.numHora = numHora;
    }
    
    @Override
    public double Sueldo(){
        return numHora*120; 
    }
    
    @Override
    public double Bonificacion(){
        return Sueldo()* 70/100;
    }
}
