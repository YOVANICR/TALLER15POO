/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos3;

/**
 *
 * @author yoven
 */
// Clase de prueba para verificar el sistema de notificaciones
public class PruebaNotificaciones {
    public static void main(String[] args) {
        // Creo un servicio de email y envio un mensaje
        EmailService emailService = new EmailService();
        emailService.enviarEmail("correo@ejemplo.com", "Hola, este es un mensaje por correo");

        // Creo un servicio de SMS y envio un mensaje
        SMSService smsService = new SMSService();
        smsService.enviarSMS("1234567890", "Hola, este es un mensaje por SMS");
    }
}
