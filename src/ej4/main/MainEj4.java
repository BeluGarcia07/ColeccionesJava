
package ej4.main;

import ej4.entidades.Pelicula;
import ej4.servicios.PeliculaServicios;
import java.util.Collections;
import java.util.Scanner;

public class MainEj4 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicios servicios = new PeliculaServicios();
        
        boolean bandera = true;
        do{
            System.out.println("Ingrese peliculas a la lista");
            
            Pelicula peli = servicios.crearPelicula();
            servicios.agregarPelicula(peli);
            
            System.out.println("¿Desea ingresar una nueva pelicula?(S/N)");
            String rta = imput.next();
            if(rta.equalsIgnoreCase("n")){
                bandera = false;
            }
        }while(bandera == true);
        
        System.out.println("\nTodas las peliculas de la lista son:");
        servicios.mostrarPeliculas();
        
        System.out.println("\nLas peliculas que tienen una duracion mayor a 1 hora son:");
        servicios.mostrarPelisMayor1hr();
        servicios.mostrarPeliculas();
        
        System.out.println("\n*PELICULAS ORDENADAS POR ORDEN DECSENDENTE CON RESPECTO A SU DURACION*");
        servicios.ordenarPelisPorDuracionDesc();
        servicios.mostrarPeliculas();
        
        System.out.println("\n*PELICULAS ORDENADAS POR ORDEN ASCENDENTE CON RESPECTO A SU DURACION*");
        servicios.ordenarPelisPorDuracionAsc();
        servicios.mostrarPeliculas();
        
        System.out.println("\n*PELICULAS ORDENADAS ALFABETICAMENTE CON RESPECTO AL TITULO*");
        servicios.ordenarPelisPorTitulo();
        servicios.mostrarPeliculas();
        
        System.out.println("\n*PELICULAS ORDENADAS ALFABETICAMENTE CON RESPECTO AL DIRECTOR*");
        servicios.ordenarPelisPorDirector();
        servicios.mostrarPeliculas();
        
    }
    
}
