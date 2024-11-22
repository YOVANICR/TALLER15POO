/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos2;

/**
 *
 * @author yoven
 */
// Esta clase se encarga del envio de pedidos
// La hice separada para que tenga su propia responsabilidad
public class EnvioService {

    // Metodo para "enviar" el pedido (solo imprime un mensaje por ahora)
    public void enviarPedido(Pedido pedido) {
        System.out.println("Enviando pedido con total: " + pedido.getTotal());
    }
}

