package com.alejandromarquez.dominioam;

public class Tesis extends Recurso {
    public Tesis(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipo() {
        return "Tesis";
    }
}

