/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;
import java.io.*;
/**
 *
 * @author Jorman
 */
public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
 
    public static void escribirArchivo(){
        try{
            FileOutputStream archivo= new FileOutputStream("Datos.dat");
            
        }catch(IOException error){
            error.printStackTrace(System.out);
        }
        
    }
    
    
}


/*
import java.io.*;
import java.util.ArrayList;

public class ArrayListToFileExample {
    public static void main(String[] args) {
        String archivo = "objetos.dat";

        // Crear un ArrayList de objetos
        ArrayList<ObjetoEjemplo> objetos = new ArrayList<>();
        objetos.add(new ObjetoEjemplo("Objeto 1"));
        objetos.add(new ObjetoEjemplo("Objeto 2"));
        objetos.add(new ObjetoEjemplo("Objeto 3"));

        // Escribir el ArrayList en el archivo
        escribirArrayListEnArchivo(objetos, archivo);

        // Leer el ArrayList desde el archivo
        ArrayList<ObjetoEjemplo> objetosLeidos = leerArrayListDesdeArchivo(archivo);

        // Imprimir los objetos leídos
        for (ObjetoEjemplo objeto : objetosLeidos) {
            System.out.println(objeto.getNombre());
        }
    }

    private static void escribirArrayListEnArchivo(ArrayList<ObjetoEjemplo> objetos, String archivo) {
        try {
            FileOutputStream archivoSalida = new FileOutputStream(archivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);

            objetoSalida.writeObject(objetos);

            objetoSalida.close();
            archivoSalida.close();

            System.out.println("El ArrayList se ha escrito correctamente en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<ObjetoEjemplo> leerArrayListDesdeArchivo(String archivo) {
        ArrayList<ObjetoEjemplo> objetosLeidos = new ArrayList<>();

        try {
            FileInputStream archivoEntrada = new FileInputStream(archivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);

            objetosLeidos = (ArrayList<ObjetoEjemplo>) objetoEntrada.readObject();

            objetoEntrada.close();
            archivoEntrada.close();

            System.out.println("El ArrayList se ha leído correctamente desde el archivo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objetosLeidos;
    }
}

class ObjetoEjemplo implements Serializable {
    private String nombre;

    public ObjetoEjemplo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}



*/