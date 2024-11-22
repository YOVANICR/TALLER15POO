/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos2;

/**
 *
 * @author yoven
 */
// Clase de prueba para verificar como funcionan las tres clases juntas
public class PruebaPedido {
    public static void main(String[] args) {
        // Creo un pedido con un total de 100
        Pedido pedido = new Pedido(100);

        // Calculo los impuestos
        CalculoTotalService calculo = new CalculoTotalService();
        double impuestos = calculo.calcularImpuestos(pedido);
        System.out.println("Impuestos calculados: " + impuestos);

        // Envio el pedido
        EnvioService envio = new EnvioService();
        envio.enviarPedido(pedido);
    }
}
