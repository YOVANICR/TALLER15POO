/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos2;

/**
 *
 * @author yoven
 */
// Esta clase la hice para calcular los impuestos del pedido
// La separo para que solo maneje calculos y no otras cosas
public class CalculoTotalService {

    // Metodo que calcula los impuestos del pedido (15% del total)
    public double calcularImpuestos(Pedido pedido) {
        return pedido.getTotal() * 0.15;
    }
}
