package org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer.solution;

public class GameLogger implements Observer{
    @Override
    public void update(int health) {
        System.out.println("Registro: salud del jugador - " + health);
    }
}
