/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero2;

/**
 *
 * @author yoven
 */
// La clase Producto ahora solo guarda los datos basicos de un producto
// Como nombre y precio base, no maneja calculos ni etiquetas
public class Producto {
    private String nombre;
    private double precioBase;

    // Constructor para inicializar los datos del producto
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Metodo para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Metodo para obtener el precio base del producto
    public double getPrecioBase() {
        return precioBase;
    }
}
