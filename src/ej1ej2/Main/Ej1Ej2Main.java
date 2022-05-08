
package ej1ej2.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1Ej2Main {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        
        boolean bandera = true;
        String perro;
        
        ArrayList <String> perros = new ArrayList();
        
        System.out.println("Ingrese un perro");
        perro = imput.next();
        perros.add(perro);
        
        String rta;
        while(bandera == true){
            System.out.println("¿Desea ingresar un nuevo perro?(S/N)");
            rta = imput.next();
            rta = rta.toUpperCase();
            if (rta.equals("S")){
                System.out.println("Ingrese un perro");
                perro = imput.next();
                perros.add(perro);
            } else{
                bandera=false;
            }     
        }
        
        System.out.println("Los perros ingresados son los siguientes:");
        
        for (String aux : perros) {
            System.out.println(aux);
        }
        
        System.out.println("Ingrese el perro que desea eliminar");
        perro = imput.next();
        
        Iterator it = perros.iterator();
        
        while (it.hasNext()) {
            String aux = (String) it.next();
            if(aux.equals(perro)){
                it.remove();
            }
        }

        
        System.out.println("Los perros ingresados son los siguientes:");
        
        for (String aux : perros) {
            System.out.println(aux);
        }
    }
    
}
