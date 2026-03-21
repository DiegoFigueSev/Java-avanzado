package org.diegofigueroa.tema_08_patronesdediseno.clase_04_observer.solution;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
