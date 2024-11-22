/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Esta clase la cree para generar informes de los usuarios
// Asi dejo claro que los informes son una responsabilidad diferente a la de los datos del usuario
public class InformeService {

    // Metodo para imprimir un informe basico del usuario
    public void generarInformeUsuario(Usuario usuario) {
        System.out.println("Generando informe para " + usuario.getNombre());
    }
}
