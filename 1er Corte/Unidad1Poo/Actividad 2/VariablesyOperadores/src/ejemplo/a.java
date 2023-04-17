/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

import java.time.LocalDate;

/**
 *
 * @author Jorman
 */
public class a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            LocalDate fecha1 = LocalDate.now();
            LocalDate fecha2 = LocalDate.parse("2023-03-12");
            System.out.println("Fecha 1: "+fecha1+", fecha 2: "+fecha2);
            
            if(fecha1.equals(fecha2)){
                System.out.println("La misma");
            }
            
    }
    
}
