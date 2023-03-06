/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Sueldo;



/*Crear una clase que permita calcular el sueldo de un trabajador según sus horas trabajadas, 
conociendo que todos los trabajadores manejan una misma tarifa. Cree dos trabajadores y calcule su sueldo,
posteriormente modifique la tarifa, y recalcule el sueldo de los dos trabajadores.
 @author Jorman
 */
public class SueldoTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Sueldo a = new Sueldo();
        Sueldo b = new Sueldo();
        
        
        System.out.println("Calcular Salario de trabajadores");
        
        System.out.println("Ingrese el numero de horas trabajadas en un dia por el Primer trabajador: ");
        a.setNumHoras(sc.nextDouble());
        
        System.out.println("Ingrese el numero de horas trabajadas en un dia por el Segundo trabajador: ");
        b.setNumHoras(sc.nextDouble());
        
        System.out.println("Sueldo Trabajor 1: "+a.calcularSueldo());
        
        System.out.println("Sueldo Trabajor 2: "+b.calcularSueldo());
        
        char respuesta; 
        System.out.println("¿Desea Cambiar la tarifa de pago?[S/N]");
        respuesta= sc.next().charAt(0);
        respuesta=Character.toUpperCase(respuesta);
        
        if (respuesta == 'S'){
            System.out.println("Ingrese la Tarifa deseada: ");
            double tarifaModificada = sc.nextDouble();
            a.setTarifa(tarifaModificada);
            b.setTarifa(tarifaModificada);
            System.out.println("El Pago del primer Trabajador es : "+a.calcularSueldo());
            System.out.println("El Pago del Segundo Trabajador es : "+a.calcularSueldo());
        }
    }  
}
