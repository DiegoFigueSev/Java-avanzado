package org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Goblin;

import org.diegofigueroa.tema_08_patronesdediseno.clase_03_factory.Enemy;

public class Goblin extends Enemy {

    public Goblin() {
        this.name = "Goblin";
    }

    @Override
    public void attack() {
        System.out.println("Ataca a gran velocidad");
    }
}
