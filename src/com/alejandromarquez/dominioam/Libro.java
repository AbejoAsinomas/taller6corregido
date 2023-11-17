package com.alejandromarquez.dominioam;

public class Libro extends Recurso implements Prestable {
    public Libro(String nombre) {
        super(nombre);
    }

    @Override
    public void prestarMarquez() {
        if (!prestadoAlejo) {
            prestadoAlejo = true;
            System.out.println("Libro prestado: " + toString());
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolverMarquez() {
        if (prestadoAlejo) {
            prestadoAlejo = false;
            System.out.println("Libro devuelto: " + toString());
        } else {
            System.out.println("El libro no está prestado.");
        }
    }

    @Override
    public String getTipo() {
        return "Libro";
    }
    @Override
    public String getNombreMarquez() {
        return nombreAlejo;
    }
}


