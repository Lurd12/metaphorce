package com.metaphorce.modelo;
import java.util.List;
import java.util.Map;

public class GestorPelicula {
    Map<Integer, Pelicula> peliculas;

    public GestorPelicula(Map<Integer,Pelicula> peliculas) {
        this.peliculas = peliculas;
    }


    public void agregarPelicula(Pelicula pelicula) throws RuntimeException {
        if (peliculas.putIfAbsent(pelicula.getId(), pelicula) != null){
            throw new RuntimeException("Ya existe una pelicula con id: " + pelicula.getId());
        }
    }

    public void eliminarPelicula(int id) throws RuntimeException {
       if (peliculas.remove(id) == null){
           throw new RuntimeException("No se ha encontrado la pelicula con id: " + id);
       }
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

    public void marcarPeliculaComoDisponible(int id) throws RuntimeException {
        if (peliculas.containsKey(id))
            peliculas.get(id).setDisponible(true);
        else
            throw new RuntimeException("No se ha encontrado la pelicual con id: " + id);
    }


}
