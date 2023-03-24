package edu.ejercicioheroes.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
 
    protected double vida;
    protected List<Personaje> enemigos;


    public Personaje() {
        this.vida = 1000;
        this.enemigos = new ArrayList<>();
    }

    public double getVida() {
        return vida;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }   
    
    
    public List<Personaje> getEsUnEnemigo() {
        return enemigos;
    }
    public void setEsUnEnemigo(List<Personaje> enemigos) {
        this.enemigos = enemigos;
    }

    public abstract void atacar(Personaje enemigo);

    protected abstract int calcularDano();

    public void recibirDano(int danoInflingido, Personaje personaje){
        vida -= danoInflingido;
        enemigos.add(personaje);
    }

 
}
