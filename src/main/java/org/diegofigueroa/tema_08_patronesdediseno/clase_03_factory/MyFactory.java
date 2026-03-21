package org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory;

import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Goblin.GoblinFactory;
import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Troll.TrollFactory;

public class MyFactory {
    static void main() {
        /**
         * Que es facotry?
         * Un patron creacional
         * El codigo cliente no instancia clases utilizando el new
         * La creacion se delega a una fabrica especializada
         *
         * Permite q el cliente trabajo con clases abstractcas
         */
        EnemyFactory goblinFactory = new GoblinFactory();
        EnemyFactory trollFactory = new TrollFactory();

        var goblin = goblinFactory.createEnemy();
        var troll = trollFactory.createEnemy();

        goblin.attack();
        troll.attack();
    }
}
/**
 * Para q funciona el factory?
 *
 * Nos ayuda a crear objetos, porque tambien involucra logica
 *
 * En que nos ayuda factory?
 * A centralizar la creacion de un objeto
 *
 * Cuando lo usamos?
 * Cuando involucramos pagos
 * Tipos de archivos
 * Estrategias
 *
 * Ejemplo mental;
 * Dependiendo de ALGO creo un objeto distinto
 */
