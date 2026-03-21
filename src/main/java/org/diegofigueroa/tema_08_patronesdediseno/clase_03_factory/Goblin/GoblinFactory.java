package org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Goblin;

import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Enemy;
import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.EnemyFactory;

public class GoblinFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
}
