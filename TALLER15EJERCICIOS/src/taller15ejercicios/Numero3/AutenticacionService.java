/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// Clase que se encarga exclusivamente de la autenticacion de usuarios
// Esto lo saque de Usuario para cumplir con el SRP
public class AutenticacionService {

    // Metodo para autenticar al usuario
    public boolean autenticar(Usuario usuario, String contrasena) {
        return usuario.getContrasena().equals(contrasena);
    }
}
