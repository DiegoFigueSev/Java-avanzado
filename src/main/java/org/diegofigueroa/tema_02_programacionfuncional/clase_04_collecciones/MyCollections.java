package org.diegofigueroa.tema_02_programacionfuncional.clase_04_collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyCollections {
    {
        List<String> names = Arrays.asList("Diego", "Figueroa", "Sevillano"); //Lista de tamano fijo pero con elementos mutables
        names.forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6)); //Lista totalmente inmutable
        numbers.removeIf(v -> v % 2 == 0);
        System.out.println(numbers);

        List<String> words = new ArrayList<>(List.of("Diego", "Java", "Stream", "Lambda"));
        words.replaceAll(String::toUpperCase);
        System.out.println(words);
    }
}
