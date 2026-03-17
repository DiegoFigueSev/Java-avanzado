package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_02_metodosgenericos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Box<T> {
    private T value;
}
