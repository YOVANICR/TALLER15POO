/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Esta clase la hice para manejar todo lo que tiene que ver con la autenticacion
// Decidi separarla de Usuario para que cada clase tenga una responsabilidad clara
public class AutenticacionService {

    // Metodo que verifica si el usuario y la contraseña son correctos
    public boolean autenticar(Usuario usuario, String contrasena) {
        // Aqui uso un nombre y contraseña fijos solo como ejemplo
        return usuario.getNombre().equals("admin") && contrasena.equals("1234");
    }
}
    