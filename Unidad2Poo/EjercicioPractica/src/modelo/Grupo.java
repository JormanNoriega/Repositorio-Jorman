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
public class Grupo {

    private int numeroGrupo;
    private String docente;
    private ArrayList<Estudiante> estudiantes;

    public Grupo(int numeroGrupo, String docente) {
        this.numeroGrupo = numeroGrupo;
        this.docente = docente;
        this.estudiantes = new ArrayList();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (this.estudiantes.size() < 3) {
            this.estudiantes.add(estudiante);
        } else {
            System.out.println("No se pueden inscribir más de 3 estudiantes en este grupo.");
        }
    }

    public void imprimirDatos() {
        System.out.println("Grupo " + this.numeroGrupo + " - Docente: " + this.docente);
        for (Estudiante estudiante : estudiantes) {
            estudiante.imprimirDatos();
        }
    }

}
