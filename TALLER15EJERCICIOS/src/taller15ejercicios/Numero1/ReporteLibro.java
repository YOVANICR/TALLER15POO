/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Cree esta clase para manejar todo lo que tiene que ver con reportes de libros
// Esto lo saque de la clase Libro para no mezclar responsabilidades
public class ReporteLibro {

    // Metodo para generar un reporte del libro
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro:");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}
