/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.time.LocalDate;

import java.util.Scanner;
import modelo.*;

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
        System.out.println("------------------------------------------------------------");
        double areaPlataforma,limitePeso;
        int dias;
        LocalDate timepoViaje = LocalDate.now();
        System.out.println("Datos del Buque");
        System.out.println("Ingrese el Area de la Platafora: ");
        areaPlataforma=sc.nextDouble();
        System.out.println("Ingrese el Limite de Peso: ");
        limitePeso=sc.nextDouble();
        System.out.println("Ingrese los dias de viaje: ");
        dias=sc.nextInt();
        timepoViaje=timepoViaje.plusDays(dias);
                
        Buque buque = new Buque(areaPlataforma, limitePeso,timepoViaje); 
        
        System.out.println("------------------------------------------------------------");
        
        System.out.println("Datos Del Primer Contenedor");
        double area,peso,valor;
        System.out.println("Ingrese el Peso del Contenedor: ");
        peso=sc.nextDouble();
        System.out.println("Ingrese el Area del Contenedor: ");
        area=sc.nextDouble();
        System.out.println("Ingrese el Valor del Contenedor: ");
        valor=sc.nextDouble();
        Contenedor contenedor1 = new Contenedor(peso, area, valor);
        System.out.println("------------------------------------------------------------");
        buque.cargarContenedor(contenedor1);
        mostrarDatos(contenedor1,buque);

        
        System.out.println("------------------------------------------------------------");
        System.out.println("Datos Del Segundo Contenedor");
        System.out.println("Ingrese el Peso del Contenedor: ");
        peso=sc.nextDouble();
        System.out.println("Ingrese el Area del Contenedor: ");
        area=sc.nextDouble();
        System.out.println("Ingrese el Valor del Contenedor: ");
        valor=sc.nextDouble();
        Contenedor contenedor2 = new Contenedor(peso, area, valor);
        System.out.println("------------------------------------------------------------");
        buque.cargarContenedor(contenedor2);
        mostrarDatos(contenedor1,buque);
    }
    
    public static void mostrarDatos(Contenedor contenedor,Buque buque){
        System.out.println("Area de plataforma disponible: "+buque.areaDisponible());
        System.out.println("Peso de plataforma disponible: "+buque.pesoPermitido());
        System.out.println("Fecha Arribo: "+buque.getFechaArribo());
        System.out.println("Fecha Zarpado: "+buque.duracionViaje());
        System.out.println("Valor Carga: "+buque.valorCarga());
        System.out.println("Numero de Contenedores: "+buque.contenedoresCargados());
    }
}
