
package ej5.servicios;

import ej5.entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicios {
    
    private Scanner imput;
    private TreeSet<Pais> paises;

    public PaisServicios() {
        paises = new TreeSet();
        imput = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Pais crearPais(){
        System.out.println("Ingrese el nombre");
        String nombre = imput.next();
        System.out.println("Ingrese la cantidad de habitantes");
        int cant = imput.nextInt();
        
        return new Pais(nombre,cant);
    }
    
    public void agregarPais(Pais p){
        paises.add(p);
    }
    
    public void mostrarPaises(){
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    public boolean eliminarPais(String nombre){
        boolean rta = false;
        
        Iterator<Pais> it = paises.iterator(); 
        while (it.hasNext()) {
            Pais aux = it.next();
            if(aux.getNombre().equals(nombre)){
                it.remove();
                rta = true;
            }
        }
        return rta;
    }
    
    
}
