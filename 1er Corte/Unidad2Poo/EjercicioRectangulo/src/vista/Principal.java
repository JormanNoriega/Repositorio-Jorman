/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Rectangulo;

/**
 *
 * @author Jairo F
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        System.out.println("-----------------------------------------");
        
        Rectangulo a = new Rectangulo();
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Calcular Area y Perimetro de un rectangulo...");
        
        
        System.out.println("Ingrese la Base:  ");
        a.setBase(sc.nextDouble());
       
        System.out.println("Ingrese la Altura: ");
        a.setAltura(sc.nextDouble());
       
        imprimirRectangulo(a);
    }
    
    public static void imprimirRectangulo(Rectangulo r){
        System.out.println("Area:"+ r.calcularArea());
        System.out.println("Perimetro:"+ r.calcularPerimetro());
    }
    
}
