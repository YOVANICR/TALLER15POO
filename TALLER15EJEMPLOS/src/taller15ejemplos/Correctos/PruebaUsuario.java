/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Clase de prueba para verificar como funcionan las tres clases juntas
public class PruebaUsuario {
    public static void main(String[] args) {
        // Creo un usuario
        Usuario usuario = new Usuario("admin", "1234");

        // Verifico la autenticacion
        AutenticacionService auth = new AutenticacionService();
        boolean autenticado = auth.autenticar(usuario, "1234");

        if (autenticado) {
            System.out.println("Usuario autenticado correctamente");
            // Genero un informe si la autenticacion fue exitosa
            InformeService informe = new InformeService();
            informe.generarInformeUsuario(usuario);
        } else {
            System.out.println("Error: Usuario o contraseña incorrectos");
        }
    }
}
