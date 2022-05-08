
package ej5.main;

import ej5.entidades.Pais;
import ej5.servicios.PaisServicios;
import java.util.Scanner;

public class Ej5Main {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        PaisServicios servicio = new PaisServicios();
        
        String rta;
        System.out.println("Ingrese un pais a la lista");
        do{
            Pais p = servicio.crearPais();
            servicio.agregarPais(p);
            
            System.out.println("¿Desea ingresar un nuevo pais a la lista?(S/N)");
            rta = imput.next();
        } while(rta.toUpperCase().equals("S"));
        
        System.out.println("\nLos paises ingresados son:");
        servicio.mostrarPaises();
        
        System.out.println("\n¿Desea eliminar un pais?(S/N)");
        rta = imput.next();
        if (rta.toUpperCase().equals("S")){
            System.out.println("Ingrese el nombre del pais");
            String nombre = imput.next();
            
            if(servicio.eliminarPais(nombre)== true){
                System.out.println("Se elimino correctamente el pais");
                servicio.mostrarPaises();
            } else{
                System.out.println("El pais ingresado no se encuentra en la lista");
                servicio.mostrarPaises();
            }
            
        }
    }
    
}
