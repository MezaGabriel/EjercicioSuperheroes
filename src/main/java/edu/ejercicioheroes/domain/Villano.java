package edu.ejercicioheroes.domain;


public class Villano extends Personaje{
  
    private Arma arma;

    public Villano(Arma arma) {
        this.arma = arma;
    }
    public Arma getArma() {
        return arma;
    }


    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDano(calcularDano(), this);
    }
    
    @Override
    protected int calcularDano() {
        return arma.disparar();
    }
}
