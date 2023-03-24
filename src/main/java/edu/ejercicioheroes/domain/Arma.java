package edu.ejercicioheroes.domain;

public class Arma{
    
    private String nombre;
    private int danoBase;
    private int areaEfecto;
    
    public Arma(String nombre, int danoBase, int areaEfecto) {
        this.nombre = nombre;
        this.danoBase = danoBase;
        this.areaEfecto = areaEfecto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public int getAreaEfecto() {
        return areaEfecto;
    }

    public int disparar(){
        return danoBase / areaEfecto;
    }

}
