package org.diegofigueroa.tema_03_claseoptional.clase_03_optionalfilter;

import java.util.Optional;

public class OptionalFilter {
    {
        Optional<String> dni = Optional.of("1234567");
        Optional<String> result = dni.filter(d -> d.startsWith("2"));
        System.out.println(result.orElse("No valido"));


        Optional<String> email = Optional.of("                gabriel@devtalles.com       ");
        email
                .map(e -> e.trim())
                .filter(e -> e.contains("@"))
                .filter(e -> e.contains(".com"))
                .ifPresent(message -> System.out.printf("Enviando correo a %s", message));

    }
}
