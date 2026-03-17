package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_06_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyQueue<T> {
    /**
     * Un queue es una fila, es una estuctura de datos
     *
     * Sigue FIFO = First in, First Out
     *
     */

    private final LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element){
        elements.addLast(element);
        System.out.println("Elemento agregado");
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public T peek(){
        if (isEmpty()) throw new IllegalStateException("La pila esta vacioa");
        return elements.getFirst();
    }

    public T pop(){
        if (isEmpty()) throw new IllegalStateException("La pila esta vacioa");
        return elements.removeFirst();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        for (int i = 0; i < elements.size()-1; i++){
            builder.append(elements.get(i)).append(", ");
        }
        builder.append(elements.getLast()).append("}");
        return builder.toString();
    }
}
