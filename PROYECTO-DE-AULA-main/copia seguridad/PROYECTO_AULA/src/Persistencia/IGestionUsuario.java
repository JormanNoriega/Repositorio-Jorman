/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorman
 */
public interface IGestionUsuario {
    
    void registrarUsuario(Usuario u);
    int ubicarUsuario(String usernames, String passwords, ArrayList<Usuario> usuarios);
    void modificarUsuario(Usuario u,String usernames, String passwords,ArrayList<Usuario> usuarios);
    void eliminarUsuario(Usuario u);
    List<Usuario> informe();
    
    
}
