/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejemplos2;

/**
 *
 * @author yoven
 */
// Aqui creo una clase Pedido que solo guarda datos del pedido
// No mezclo cosas como calculos o envio aqui
public class Pedido {
    private double total;

    // Constructor para asignar el total al pedido
    public Pedido(double total) {
        this.total = total;
    }

    // Este metodo devuelve el total del pedido
    public double getTotal() {
        return total;
    }
}
