/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Parrafo;

/**
 *
 * @author Jorman
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el Parrafo: ");
        Parrafo parrafo1 = new Parrafo(sc.nextLine());
        System.out.println("Numero de vocales: "+parrafo1.nVocales());
        System.out.println("Numero de consonantes: "+parrafo1.nConsonantes());
        System.out.println("Numero de Simbolos: "+parrafo1.nSimbolos());
        System.out.println("Numero de palabras repetidas: ");
        System.out.println("Vocal mas Repetida: "+parrafo1.vocalModa());
        System.out.println("Numero de Palabras: "+parrafo1.nPalabras());
        System.out.println("Palabra mas larga: ");
        
                
    }
    
}
