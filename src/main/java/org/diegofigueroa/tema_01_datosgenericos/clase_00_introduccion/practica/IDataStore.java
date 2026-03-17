package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.practica;

import java.security.Key;
import java.util.List;

public interface IDataStore<K, T> {
    void add(K key,T item);
    void remove(K key);
    T find(K key);
    List<T> getAll();
}
