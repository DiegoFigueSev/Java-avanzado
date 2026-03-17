package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_02_metodosgenericos;

import java.util.function.Function;

public class MathUtils {

    //? Restringmos el tipo de dato generico q es
    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    /**
     * Function<T, R>        // recibe 1, devuelve 1
     * Consumer<T>           // recibe 1, no devuelve
     * Supplier<T>           // no recibe, devuelve 1
     * Predicate<T>          // recibe 1, devuelve boolean
     * UnaryOperator<T>      // recibe 1 y devuelve mismo tipo
     * BinaryOperator<T>     // recibe 2 del mismo tipo y devuelve mismo tipo
     * BiFunction<T, U, R>   // recibe 2, devuelve 1
     * BiConsumer<T, U>      // recibe 2, no devuelve
     * BiPredicate<T, U>     // recibe 2, devuelve boolean
     */
    Function<Double, Double> rest = (a) -> a*2;
}
