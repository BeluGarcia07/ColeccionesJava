
package ej3.servicios;

import ej3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicios {
    Scanner imput = new Scanner(System.in).useDelimiter("\n");
    
    public Alumno crearAlumno (){
        Alumno alumno = new Alumno();
        
        System.out.println("Ingrese el nombre del alumno");
        String nombre = imput.next();
        alumno.setNombre(nombre);
        
        int i=0;
        while(i<3){
            System.out.println("Ingrese nota "+(i+1));
            Integer nota= imput.nextInt();
            alumno.getNotas().add(nota);
            i++;
        }
        
        return alumno;
    }
    
    public int existe(ArrayList <Alumno> alumnos, String nombre){
        
        int indice = -1;
        for(int i=0;i<alumnos.size();i++){
            if (alumnos.get(i).getNombre().equals(nombre)){
                indice= i;
            }
        }
        
        return indice;
    }
    
    public float notaFinal(Alumno alumno){
        float notaFinal;
        
        Integer nota1= alumno.getNotas().get(0);
        Integer nota2= alumno.getNotas().get(1);
        Integer nota3= alumno.getNotas().get(2);
        
        return notaFinal = (nota1+nota2+nota3)/3;
    }
}
