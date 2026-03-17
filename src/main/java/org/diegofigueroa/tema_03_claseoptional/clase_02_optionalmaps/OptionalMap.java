package org.diegofigueroa.tema_03_claseoptional.clase_02_optionalmaps;

import java.util.Optional;

public class OptionalMap {
    {

        //map
        Optional<String> name = Optional.of("          Gabriel             ");
        String nameUpperCase = name
                .map(String::trim)
                .map(String::toUpperCase)
                .orElse("Sin nombre");

        System.out.println("Nombre en mayuscula " + nameUpperCase);


        Optional<Optional<String>> optionalOfOptional = Optional.of(Optional.of("Valor intermedio"));
        String resultMap = optionalOfOptional.flatMap(op -> op).orElse("Sin valor");

    }
}
