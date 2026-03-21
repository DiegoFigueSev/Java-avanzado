package org.diegofigueroa.tema_08_patronesdediseno.clase_02_singleton;

import lombok.ToString;

@ToString
public class Player {
    private final int id;

    public Player() {
        this.id = IDGenerator.getInstance().generateId();
    }

    public void showId(){
        System.out.println("Player con ID: " + id);
    }
}
