package org.diegofigueroa.tema_02_programacionfuncional.clase_02_programacionfuncional;

import java.util.function.Function;

public class ProgramacionFuncional {
    {
        /**
         * La programacion funcional es un paradigma
         *
         * En POO tenemos clases, objetos y atributos.
         *
         * En funcional la pieza fundamental son las funciones
         */

        /**
         * Funcion pura
         * Es aquella q recibe un valor de entrada y recibe la misma salida
         */

        /**
         * No Pura
         * Es aquella que no da una misma salida
         */


        applyOperation(6, 2, (x, y) -> x * y);
    }

    public static void functionalProgramming(){
        Function<Integer, Double> multiply = a -> Math.pow(a, 2);
        multiply.apply(4); //* Siempre obtenemos 8
        System.out.println(multiply.apply(4));
    }

    //? La programacion funcional es una programacion declarativa

    //* Funciones de orden superior - Funciones como argumento
    //* Inmutables - Una vez q asignamos un valor, no lo cambiamos


    static void applyOperation(int x, int y, Operation op){
        int result = op.compute(x, y);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Operation {
    int compute(int a, int b);
}
