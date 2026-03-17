package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_01_datosgenericos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Usamos T por convencion de type como tipo de dato pero podemos usar cualquier letra
 * @param <T>
 */
@Data
@AllArgsConstructor
public class Box<T> {
    private T value;
}
