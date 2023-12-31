package com.alejandromarquez.dominioam;

public class Revista extends Recurso implements Prestable {
    public Revista(String nombre) {
        super(nombre);
    }

    @Override
    public void prestarMarquez() {
        if (!prestadoAlejo) {
            prestadoAlejo = true;
            System.out.println("Revista prestada: " + toString());
        } else {
            System.out.println("La revista ya está prestada.");
        }
    }

    @Override
    public void devolverMarquez() {
        if (prestadoAlejo) {
            prestadoAlejo = false;
            System.out.println("Revista devuelta: " + toString());
        } else {
            System.out.println("La revista no está prestada.");
        }
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
    @Override
        public String getNombreMarquez() {
        return nombreAlejo;
    }
}



