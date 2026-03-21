package org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy;

public class BowAttack implements IAttack{
    @Override
    public void attack(String characterName) {
        System.out.println(characterName + " Ataca con arco y flecha");
    }
}
