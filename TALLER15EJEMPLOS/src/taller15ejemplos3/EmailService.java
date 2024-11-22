/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos3;

/**
 *
 * @author yoven
 */
// Clase para enviar notificaciones por correo
// La hice separada para que no se mezcle con las notificaciones por SMS
public class EmailService {

    // Metodo para enviar un email (solo imprime un mensaje por ahora)
    public void enviarEmail(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}
