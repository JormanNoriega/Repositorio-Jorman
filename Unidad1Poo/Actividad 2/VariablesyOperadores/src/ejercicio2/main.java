/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 * @author Jorman Noriega
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u,y,z;
        System.out.println("Ingrese su primer numero: ");
        u=sc.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        y=sc.nextInt();
        System.out.println("Ingrese su tercer numero: ");
        z=sc.nextInt();
    
        double suma = u + y + z;
        double promedio = suma / 3;
        double producto = u * y * z;
        double cociente = u / y / z;
        double modulo = u % y % z;
        System.out.printf("La suma es %.2f\n", suma);
        System.out.printf("El promedio es %.2f\n", promedio);
        System.out.printf("El producto es %.2f\n", producto);
        System.out.printf("El cociente es %.2f\n", cociente);
        System.out.printf("El modulo es %.2f\n", modulo);
    }
    
}
