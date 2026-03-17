package org.diegofigueroa.tema_03_claseoptional.clase_04_optionalcollection;

import java.util.List;
import java.util.Optional;

public class OptionalCollection {
    {
        /// Ejemplo 1
        List<String> names = List.of("Juan", "Ana", "Diego", "Daniela", "Roberto");
        Optional<String> first = names.stream().findFirst();
        first.ifPresent(n -> System.out.println("El primero es: " + n));

        /// Ejemplo 2
        List<String> emptyList = List.of();
        Optional<String> firtsEmpty = emptyList.stream().findFirst();
        System.out.println("Esta presente? " + firtsEmpty.isPresent());

        record Product(String name, double price){}

        List<Product> products = List.of(
                new Product("TV", 200),
                new Product("Notebook", 400)
        );

        Optional<Product> maybeTv = products.stream()
                .filter(p->p.name.equalsIgnoreCase("tv"))
                .findFirst();
        System.out.println("El resultado: " + maybeTv.orElse(new Product("Generido", 0)));


        /// Ejemplo 4
        String maybeName = null;
        Optional.ofNullable(maybeName)
                .ifPresentOrElse(
                        name -> System.out.println("El nombre es; "+ name.toUpperCase()),
                        () -> System.out.println("No se encontro ningun nombre")
                );

        List<Optional<String>> optionals = List.of(
                Optional.of("Hola"),
                Optional.empty(),
                Optional.ofNullable(null),
                Optional.of("Mundo")
        );
        String response = optionals.stream()
                .filter(e -> e.isPresent())
                .map(e -> e.get())
                .reduce("", (ac, str) -> ac + " " + str);
        System.out.println(response);
    }
}
