/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorman
 */
public class RegistroUsuario {
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();


    public void registrarUsuario(String nombre, String correo, String contrasena) {
        Usuario usuario = new Usuario(nombre, correo, contrasena);
        usuarios.add(usuario);
        System.out.println(usuarios);    
    }
    
     public void registrarUsuario(Usuario usuarios) {
        this.registrarUsuario(usuarios.getNombre(),usuarios.getCorreo(),usuarios.getContraseña());
    }
}
    
    

    



    

 


    

     

