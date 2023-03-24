package edu.ejercicioheroes;

import edu.ejercicioheroes.domain.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

/*
* NO TOCAR LOS TEST
* */
public class Ejercicio1 {


    @Test
    public void tracerVsWidowMaker(){

        Heroe winston = new Heroe(List.of(
                new Habilidad("Gorilla Rage", 200)
        ));

        Heroe tracer = new Heroe(
                List.of(
                        new Habilidad("Bomb", 100),
                        new Habilidad("SideKick", 30)
                )
        );

        tracer.agregarAliado(winston);
        winston.agregarAliado(tracer);

        Villano widowMaker = new Villano(
                new Arma("Sniper rifle", 100,1)
        );

        widowMaker.atacar(winston);
        widowMaker.atacar(tracer);

        tracer.atacar(widowMaker);
        winston.atacar(widowMaker);


        assertThat(widowMaker.getVida())
                .isEqualTo(670);

        assertThat(tracer.getVida())
                .isEqualTo(900);

        assertThat(winston.getVida())
                .isEqualTo(900);
    }
}
