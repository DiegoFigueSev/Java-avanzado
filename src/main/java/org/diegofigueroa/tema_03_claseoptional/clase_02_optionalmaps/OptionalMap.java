package org.diegofigueroa.tema_03_claseoptional.clase_02_optionalmaps;

import java.util.Optional;

public class OptionalMap {
    {

        //? DATO IMPORTANET!
        //* Optional nos ayuda a evitar null checks manuales
        //* Por eso puedo aplicarm ap y filter y demas parametros similar a un else
        //* En caso de no tener un valor evita realizar la funcion y nos regresa un optional
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
