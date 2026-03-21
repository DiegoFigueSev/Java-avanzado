package org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class GameCharacter {
    protected String name;
    protected IAttack attackStrategy;

    public void setAttack(IAttack attack) {
        this.attackStrategy = attack;
    }

    public void attack(){
        if (attackStrategy != null){
            attackStrategy.attack(name);
        }else {
            System.out.println("No tiene estrategia");
        }
    }
}
