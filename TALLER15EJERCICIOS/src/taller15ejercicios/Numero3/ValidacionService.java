/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// Cree esta clase para manejar la validacion de los datos del usuario
// La separe de Usuario porque es una responsabilidad diferente
public class ValidacionService {

    // Metodo para validar si el nombre de usuario es valido (como ejemplo)
    public boolean validarNombre(Usuario usuario) {
        return usuario.getNombre().length() >= 4;
    }
}
