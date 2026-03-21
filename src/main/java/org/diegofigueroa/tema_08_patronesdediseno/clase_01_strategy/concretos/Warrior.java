package org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.concretos;

import lombok.Data;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.BowAttack;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.GameCharacter;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.MeleeAttack;

@Data
public class Warrior extends GameCharacter {

    public Warrior(String name) {
        super.name = name;
        this.attackStrategy = new MeleeAttack();
    }
}
