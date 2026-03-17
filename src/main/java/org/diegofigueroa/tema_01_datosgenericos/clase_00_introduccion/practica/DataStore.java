package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.practica;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

public class DataStore<T, K> implements IDataStore<K, T>{
    private final List<T> myList = new ArrayList<>();
    private final Map<K, T> myMap = new HashMap<>();

    @Override
    public void add(K key, T item) {
        Objects.requireNonNull(key, "El key no puede ser nulo");
        Objects.requireNonNull(item, "El item no puede ser nulo");
        if (myMap.containsKey(item))return;
        myList.add(item);
        myMap.put(key, item);
    }

    @Override
    public void remove(K key) {
        Objects.requireNonNull(key, "La clave no puede ser nula");
        T item = myMap.remove(key);
        if (item != null) myList.remove(item);
    }

    @Override
    public T find(K key) {
        Objects.requireNonNull(key, "La clave no puede ser nula");
        return myMap.get(key);
    }

    @Override
    public List<T> getAll() {
        return Collections.unmodifiableList(myList);
    }
}
