package com.alejandromarquez.dominioam;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Recurso> recursosDisponiblesAlejo = new ArrayList<>();
    private List<Recurso> recursosPrestadosAlejo = new ArrayList<>();

    public Biblioteca() {
    }

    public void addRecursoMarquez(Recurso recurso) {
        recursosDisponiblesAlejo.add(recurso);
    }

    public boolean prestarRecursoMarquez(Prestable prestable) {
        if (recursosDisponiblesAlejo.contains(prestable) && !prestable.estaPrestadoMarquez()) {
            prestable.prestarMarquez();
            recursosPrestadosAlejo.add((Recurso) prestable);
            recursosDisponiblesAlejo.remove(prestable);
            return true;
        } else {
            System.out.println("El recurso '" + prestable.getNombreMarquez() + "' no está disponible para préstamo.");
            return false;
        }
    }

    public boolean devolverRecursoMarquez(Prestable prestable) {
        if (recursosPrestadosAlejo.contains(prestable) && prestable.estaPrestadoMarquez()) {
            prestable.devolverMarquez();
            recursosPrestadosAlejo.remove(prestable);
            recursosDisponiblesAlejo.add((Recurso) prestable);
            return true;
        } else {
            System.out.println("El recurso no está prestado o no es válido para devolución.");
            return false;
        }
    }

    public void listarPrestadosMarquez() {
        System.out.println("Recursos Prestados:");
        for (Recurso recurso : recursosPrestadosAlejo) {
            System.out.println(recurso);
        }
        System.out.println();
    }

}






