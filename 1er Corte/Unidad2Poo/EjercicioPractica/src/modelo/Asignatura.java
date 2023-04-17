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
public class Asignatura {

    private String nombre;
    private String codigo;
    private ArrayList<Grupo> grupos;

    public Asignatura(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.grupos = new ArrayList<Grupo>();
    }

    public void agregarGrupo(Grupo grupo) {
        if (this.grupos.size() < 3) {
            this.grupos.add(grupo);
        } else {
            System.out.println("No se pueden crear más de 3 grupos para esta asignatura.");
        }
    }

    public void imprimirDatos() {
        System.out.println("Asignatura: " + this.nombre + " (" + this.codigo + ")");
        for (Grupo grupo : grupos) {
            grupo.imprimirDatos();
        }
    }

}
