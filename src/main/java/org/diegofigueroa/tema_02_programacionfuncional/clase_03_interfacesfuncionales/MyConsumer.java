package org.diegofigueroa.tema_02_programacionfuncional.clase_03_interfacesfuncionales;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyConsumer {
    {
        //? Funcino void con 1 entrada
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        printUpper.accept("Buenas tardes");

        //? Funcion void con 2 entradas
        BiConsumer<String, Integer> repeat = (word, times) -> {
            for (int i = 0; i < times; i++) {
                System.out.print(word);
            }
        };
        repeat.accept("Diego", 4);
    }
}
