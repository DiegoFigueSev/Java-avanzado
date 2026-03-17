package org.diegofigueroa.tema_02_programacionfuncional.clase_03_interfacesfuncionales;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunction {
    {
        //? Recibe un parametro y me regresa otro
        Function<String, Integer> checkLength = String::length;
        int length = checkLength.apply("Programacion");
        System.out.println("La longitud es; " + length);

        //? Recibe 2 y retorna uno
        BiFunction<Integer, Integer, String> sumToString = (a, b) -> "Resultado: " + (a + b);
        System.out.println(sumToString.apply(2, 3));
    }
}
