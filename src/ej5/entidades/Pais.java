
package ej5.entidades;

import java.util.Objects;

public class Pais implements Comparable<Pais>{
    
    private String nombre;
    private int cantHabitantes;

    public Pais() {
    }

    public Pais(String nombre, int cantHabitantes) {
        this.nombre = nombre;
        this.cantHabitantes = cantHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", cantHabitantes=" + cantHabitantes + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.cantHabitantes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (this.cantHabitantes != other.cantHabitantes) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombre.compareTo(t.getNombre());
    }
    
    
    
}
