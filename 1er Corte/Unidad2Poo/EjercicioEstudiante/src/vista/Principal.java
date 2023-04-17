/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Estudiante;

/**
 *
 * @Autor Jorman Noriega
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Estudiante a = new Estudiante();
        
        
        System.out.println("Calculadoras Notas UPC");
        
        System.out.println("Primer Parcial: ");
        a.setNota1(sc.nextDouble());
        System.out.println("Segundo Parcial: ");
        a.setNota2(sc.nextDouble());
        System.out.println("Tercer Parcial: ");
        a.setNota3(sc.nextDouble());
        notasEstudiante(a);
 
    }
    
    public static void notasEstudiante(Estudiante a){
        System.out.println("Su promedio es: "+a.calcularNota());  
    }  
}
