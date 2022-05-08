
package ej6.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicios {
    
    private Scanner imput;
    private HashMap<String, Float> productos;
    
    public ProductoServicios() {
        imput = new Scanner(System.in).useDelimiter("\n");
        productos = new HashMap();
    }
    
    public void agregarProducto(String nombre, Float precio){
        productos.put(nombre, precio);
    }
    
    public boolean eliminarProducto(String nombre){
        boolean rta = false;
        
        for (Map.Entry<String, Float> aux : productos.entrySet()) {
            String key = aux.getKey();
            
            if(key.equals(nombre)){
                productos.remove(key);
                rta = true;
            }
        }
        return rta;
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Float> aux : productos.entrySet()) {
            String key = aux.getKey();
            Float value = aux.getValue();
            
            System.out.println("Nombre: "+key+"--> Precio: "+value);
        }
    }
    
    public boolean cambiarPrecio (String nombre, Float precio){
        boolean rta = false;
        
        for (Map.Entry<String, Float> aux : productos.entrySet()) {
            String key = aux.getKey();
            
            if(key.equals(nombre)){
                aux.setValue(precio);
                rta = true;
            }
            
        }
        
        return rta;
    }
    
}
