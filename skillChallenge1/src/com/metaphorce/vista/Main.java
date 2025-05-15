package com.metaphorce.vista;
import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Configuration
        GestorPelicula gestorPelicula = new GestorPelicula(new HashMap<Integer, Pelicula>());

        //Agregar peliculas
        gestorPelicula.agregarPelicula(new Pelicula(1, "Pokemon", false));
        gestorPelicula.agregarPelicula(new Pelicula(2, "El hobbit", true));
        gestorPelicula.agregarPelicula(new Pelicula(3, "Godzilla", false));
        gestorPelicula.agregarPelicula(new Pelicula(4, "Avengers", true));
        gestorPelicula.agregarPelicula(new Pelicula(5, "Balatro", false));

        //Obtener peliculas
        System.out.println(gestorPelicula.obtenerPeliculas());

        // Eliminar pelicula
        gestorPelicula.eliminarPelicula(5);

        //Obtener peliculas disponibles
        System.out.println(gestorPelicula.obtenerPeliculasDisponibles());

        //Obtener peliculas no disponibles
        System.out.println(gestorPelicula.obtenerPeliculasNoDisponibles());


        //Marcar pelicula como disponible
        gestorPelicula.marcarPeliculaComoDisponible(3);

        System.out.println(gestorPelicula.obtenerPeliculas());

    }
}
