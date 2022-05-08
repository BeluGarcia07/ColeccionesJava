
package ej4.utilidades;

import ej4.entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenarDuracionPorOrdenDes = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    
    public static Comparator<Pelicula> ordenarDuracionPorOrdenAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    
    public static Comparator<Pelicula> ordenarPorTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    
    public static Comparator<Pelicula> ordenarPorDirecorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
    
}
