package edu.ejercicioheroes.domain;


public class Habilidad {

    private String nombre;
    private double poder;
    
    public Habilidad(String nombre, double poder){
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    
}
