/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos3;

/**
 *
 * @author yoven
 */
// Clase para enviar notificaciones por SMS
// La separo de EmailService porque son responsabilidades diferentes
public class SMSService {

    // Metodo para enviar un SMS (solo imprime un mensaje por ahora)
    public void enviarSMS(String numero, String mensaje) {
        System.out.println("Enviando SMS a: " + numero);
        System.out.println("Mensaje: " + mensaje);
    }
}
