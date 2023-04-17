/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Jorman
 */
public class Saldo {

    private double saldo;
    private ArrayList<Ingreso> ingresos;
    private ArrayList<Egreso> egresos;
    private ArrayList<Deudas> deudas;

    public Saldo() {
    }

    public Saldo(double saldo) {
        this.saldo = saldo;
        this.ingresos = new ArrayList();
        this.egresos = new ArrayList();
        this.deudas = new ArrayList();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public ArrayList<Egreso> getEgresos() {
        return egresos;
    }

    public void setEgresos(ArrayList<Egreso> egresos) {
        this.egresos = egresos;
    }

    public ArrayList<Deudas> getDeudas() {
        return deudas;
    }

    public void setDeudas(ArrayList<Deudas> deudas) {
        this.deudas = deudas;
    }

    public void registrarIngreso(double ingreso,String asunto) {        
        Ingreso nuevoIngreso= new Ingreso(ingreso, asunto);
        this.ingresos.add(nuevoIngreso);
        this.saldo+=ingreso;
    }
    
    
    public void registrarEgreso(double egreso,String asunto) {
        Egreso nuevoEgreso= new Egreso(egreso, asunto);
        this.egresos.add(nuevoEgreso);
        this.saldo-=egreso;
    }

    public void registrarDeudas(double deudas,String asunto,LocalDate fecha) {
        Deudas nuevaDeuda = new Deudas(deudas, asunto, fecha);
        this.deudas.add(nuevaDeuda);
    }

    @Override
    public String toString() {
        return " " + saldo;
    }
    
    
}
