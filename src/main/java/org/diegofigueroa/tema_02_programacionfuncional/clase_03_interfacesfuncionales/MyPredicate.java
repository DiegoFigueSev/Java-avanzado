package org.diegofigueroa.tema_02_programacionfuncional.clase_03_interfacesfuncionales;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
    {
        //? Predicate : 1 PARAMETRO -> BOOLEANO
        Predicate<Integer> isEven = (v) -> v%2 == 0;
        boolean result = isEven.test(6);
        System.out.println("Es par? " + result);

        //? BiPredicate : 2 PARAMETROS -> BOOLEANO
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        result = checkLength.test("hola", 4);
        System.out.println("Es igual? " + result);
    }
}
