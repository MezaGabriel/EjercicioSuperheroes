package edu.ejercicioheroes.domain.exceptions;

public class NoEsUnEnemigoException extends RuntimeException{

    public NoEsUnEnemigoException(){
        super("El objetivo no es un enemigo, no se puede atacar");
    }
}