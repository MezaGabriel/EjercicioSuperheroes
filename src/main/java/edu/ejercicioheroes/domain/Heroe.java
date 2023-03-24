package edu.ejercicioheroes.domain;

import java.util.ArrayList;
import java.util.List;

import edu.ejercicioheroes.domain.exceptions.NoEsUnEnemigoException;

public class Heroe extends Personaje{
    
    private List<Habilidad> habilidades;
    private List<Personaje> aliados;

    public Heroe(List<Habilidad> habilidades){
        super();
        this.habilidades = habilidades;
        this.aliados = new ArrayList<>();
    }

    public void agregarAliado(Personaje entraAliado) {
        aliados.add(entraAliado);
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
    public List<Personaje> getAliado() {
        return aliados;
    }

    
    
    @Override
    public void atacar(Personaje enemigo) {
        if(!enemigos.contains(enemigo)) throw new NoEsUnEnemigoException();

        enemigo.recibirDano(calcularDano(), this);
    }

    @Override
    protected int calcularDano() {
        int danoHabilidadTotal = 0;
        for(Habilidad habilidad: habilidades){
            danoHabilidadTotal += habilidad.getPoder();
        }
        return danoHabilidadTotal * aliados.size();
        
    }
}
