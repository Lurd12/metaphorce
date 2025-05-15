package com.metaphorce.modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GestorPelicula {
    Map<Integer, Pelicula> peliculas;

    public GestorPelicula(Map<Integer,Pelicula> peliculas) {
        this.peliculas = peliculas;

    }
    public void agregarPelicula(Pelicula pelicula){
        peliculas.putIfAbsent(pelicula.getId(), pelicula);
    }

    public void eliminarPelicula(int id){
        peliculas.remove(id);
    }

    public List<Pelicula> obtenerPeliculas(){
        return peliculas.values().stream().toList();
    }

    public List<Pelicula> obtenerPeliculasDisponibles(){
        return peliculas.values().stream().filter(Pelicula::isDisponible).toList();
    }

    public List<Pelicula> obtenerPeliculasNoDisponibles(){
        return peliculas.values().stream().filter(pelicula-> !pelicula.isDisponible()).toList();
    }

    public void marcarPeliculaComoDisponible(int id){
        if (peliculas.containsKey(id))
            peliculas.get(id).setDisponible(true);
    }


}
