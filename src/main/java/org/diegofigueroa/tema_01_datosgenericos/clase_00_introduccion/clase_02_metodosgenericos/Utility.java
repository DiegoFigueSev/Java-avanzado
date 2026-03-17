package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_02_metodosgenericos;

public class Utility {

    //? Debemos marcar con <T> para decir q el metodo sera generico siempre y cuando la clase no se agenerica
    public static <T> void printItem(T value){
        System.out.println(value);
    }

    public static <T, K> void printItem(T value, K key){
        System.out.println(value + " " + key);
    }


}
