package org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.concretos;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.GameCharacter;
import org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy.MagicAttack;

@Data
public class Mage extends GameCharacter {

    public Mage(String name) {
        super.name = name;
        this.attackStrategy = new MagicAttack();
    }
}
