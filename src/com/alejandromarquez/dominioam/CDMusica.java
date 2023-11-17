package com.alejandromarquez.dominioam;

public class CDMusica extends Recurso implements Prestable {
    public CDMusica(String nombre) {
        super(nombre);
    }

    @Override
    public void prestarMarquez() {
        if (!prestadoAlejo) {
            prestadoAlejo = true;
            System.out.println("CD Musical prestado: " + toString());
        } else {
            System.out.println("El CD Musical ya está prestado.");
        }
    }

    @Override
    public void devolverMarquez() {
        if (prestadoAlejo) {
            prestadoAlejo = false;
            System.out.println("CD Musical devuelto: " + toString());
        } else {
            System.out.println("El CD Musical no está prestado.");
        }
    }

    @Override
    public String getTipo() {
        return "CD Musical";
    }

    @Override
    public String getNombreMarquez() {
        return nombreAlejo;
    }
}
