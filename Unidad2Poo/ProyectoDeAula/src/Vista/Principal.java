/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

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
        int OP=0;
        String usuario,contraseña,correo;       
        RegistroUsuario registrosDeUsuarios = new RegistroUsuario();
        
        do{
            System.out.println("1) Iniciar Seccion."); 
            System.out.println("2) Registrar.");
            System.out.println("3) Salir.");
            System.out.println("Ingrese una opcion: ");
            OP=sc.nextInt();
            sc.nextLine();
            
            switch(OP){
                case 1:
                    System.out.println("Iniciar Seccion");
                    System.out.println("Usuario: ");
                    usuario=sc.nextLine();                   
                    System.out.println("Contraseña: ");
                    contraseña=sc.nextLine(); 
                    break;
                    
                case 2:
                    System.out.println("Registro de Usuario");
                    System.out.println("Usuario: ");
                    usuario=sc.nextLine();                 
                    System.out.println("Contraseña: ");
                    contraseña=sc.nextLine();     
                    System.out.println("Correo: ");
                    correo=sc.nextLine();                                       
                    registrosDeUsuarios.registrarUsuario(new Usuario(usuario, correo, contraseña));   
              break;        
            }  
        }while(OP !=3);        
    }   
}