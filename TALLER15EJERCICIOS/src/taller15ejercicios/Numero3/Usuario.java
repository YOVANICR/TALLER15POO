/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// La clase Usuario solo se encarga de guardar los datos del usuario
// Ya no maneja ni autenticacion ni validacion directamente
public class Usuario {
    private String nombre;
    private String contrasena;

    // Constructor para inicializar el nombre y la contrasena
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // Metodo para obtener el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    // Metodo para obtener la contrasena del usuario
    public String getContrasena() {
        return contrasena;
    }
}
