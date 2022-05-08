
package ej6.main;

import ej6.servicios.ProductoServicios;
import java.util.Scanner;

public class Ej6Main {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        ProductoServicios servicio = new ProductoServicios();
        
        String rta;
        System.out.println("*Lista de productos*");
        do{
            System.out.println("\nIngrese un producto");
            System.out.println("Nombre");
            String nombre = imput.next();
            System.out.println("Precio");
            Float precio = imput.nextFloat();
            
            servicio.agregarProducto(nombre, precio);
            
            System.out.println("¿Desea ingresar un nuevo producto?(S/N)");
            rta = imput.next();
        }while(rta.toUpperCase().equals("S"));
        
        int opc;
        boolean bandera = true;
        System.out.println("*Menu de opciones*");
        do{
            System.out.println("\n¿Que desea hacer?");
            System.out.println("1. Ingresar un nuevo elemento");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Cambiar el precio de un producto");
            System.out.println("4. Mostrar lista de productos");
            System.out.println("5. Salir");
            opc = imput.nextInt();
            
            switch(opc){
                case 1: 
                    System.out.println("\nIngrese un producto");
                    System.out.println("Nombre");
                    String nombre = imput.next();
                    System.out.println("Precio");
                    Float precio = imput.nextFloat();
            
                    servicio.agregarProducto(nombre, precio);
                    break;
                case 2: 
                    System.out.println("Ingrese el nombre del producto que desea eliminar");
                    String nombrep= imput.next();
                    
                    if(servicio.eliminarProducto(nombrep)){
                        System.out.println("Se elimino correcta el producto");
                    } else{
                        System.out.println("No se encontro el elemento que desea eliminar");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto al que desea cambiar su precio");
                    String nombrep2 = imput.next();
                    System.out.println("Ingrese el nuevo precio");
                    Float preciop = imput.nextFloat();
                    
                    if(servicio.cambiarPrecio(nombrep2, preciop)){
                        System.out.println("Se cambio correctamente el precio del producto");   
                    }else{
                        System.out.println("No se encontro el producto al que desea cambiar el precio");
                    }
                    break;
                case 4:
                    System.out.println("*Lista de productos*");
                    servicio.mostrarProductos();
                    break;
                case 5: 
                    bandera = false;
                    break;
                default: 
                    System.out.println("Se ingresado una opcion incorrecta");
            }
            
        }while(bandera);
    }
    
}
