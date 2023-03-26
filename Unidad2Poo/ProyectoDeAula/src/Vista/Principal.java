/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

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
        double saldo;
        String usuario, contraseña, correo;

        do {
            System.out.println("1) Iniciar Seccion.");
            System.out.println("2) Registrar.");
            System.out.println("3) Salir.");
            System.out.println("Ingrese una opcion: ");
            OP = sc.nextInt();
            sc.nextLine();

            switch (OP) {
                case 1:
                    System.out.println("Iniciar Seccion");
                    System.out.println("Usuario: ");
                    usuario = sc.nextLine();
                    System.out.println("Contraseña: ");
                    contraseña = sc.nextLine();
                    validarAcceso(usuario, contraseña, usuarios);

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

    public static void validarAcceso(String usernames, String passwords, ArrayList<Usuario> usuarios) {
        for (int i = 0; i < usuarios.size(); i++) {
            if ((usuarios.get(i).getNombre().equals(usernames)) && (usuarios.get(i).getContraseña().equals(passwords))) {
                System.out.println("Usuario encontrado, bienvenido a la app");
            } else {
                System.out.println("Error, usuario no encontrado o incorrecto");
            }
        }
    }
}
