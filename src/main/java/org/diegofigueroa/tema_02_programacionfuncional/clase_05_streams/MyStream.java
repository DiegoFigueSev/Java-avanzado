package org.diegofigueroa.tema_02_programacionfuncional.clase_05_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStream {
    {
        List<String> names = Arrays.asList("Diego", "Figueroa", "Sevillano"); //Lista de tamano fijo pero con elementos mutables
        names.stream().forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6)); //Lista totalmente inmutable
        var newNumbers = numbers.stream()
                .filter(v -> v>3)
                .toList();
        System.out.println(newNumbers);
        System.out.println(numbers);

        List<String> words = new ArrayList<>(List.of("Diego", "Java", "Stream", "Lambda"));
        var upperWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperWords);
        System.out.println(words);

        //? Para aplicar una proramacion funcional, debemos usar strems para mantener la inmutabilidad

        /**
         * Que es un stream?
         * Es una parte clave de la programacion funcional
         *
         * eS UNA HERRAMIENTApara procesar una coleccion de datos y declarativa sin modificar la fuente original
         * Podemos:
         * - filtrar
         * - transformar
         * - contar
         *
         * Un stream es una cinta trasnportadora que manipula los elementos para dar otro resultado
         */


    }
}
