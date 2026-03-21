package org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.concretos;

import lombok.Data;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.BowAttack;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.GameCharacter;

@Data
public class Archer extends GameCharacter {

    public Archer(String name) {
        super.name = name;
        this.attackStrategy = new BowAttack();
    }
}
