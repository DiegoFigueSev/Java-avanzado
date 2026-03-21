package org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Troll;

import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Enemy;

public class Troll extends Enemy {

    public Troll() {
        this.name = "Goblin";
    }

    @Override
    public void attack() {
        System.out.println("Ataca con mucha fuerza");
    }
}
