/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.*;
import modelo.IRecaudoIVA;

/**
 *
 * @author ESTUDIANTES
 */
public class vista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<IRecaudoIVA> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);

        int OP;
        do {

            System.out.println("     **   MENU DE OPCIONES **     ");
            System.out.println("1. Crear Alimento");
            System.out.println("2. Crear Vehiculo");
            System.out.println("3. Crear Contrato");
            System.out.println("4. Mostrar Lista");
            System.out.println("5. Salir");

            OP = sc.nextInt();
            switch (OP) {

                case 1:
                    System.out.println("Crear alimento:");
                    System.out.println("codigo de producto: ");
                    String codigoProducto = sc.nextLine();
                    System.out.println("Descripcion: ");
                    String descripcion = sc.nextLine();
                    System.out.println("Precio Venta");
                    double precioVenta = sc.nextDouble();
                    System.out.println("CantidadVendida:");
                    int cantidadVendida = sc.nextInt();
                    System.out.println("(1) extenso de iva| (2) con Descuento| (3) sin Descuento");
                    int opcion = sc.nextInt();
                    if (opcion == '1') {
                        extensosDeIva manzana = new extensosDeIva(codigoProducto, descripcion, precioVenta, cantidadVendida);
                        lista.add(manzana);
                    } else {
                        if (opcion == '2') {
                            conDescuento pera = new conDescuento(codigoProducto, descripcion, precioVenta, cantidadVendida);
                            lista.add(pera);
                        } else {
                            if (opcion == '3') {
                                sinDescuento uva = new sinDescuento(codigoProducto, descripcion, precioVenta, cantidadVendida);
                                lista.add(uva);
                            }else{
                                System.out.println("Ingrese una opcion valida...");
                            }
                        }
                    }

                    break;
                case 2:
                    System.out.println("Crear Vehiculo");
                    System.out.println("Marca: ");
                    
                    System.out.println("linea: ");

                    System.out.println("modelo ");

                    System.out.println("valor: ");
                    
                    Vehiculo carro= new Vehiculo("carrito", "carrito rapido", "kia", 100000);
                    lista.add(carro);


                    break;
                case 3:
                    System.out.println("Crear contrato");
                    
                    Contratos contrato = new Contratos(1000000, 4000);
                    lista.add(contrato);

                    break;
                case 4:
                    /*for(lista f: lista){
                        System.out.println(f);
                    }*/
                    break;
                case 5:
                    System.out.println("Salida exitosa....");
                    break;
                default:
                    System.out.println("opcion no disponible");

            }
        } while (OP != 5);

    }

}
