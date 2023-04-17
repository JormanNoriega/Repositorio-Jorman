/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 * @author Jorman Noriega
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //DECLARACION DE VARIABLES
        float manzana = 52;        //CALORIAS - KCAL 
        float piña = 55;                 //CALORIAS - KCAL
        float Pera = 55;                //CALORIAS - KCAL
        float Naranja = 45;          //CALORIAS - KCAL
        float Fresa = 32;            //CALORIAS - KCAL
        float Melon = 54;              //CALORIAS - KCAL
        
        float kcalTotal = ((manzana * 2) + (Pera * 3) + Naranja + Melon);
        
        //IMPRIMO RESULTADO
        System.out.println("JUAN HA CONSUMIDO : " + kcalTotal + " CALORIAS");
        System.out.println("\n_____________SEGUNDA COMBINACION_______________\n");
        System.out.print("CUANTAS MANZANAS CONSUMIO : ");
        float cantManzana = sc.nextFloat();
        System.out.print("CUANTAS PINAS CONSUMIO : ");
        float cantPiña = sc.nextFloat();
        System.out.print("CUANTAS PERAS CONSUMIO : ");
        float cantPera = sc.nextFloat();
        System.out.print("CUANTAS NARANJAS CONSUMIO : ");
        float cantNaranja = sc.nextFloat();
        System.out.print("CUANTAS FRESAS CONSUMIO : ");
        float cantFresa = sc.nextFloat();
        System.out.print("CUANTAS MELONES CONSUMIO : ");
        float cantMelon = sc.nextFloat();
        float total = ((manzana * cantManzana) + (piña * cantPiña ) + (Pera * cantPera) + (Naranja * cantNaranja) + (Fresa * cantFresa) + (Melon * cantMelon));
        System.out.println("EL USUARIO HA CONSUMIDO " + total + " CALORIAS");
    }
}


