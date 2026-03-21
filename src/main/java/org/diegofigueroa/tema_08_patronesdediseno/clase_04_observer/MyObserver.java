package org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer;

import org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer.solution.GameLogger;
import org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer.solution.HealthBar;
import org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer.solution.Player;

public class MyObserver {
    static void main() {
        Player player = new Player();
        player.addObserver(new HealthBar());
        player.addObserver(new GameLogger());

        player.takeDamage(20);
        player.takeDamage(50);

    }
}
/**
 * Este patron es recomendable aplicalro cuando tengamos EVENTOS que disparan ACCIONES en multiples partes del sistema
 */


