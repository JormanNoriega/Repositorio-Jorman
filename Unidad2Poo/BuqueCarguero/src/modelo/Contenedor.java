/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Contenedor {
    
    private double peso;
    private double area;
    private double valor;
    
    //constructor

    public Contenedor() {
        this.peso = 0;
        this.area = 0;
        this.valor = 0;
    }

    public Contenedor(double peso, double area, double valor) {
        this.peso = peso;
        this.area = area;
        this.valor = valor;
    }
    
    //getters

    public double getPeso() {
        return peso;
    }

    public double getArea() {
        return area;
    }

    public double getValor() {
        return valor;
    }
    
    //setters

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
      
}
