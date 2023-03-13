/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jorman
 */
public class Buque {
    
    private double areaPlataforma;
    private double limitePeso;
    private String estado;
    private LocalDate fechaZarpado;
    private LocalDate fechaArribo;
    private int numContenedores;
    private double valorCarga;
    
    //constructor

    public Buque() {
        this.areaPlataforma = 0;
        this.limitePeso = 0;
        this.estado = "Arribado";
        this.fechaZarpado = null;
        this.fechaArribo = null;
        this.numContenedores = 0;
        this.valorCarga = 0;
    }

    public Buque(double areaPlataforma,double limitePeso,LocalDate fechaZarpado) {
        this.areaPlataforma = areaPlataforma;
        this.limitePeso = limitePeso;
        this.estado = "Arribado";
        this.fechaZarpado = fechaZarpado;
        this.fechaArribo = LocalDate.now();
        this.numContenedores = 0;
        this.valorCarga = 0; 
    }
       
    
    //getters

    public double getAreaPlataforma() {
        return areaPlataforma;
    }

    public double getLimitePeso() {
        return limitePeso;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getFechaZarpado() {
        return fechaZarpado;
    }

    public LocalDate getFechaArribo() {
        return fechaArribo;
    }

    public int getNumContenedores() {
        return numContenedores;
    }

    public double getValorCarga() {
        return valorCarga;
    }

    
    
    
    //setters

    public void setAreaPlataforma(double areaPlataforma) {
        this.areaPlataforma = areaPlataforma;
    }

    public void setLimitePeso(double limitePeso) {
        this.limitePeso = limitePeso;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaZarpado(LocalDate fechaZarpado) {
        this.fechaZarpado = fechaZarpado;
    }

    public void setFechaArribo(LocalDate fechaArribo) {
        this.fechaArribo = fechaArribo;
    }

    public void setNumContenedores(int numContenedores) {
        this.numContenedores = numContenedores;
    }

    public void setValorCarga(double valorCarga) {
        this.valorCarga = valorCarga;
    }

   
    
    
    
    //metodos

    public String cargarContenedor(double area,double peso,double valor){
  
        if(this.estado.equals("Zarpado")){
            return "No se puede Cargar el contenedor, el buque ya Zarpó...";}
        else{
            if(this.areaPlataforma-area<0){
                return "No se puede cargar contenedor, se superó el área del buque";}
            else{
                if(this.limitePeso-peso<0){
                    return "No se puede cargar contenedor, se superó el límite de peso del buque";}
                else{
                    this.areaPlataforma=this.areaPlataforma-area;
                    this.limitePeso=this.limitePeso-peso;
                    this.valorCarga=this.valorCarga+valor;
                    this.numContenedores=this.numContenedores+1;
                    return "Contenedor Cargado exitosamente";
                }
            }
        }  
    }
    
    //metodo sobrecargado
    
    public void cargarContenedor(Contenedor contenedor){
        
        if(this.estado.equals("Zarpado")){
            System.out.println("No se puede Cargar el contenedor, el buque ya Zarpo...");}
        else{
            if(this.areaPlataforma-contenedor.getArea()<0){
                System.out.println("No se puede cargar contenedor, se supero el area del buque");}
            else{
                if(this.limitePeso-contenedor.getPeso()<0){
                    System.out.println("No se puede cargar contenedor, se supero el límite de peso del buque");}
                else{
                    this.areaPlataforma=this.areaPlataforma-contenedor.getArea();
                    this.limitePeso=this.limitePeso-contenedor.getPeso();
                    this.valorCarga=this.valorCarga+contenedor.getValor();
                    this.numContenedores=this.numContenedores+1;
                    System.out.println("Contenedor Cargado exitosamente"); 
                }
            }
        }  
    }
    
    
    public double areaDisponible(){     
        return areaPlataforma;
    }
    
    public double pesoPermitido(){        
        return limitePeso;
    }
    
    public double valorCarga(){
        return valorCarga;
    }
    
    public int contenedoresCargados(){
        return numContenedores;
    }   
    
    public LocalDate duracionViaje(){
        return fechaZarpado;
    }
}
