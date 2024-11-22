/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// Clase de prueba para verificar que todo funciona correctamente
public class PruebaProducto {
    public static void main(String[] args) {
        
        Producto producto = new Producto("Laptop", 1000);

        // Genero la etiqueta del producto
        EtiquetaProducto etiqueta = new EtiquetaProducto();
        etiqueta.generarEtiqueta(producto);

        // Calculo el precio final con un impuesto del 15%
        CalculoPrecioProducto calculo = new CalculoPrecioProducto();
        double precioFinal = calculo.calcularPrecioFinal(producto, 0.15);
        System.out.println("Precio final con impuesto: " + precioFinal);
    }
}
