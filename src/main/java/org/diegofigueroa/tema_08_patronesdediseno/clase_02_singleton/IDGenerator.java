package org.diegofigueroa.tema_08_patronesdediseno.clase_02_singleton;


public class IDGenerator {
    private int currentID = 0;
    private static IDGenerator instance;

    public int generateId(){
        return ++currentID;
    }

    public static IDGenerator getInstance(){
        if (instance == null){
            instance = new IDGenerator();
        }
        return instance;
    }
}
