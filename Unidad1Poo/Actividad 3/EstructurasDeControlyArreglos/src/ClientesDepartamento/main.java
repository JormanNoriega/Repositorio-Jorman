package ClientesDepartamento;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * @author Jorman Noriega
 */
public class main {
    public static void main(String[] args) {
        char OP = 'S';   
      while (OP == 'S'){
        Scanner sc = new Scanner(System.in);
        System.out.print("Anote el salario inicial del mes: ");
        int saldoInicial;
        saldoInicial = sc.nextInt();
        System.out.print("Anote el total de abonos en el mes: ");
        int totalAbono;
        totalAbono = sc.nextInt();
        System.out.print("Anote el total de deducciones aplicadas a su cuenta en el mes: ");
        int totalDeduccion;
        totalDeduccion = sc.nextInt();
        System.out.print("Anote el límite de crédito permitido: ");
        int limiteCredito;
        limiteCredito = sc.nextInt();
        
        int nuevoSaldo;
        nuevoSaldo = (saldoInicial + totalAbono - totalDeduccion);
        
        if (nuevoSaldo > limiteCredito){
            System.out.println("Su nuevo saldo es de: " + nuevoSaldo);
            System.out.println("Se excedió el límite de su credito");
        }
        else 
            System.out.println("Su nuevo saldo es de: " + nuevoSaldo);
            System.out.println("Este esta dentro del limite de credito");
      
        do{
           System.out.print("¿Desea ingresar las clientes? [S/N]: ");
           OP = sc.next().charAt(0);
           OP = Character.toUpperCase(OP);
        }while ((OP != 'S') && (OP != 'N' ));
      }           
    }
}
