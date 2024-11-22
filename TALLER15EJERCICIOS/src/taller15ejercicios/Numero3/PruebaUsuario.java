/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// Clase de prueba para verificar como funcionan las tres clases juntas
public class PruebaUsuario {
    public static void main(String[] args) {
       
        Usuario usuario = new Usuario("admin", "1234");

        // Verifico la autenticacion
        AutenticacionService auth = new AutenticacionService();
        boolean autenticado = auth.autenticar(usuario, "1234");
        System.out.println("Autenticado: " + autenticado);

        // Valido el nombre del usuario
        ValidacionService validacion = new ValidacionService();
        boolean nombreValido = validacion.validarNombre(usuario);
        System.out.println("Nombre valido: " + nombreValido);
    }
}
