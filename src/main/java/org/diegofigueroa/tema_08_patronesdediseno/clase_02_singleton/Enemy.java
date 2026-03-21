package org.diegofigueroa.tema_08_patronesdediseno.clase_02_singleton;

import lombok.ToString;

@ToString
public class Enemy {
    private final int id;

    public Enemy() {
        this.id = IDGenerator.getInstance().generateId();
    }

    public void showId(){
        System.out.println("Enemigo con ID: " + id);
    }
}
