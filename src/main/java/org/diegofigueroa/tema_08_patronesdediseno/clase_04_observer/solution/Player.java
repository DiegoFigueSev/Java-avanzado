package org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer.solution;

import java.util.ArrayList;
import java.util.List;

public class Player implements Subject{
    private int health = 100;
    private List<Observer> observers = new ArrayList<>();

    public void takeDamage(int damage){
        this.health -= damage;
        System.out.println("El jugador recibio dano");
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> o.update(health));
    }
}
