package org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy;

import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.concretos.Archer;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.concretos.Warrior;

public class MyStrategy {
    /**
     * STRATEGY
     *
     * Nos permite cambiar el comportamiento sin modificar la clase
     *
     * Y que son los comportamientos? Son los metodos de una clase
     * CUANDO HABLAMOS DE COMPORTAMIENTO HABLAMOS DE INTERFACES
     */
    static void main() {
        GameCharacter archer = new Archer("Robin");
        GameCharacter mage = new Archer("Diego");
        GameCharacter warrior = new Warrior("Roberto");

        archer.attack();

        archer.setAttack(new MagicAttack()); //? Nosotros podemos cambiar el comportamiento del a clase en tiempo de ejecucion
        archer.attack();
    }

    /**
     * Las ventajas que nos da esto, es qeu si el dia de manana tenemos un comportamiento nuevo, simplemente creamos
     * una nueva clase que implemente la interface y se la pasamos al dato
     */

    //? El patron separa diferentes formas de hacer algo en clases intercambiables
}
