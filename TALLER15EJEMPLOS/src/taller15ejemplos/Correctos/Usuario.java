/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Aqui creo una clase Usuario que solo se encarga de guardar los datos de un usuario
// Me aseguro de no mezclar cosas como autenticacion o informes aqui porque eso violaria el SRP
public class Usuario {
    private String nombre;
    private String contrasena;

    // Constructor para asignar el nombre y la contraseña al crear el usuario
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // Este metodo devuelve el nombre del usuario
    public String getNombre() {
        return nombre;
    }
}
