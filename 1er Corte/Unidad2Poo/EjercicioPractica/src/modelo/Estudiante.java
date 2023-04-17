/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jorman
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularNotaDefinitiva() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void imprimirDatos() {
        System.out.println("Estudiante: " + this.nombre + " " + this.apellido);
        System.out.println("Notas: P1 = " + this.nota1 + ", P2 = " + this.nota2 + ", P3 = " + this.nota3);
        System.out.println("Nota definitiva: " + this.calcularNotaDefinitiva());
    }

}
