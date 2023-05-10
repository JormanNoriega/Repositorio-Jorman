/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.IGestionUsuario;
import Persistencia.ListaUsuarios;

/**
 *
 * @author Jorman
 */
public class LogicaUsuario {
    
    public IGestionUsuario datos;

    public LogicaUsuario() {
        this.datos = new ListaUsuarios();
    }
    
    
}
