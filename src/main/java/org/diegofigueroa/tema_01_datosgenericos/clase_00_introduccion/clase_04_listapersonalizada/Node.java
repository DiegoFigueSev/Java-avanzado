package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_04_listapersonalizada;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Node<T> {
    private T data;
    private Node<T> next;
}


