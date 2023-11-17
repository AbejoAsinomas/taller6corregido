package com.alejandromarquez.dominioam;

public class Pelicula extends Recurso {
    public Pelicula(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipo() {
        return "Tesis";
    }
}
