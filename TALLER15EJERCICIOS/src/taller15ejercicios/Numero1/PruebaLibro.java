/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Clase de prueba para ver como funciona todo despues de separar las responsabilidades
public class PruebaLibro {
    public static void main(String[] args) {
  
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez");

        // Genero un reporte del libro
        ReporteLibro reporte = new ReporteLibro();
        reporte.generarReporte(libro);

        // Guardo el libro en la "base de datos"
        PersistenciaLibro persistencia = new PersistenciaLibro();
        persistencia.guardarLibro(libro);
    }
}

