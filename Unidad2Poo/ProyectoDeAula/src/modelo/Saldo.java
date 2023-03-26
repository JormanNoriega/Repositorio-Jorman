/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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

    public void registrarIngreso(Ingreso ingreso) {
        this.ingresos.add(ingreso);
    }

    public void registrarEgreso(Egreso egreso) {
        this.egresos.add(egreso);
    }

    public void registrarDeudas(Deudas deudas) {
        this.deudas.add(deudas);
    }

    @Override
    public String toString() {
        return "Saldo{" + "saldo=" + saldo + ", ingresos=" + ingresos + ", egresos=" + egresos + ", deudas=" + deudas + '}';
    }    
}
