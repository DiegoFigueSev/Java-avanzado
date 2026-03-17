package org.diegofigueroa.tema_02_programacionfuncional.clase_05_streams;

import java.util.List;
import java.util.stream.Stream;

public class OperacionesIntermediasYTerminales {
    {
        //? Los Streams son consumibles
        //? No son reutilizables

        Stream<String> stream = Stream.of("Diego", "Figueroa", "Sevillano", "Hernan");

        stream.forEach(System.out::println);

        List<String> strings = stream.toList();
        System.out.println(strings); //! Esto da error, un stream es consumible y terminal

        //? Las operacioens intermedias son perezosas.
        //? Las operacioens intemredias son PEREZOSAS, si no se tiene una operacion intermedia no hara nada.

        //! Un strem solo puede tener una operacion terminal
    }
}
