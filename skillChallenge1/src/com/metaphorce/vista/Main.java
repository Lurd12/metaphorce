package com.metaphorce.vista;

import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Configuration
        List<Pelicula> gestorPelicula = new ArrayList<>();
        gestorPelicula.add(new Pelicula(1, "Pokemon", true));
        gestorPelicula.add(new Pelicula(2, "El hobbit", true));
        gestorPelicula.add(new Pelicula(3, "Godzilla", false));
        gestorPelicula.add(new Pelicula(4, "Avengers", true));
        gestorPelicula.add(new Pelicula(5, "Balatro", false));

    }


    public static void menu(){
        int option = 0;
        do {
            System.out.println("""
                    Opciones
                    1.- Agregar pelicula
                    2.- Eliminar pelicual
                    3.- Obtener todas las peliculas
                    4.- Obtener peliculas disponibles
                    4.- Obtener peliculas disponibles
                    
                    
                    
                    """);

        } while(option != 5);

    }
}
