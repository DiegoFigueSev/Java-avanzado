package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.practica;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private final String id;
    private final String name;
}
