
package ej4.servicios;

import ej4.entidades.Pelicula;
import ej4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicios {
    
    
    private Scanner imput;
    private ArrayList <Pelicula> peliculas;

    public PeliculaServicios() {
        imput = new Scanner(System.in).useDelimiter("\n");
        peliculas = new ArrayList();
    }

    
    
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = imput.next();
        System.out.println("Ingrese el nombre del director de la pelicula");
        String director = imput.next();
        System.out.println("Ingrese la duracion de la pelicula");
        Float duracion = imput.nextFloat();
        
        return new Pelicula(titulo,director,duracion);
    }
    
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    
    public void mostrarPeliculas(){
        peliculas.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    
    public void mostrarPelisMayor1hr(){
        for (Pelicula aux : peliculas) {
            if(aux.getDuracion()>1){
               System.out.println(aux); 
            }
        }
    }
    
    public void ordenarPelisPorDuracionDesc(){
        Collections.sort(peliculas, Comparadores.ordenarDuracionPorOrdenDes);
    }
    
    public void ordenarPelisPorDuracionAsc(){
        Collections.sort(peliculas, Comparadores.ordenarDuracionPorOrdenAsc);
    }
    
    public void ordenarPelisPorDirector(){
        Collections.sort(peliculas, Comparadores.ordenarPorDirecorAsc);
    }
    
    public void ordenarPelisPorTitulo(){
        Collections.sort(peliculas, Comparadores.ordenarPorTituloAsc);
    }
}
