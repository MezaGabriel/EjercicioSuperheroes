package edu.ejercicioheroes;

import edu.ejercicioheroes.domain.Arma;
import edu.ejercicioheroes.domain.Habilidad;
import edu.ejercicioheroes.domain.Heroe;
import edu.ejercicioheroes.domain.Villano;
import edu.ejercicioheroes.domain.exceptions.NoEsUnEnemigoException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class Ejercicio2 {

    @Test
    public void ejercicio2(){
        Heroe genji = new Heroe(List.of(
                new Habilidad("Shuriken", 20),
                new Habilidad("Ataque Dragon", 300)
        ));

        Villano hanzo = new Villano(
                new Arma("Arco dragones gemelos",250, 1)
        );

        assertThatThrownBy(() -> genji.atacar(hanzo))
                .isExactlyInstanceOf(NoEsUnEnemigoException.class);

        hanzo.atacar(genji);
        hanzo.atacar(genji);

        genji.atacar(hanzo);


        assertThat(genji.getVida())
                .isEqualTo(500);

        assertThat(hanzo.getVida())
                .isEqualTo(1000);
    }
}
