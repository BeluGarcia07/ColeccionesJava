
package ej3.Main;

import ej3.entidades.Alumno;
import ej3.servicios.AlumnoServicios;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class MainEj3 {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicios servicio = new AlumnoServicios();
        
        ArrayList alumnos = new ArrayList();
        boolean bandera=true;
        do{
            Alumno alumno = servicio.crearAlumno();
            alumnos.add(alumno);
            
            System.out.println("¿Desea agregar un nuevo alumno?(S/N)");
            String rta = imput.next();
            rta = toUpperCase(rta);
            
            if(rta.equals("N")){
                bandera = false;
            }
            
        } while(bandera);
        
        System.out.println("¿Desea calcular la nota final de un alumno?(S/N)");
        String opc = imput.next();
        opc = toUpperCase(opc);
        
        if(opc.equals("S")){
            System.out.println("Ingrese el nombre del alumno");
            String nombre = imput.next();
            int indice = servicio.existe(alumnos, nombre);
            
            float notaFinal = servicio.notaFinal((Alumno) alumnos.get(indice));
            
            System.out.println("La nota final del alumno "+nombre+" es de: "+notaFinal);
        }
    }
    
}
