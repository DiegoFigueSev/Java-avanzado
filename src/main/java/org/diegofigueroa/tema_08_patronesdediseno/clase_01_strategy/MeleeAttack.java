package org.diegofigueroa.tema_08_patronesdediseno.clase_01_strategy;

public class MeleeAttack implements IAttack{
    @Override
    public void attack(String characterName) {
        System.out.println(characterName + " Ataca cuerpo a cuerpo");
    }
}
