/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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

        ArrayList<Usuario> usuarios = new ArrayList<>();
        //Usuario usuarioRegistados[];
        Scanner sc = new Scanner(System.in);
        int OP = 0;
        int pos;
        double saldo;
        String usuario, contraseña, correo;

        do {
            System.out.println("1) Iniciar Sesion.");
            System.out.println("2) Registrar.");
            System.out.println("3) Salir.");
            System.out.println("Ingrese una opcion: ");
            OP = sc.nextInt();
            sc.nextLine();

            switch (OP) {
                case 1:
                    System.out.println("Iniciar Sesion");
                    System.out.println("Usuario: ");
                    usuario = sc.nextLine();
                    System.out.println("Contraseña: ");
                    contraseña = sc.nextLine();
                    pos = validarAcceso(usuario, contraseña, usuarios);
                    
                    OP = 0;

                    do {
                        System.out.println("Su saldo es:" + usuarios.get(pos).getSaldo());
                        System.out.println("1. Agregar Ingreso");
                        System.out.println("2. Agregar Egreso");
                        System.out.println("3. Agregar Deudas");
                        System.out.println("4. Volver al menu principal");
                        System.out.println("Elija una Opcion: ");
                        OP = sc.nextInt();
                        sc.nextLine();
                        String asunto;

                        switch (OP) {
                            case 1:
                                System.out.println("Ingresos:");
                                System.out.println("Digite la cantidad a ingresar: ");
                                double nuevoIngreso = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Escribir el Asunto: ");
                                asunto = sc.nextLine();
                                usuarios.get(pos).getSaldo().registrarIngreso(nuevoIngreso, asunto);
                                System.out.println("Ingresos Registrados: ");
                                System.out.println(usuarios.get(pos).getSaldo().getIngresos());
                                

                                break;
                            case 2:
                                System.out.println("Egresos:");
                                System.out.println("Digite la cantidad a ingresar: ");
                                double nuevoEgreso = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Escribir el Asunto: ");
                                asunto = sc.nextLine();
                                usuarios.get(pos).getSaldo().registrarEgreso(nuevoEgreso, asunto);
                                System.out.println("Egresos Registrados: ");
                                System.out.println(usuarios.get(pos).getSaldo().getEgresos());
                                
                                break;
                            case 3:
                                System.out.println("Deudas:");
                                System.out.println("Digite la cantidad a ingresar: ");
                                double nuevaDeuda = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Escribir el Asunto: ");
                                asunto = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Digite la fecha de su Deuda");
                                System.out.println("Dia: ");
                                int dia=sc.nextInt();
                                System.out.println("Mes: ");
                                int mes=sc.nextInt();
                                System.out.println("Año: ");
                                int año=sc.nextInt();
                                LocalDate fecha = LocalDate.of(año, mes, dia);
                                usuarios.get(pos).getSaldo().registrarDeudas(nuevaDeuda, asunto,fecha);
                                System.out.println("Deudas Registradas: ");
                                System.out.println(usuarios.get(pos).getSaldo().getDeudas());
                                
                                break;
                        }
                    } while (OP != 4);

                    break;

                case 2:
                    System.out.println("Registro de Usuario");
                    System.out.println("Usuario: ");
                    usuario = sc.nextLine();
                    System.out.println("Contraseña: ");
                    contraseña = sc.nextLine();
                    System.out.println("Correo: ");
                    correo = sc.nextLine();
                    System.out.println("Saldo Inicial: ");
                    saldo = sc.nextDouble();
                    usuarios.add(new Usuario(usuario, correo, contraseña, (new Saldo(saldo))));
                    System.out.println(usuarios);
                    break;
            }
        } while (OP != 3);
    }

    public static int validarAcceso(String usernames, String passwords, ArrayList<Usuario> usuarios) {
        for (int i = 0; i < usuarios.size(); i++) {
            if ((usuarios.get(i).getNombre().equals(usernames)) && (usuarios.get(i).getContraseña().equals(passwords))) {
                System.out.println("Usuario encontrado, bienvenido a la app");
                return i;
            }
        }
        System.out.println("Error, usuario no encontrado o incorrecto");
        return -1;
    }
}
