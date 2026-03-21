package org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Troll;

import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Enemy;
import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.EnemyFactory;
import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Goblin.Goblin;

public class TrollFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Troll();
    }
}
