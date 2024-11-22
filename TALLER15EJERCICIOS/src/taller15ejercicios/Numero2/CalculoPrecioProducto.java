/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// Esta clase se encarga de los calculos relacionados con el precio del producto
// Como agregar impuestos al precio base
public class CalculoPrecioProducto {

    // Metodo para calcular el precio final (incluyendo impuestos)
    public double calcularPrecioFinal(Producto producto, double impuesto) {
        return producto.getPrecioBase() * (1 + impuesto);
    }
}
