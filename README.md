# Ejercicio Superheroes

Este es un ejercicio sacado de [Utnianos](https://www.utnianos.com.ar/foro/tema-aporte-final-paradigmas-de-programacion-07-09-22)

## Enunciado

Queremos hacer un pequeño programa para modelar superheroes y villanos.
Nos piden implementar el ataque de los personajes teniendo en cuenta que los personajes pueden ser 
Heroes o Villanos.

A tener en cuenta:

- Tanto heroes como villanos tiene  como base 1000 de vida
- Un heroe solo puede atacar a sus enemigos
- Los villanos pueden atacar a cualquiera
- Luego de que un personaje reciba daño, considerara a su atacante como su enemigo
- A la hora de atacar
  - Un heroe ataca con tanto poder como la suma de los poderes de sus habilidades multiplicada por la cantidad de aliados que tenga
  - Un villano en cambio usa su arma para atacar, la cual produce un daño equivalente al daño base del arma dividido por el area de efecto de la misa


En los test que tiene este proyecto tanto heroes como villanos
combaten entre ellos, el objetivo es hacer los ajustes necesarios para que 
todos los tests pasen.


**Nota: los tests no se pueden tocar, se deben corregir los errores presentes en el test presentando la solucion**