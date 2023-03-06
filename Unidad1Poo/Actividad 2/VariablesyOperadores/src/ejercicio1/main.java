/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 * @author Jorman Noriega
 */
public class main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de X: ");
        x = sc.nextInt();
        System.out.printf("x=%d\n", x);
        System.out.printf("El valor de %d + %d es %d\n", x, x, (x + x));
        System.out.printf("El valor de %d / 2 = %d.2\n", x, x/2);
        System.out.printf("El valor de %d mod 3 = %d\n", x, x%3);
    }
    
}
