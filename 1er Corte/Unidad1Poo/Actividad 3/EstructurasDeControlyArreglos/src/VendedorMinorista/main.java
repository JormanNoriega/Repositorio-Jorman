/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VendedorMinorista;

import java.util.Scanner;

/**
 * @author Jorman Noriega
 */
public class main {
    public static void main(String[] args) {
        int cantProducts = 0;
        Scanner sc = new Scanner(System.in);
        // ASIGNACIÓN DE TAMAÑO DEL ARREGLO
        System.out.print("Digite la cantidad de productos: ");
        cantProducts = sc.nextInt();
        int[] A = new int[cantProducts]; // CÓDIGO DE PRODUCTOS VENDIDOS AL DÍA
        double[] B = new double[cantProducts]; // VALOR DE VENTA DE CADA PRODUCTO
        int[] C = new int[cantProducts]; // CANTIDAD DE UNIDADES VENDIDAS
        // LLENAR DATOS
        for (int i = 0; i < cantProducts; i++) {
            System.out.print("Digite el codigo del producto: #");
            A[i] = sc.nextInt();
            System.out.print("Digite el valor de venta del producto: $");
            B[i] = sc.nextDouble();
            System.out.print("Digite la cantidad de unidades vendidas del producto: ");
            C[i] = sc.nextInt();
        }
        // CALCULO DE TOTAL PRODUCTOS VENDIDOS EN EL DÍA
        int totalProductosVendidos = 0;
        for (int i = 0; i < cantProducts; i++) {
            totalProductosVendidos = totalProductosVendidos + C[i];
        }
        // CALCULO DE TOTAL DE INGRESOS POR VENTAS DEL DÍA
        double totalIngresos = 0;
        for (int i = 0; i < cantProducts; i++) {
            totalIngresos = totalIngresos + (B[i] * C[i]);
        }
        // CALCULO PRODUCTO MÁS VENDIDO
        int wwe = C[1], SA = 1;
        for (int a = 0; a < cantProducts; a++) {
            if (C[a] > wwe) {
                wwe = C[a];
                SA = a;
            }
        }
        // CALCULO PRODUCTO MÁS COSTOSO
        int qw = (int) B[1], SF = 1;
        for (int i = 0; i < cantProducts; i++) {
            if (B[i] > qw) {
                qw = (int) B[i];
                SF = i;
            }
        }

        System.out.println("El total de productos vendidos en el dia fue de: " + totalProductosVendidos);                
        System.out.println("El total de ingresos por ventas en el dia fue de: $" + totalIngresos);                
        System.out.println("El producto mas vendido fue : #" + A[SA]);                
        System.out.println("El producto mas costoso fue : #" + A[SF]);                
    }
}

