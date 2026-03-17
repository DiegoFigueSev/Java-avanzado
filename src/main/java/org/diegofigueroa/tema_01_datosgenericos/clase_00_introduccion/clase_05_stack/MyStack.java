package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_05_stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T>{
    /**
     * Un stack sigue el LIFO
     *
     * Last in, First Out
     *
     * Es un conjunto que va apilando
     */

    private List<T> elements = new ArrayList<>();

    public void push(T element){
        elements.add(element);
        System.out.println("Elemento agregado");
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public T peek(){
        if (isEmpty()) throw new IllegalStateException("La pila esta vacioa");
        return elements.getLast();
    }

    public T pop(){
        if (isEmpty()) throw new IllegalStateException("La pila esta vacioa");
        return elements.removeLast();
    }
}
