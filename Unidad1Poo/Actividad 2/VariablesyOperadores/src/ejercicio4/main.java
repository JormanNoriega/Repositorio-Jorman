/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 * @author Jorman Noriega
 */
public class main {
    public static void main(String[] args) {
        int numDays;
        double totalKM, costoLitro, promKM, pagoEstacionamiento, pagoPeaje, costoTotal, valorTotalLitro, valorTotalEstacionamiento, valorTotalPeaje;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el No de dias del viaje: ");
        numDays = sc.nextInt();
        System.out.print("Ingrese el total de KM conducidos por dia: ");
        totalKM = sc.nextDouble();
        System.out.print("Ingrese el costo por litro de gasolina: ");
        costoLitro = sc.nextDouble();
        System.out.print("Ingrese promedio de KM por litro de gasolina: ");
        promKM = sc.nextDouble();
        System.out.print("Ingrese el pago por estacionamiento por dia: ");
        pagoEstacionamiento = sc.nextDouble();
        System.out.print("Ingrese pago de peajes por dia: ");
        pagoPeaje = sc.nextDouble();
        valorTotalPeaje = pagoPeaje * numDays;
        valorTotalLitro = ((totalKM * numDays) / promKM) * costoLitro;
        valorTotalEstacionamiento = pagoEstacionamiento * numDays;
        costoTotal = valorTotalLitro + valorTotalEstacionamiento + valorTotalPeaje;
    
        System.out.printf("El valor total del viaje fue de: %.2f\n", costoTotal);
    }
    
}
