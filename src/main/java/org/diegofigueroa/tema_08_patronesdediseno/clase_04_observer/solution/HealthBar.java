package org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer.solution;

public class HealthBar implements Observer{
    @Override
    public void update(int health) {
        System.out.println("Barra de salud actualizada: " + health);
    }
}
