/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Entrada;
import Modelo.Saldo;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorman
 */
public class ListaUsuarios implements IGestionUsuario {

    private List<Usuario> usuarios;

    public ListaUsuarios() {
        this.usuarios = new ArrayList();
    }

    @Override
    public void registrarUsuario(Usuario u) {
        this.usuarios.add(u);
    }

    @Override
    public int ubicarUsuario(String usernames, String passwords, ArrayList<Usuario> usuarios) {
        for (int i = 0; i < usuarios.size(); i++) {
            if ((usuarios.get(i).getNombre().equals(usernames)) && (usuarios.get(i).getContraseña().equals(passwords))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void modificarUsuario(Usuario u,String usernames, String passwords,ArrayList<Usuario> usuarios) {
        
        int pos=ubicarUsuario(usernames, passwords, usuarios);
        int OP=0;
        do{
            System.out.println("MENU MODIFICACION DE USUARIO");
            System.out.println("1. CAMBIAR NOMBRE.");
            System.out.println("2. CAMBIAR CONTRASEÑA.");
            System.out.println("3. SALIR.");
            OP=Entrada.leerInt("INGRESE UNA OPCION:");
            
        }while (OP!=3);          
            
        }
        
    }

    @Override
    public void eliminarUsuario(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> informe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
