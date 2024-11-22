/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Aqui hice una clase para manejar la persistencia de los datos del libro
// Esto significa guardar o recuperar libros de algun lugar (por ahora solo imprime mensajes)
public class PersistenciaLibro {

    // Metodo para "guardar" un libro
    public void guardarLibro(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' en la base de datos.");
    }
}
