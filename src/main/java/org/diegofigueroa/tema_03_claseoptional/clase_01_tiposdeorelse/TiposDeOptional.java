package org.diegofigueroa.tema_03_claseoptional.clase_01_tiposdeorelse;

import java.util.Optional;
import java.util.Scanner;

public class TiposDeOptional {
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = sc.nextLine();

        Optional<String> optionalName = Optional.empty();

        //? OrElse = Si no
        if (name.isEmpty()){
            name = optionalName.orElse("Invitado");
        }
        System.out.println(name);

        //? OrElseGet
        Optional<String> optional = Optional.ofNullable(name)
                .filter(val -> !val.isEmpty());

        String response = optional.orElseGet(()->"Invitado");
        System.out.println(response);

        //? OrElseThrow
        Optional<String> optional2 = Optional.ofNullable(name)
                .filter(val -> !val.isEmpty());

        String response2 = optional2.orElseThrow(() -> new IllegalStateException("Dato no bueno"));
        System.out.println(response2);

        /**
         * Si el valor por defecto es simple → orElse -> Si mandamos una funcion como argumento al orElse, este siempre ejecutara la funcion este o no presente el valor del optional
         *
         * Si es costoso (DB, API, cálculo) → orElseGet
         *
         * Si es obligatorio → orElseThrow
         */
    }
}
