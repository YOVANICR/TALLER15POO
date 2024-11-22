/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// Clase creada para generar etiquetas de los productos
// Esto estaba en Producto, pero lo separe para seguir el SRP
public class EtiquetaProducto {

    // Metodo para generar una etiqueta con el nombre del producto
    public void generarEtiqueta(Producto producto) {
        System.out.println("Etiqueta del producto:");
        System.out.println("Producto: " + producto.getNombre());
    }
}
