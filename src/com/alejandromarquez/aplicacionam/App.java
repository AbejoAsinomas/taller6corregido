package com.alejandromarquez.aplicacionam;

import com.alejandromarquez.dominioam.*;

public class App {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad");
        Libro libro2 = new Libro("El amor en los tiempos del cólera");

        Revista revista1 = new Revista("Revista Colombiana de Ciencias Sociales");

        Pelicula pelicula1 = new Pelicula("El Padrino");
        Pelicula pelicula2 = new Pelicula("La La Land");

        CDMusica cd1 = new CDMusica("Abbey Road");
        CDMusica cd2 = new CDMusica("Thriller");

        biblioteca.addRecursoMarquez(libro1);
        biblioteca.addRecursoMarquez(libro2);
        biblioteca.addRecursoMarquez(revista1);
        biblioteca.addRecursoMarquez(pelicula1);
        biblioteca.addRecursoMarquez(pelicula2);
        biblioteca.addRecursoMarquez(cd1);
        biblioteca.addRecursoMarquez(cd2);


        biblioteca.prestarRecursoMarquez(libro1);
        biblioteca.prestarRecursoMarquez(libro1);
        biblioteca.prestarRecursoMarquez(libro2);
        biblioteca.prestarRecursoMarquez(revista1);
        biblioteca.prestarRecursoMarquez(cd1);
        biblioteca.prestarRecursoMarquez(cd2);

        biblioteca.devolverRecursoMarquez(libro1);

        biblioteca.listarPrestadosMarquez();
    }
}

