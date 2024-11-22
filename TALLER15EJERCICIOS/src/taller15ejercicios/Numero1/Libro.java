/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Aqui cree una clase Libro que inicialmente tenia demasiadas responsabilidades
// Ahora, solo guarda los datos basicos de un libro, como titulo y autor
public class Libro {
    private String titulo;
    private String autor;

    // Constructor para inicializar los datos del libro
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Metodo para obtener el titulo del libro
    public String getTitulo() {
        return titulo;
    }

    // Metodo para obtener el autor del libro
    public String getAutor() {
        return autor;
    }
}
