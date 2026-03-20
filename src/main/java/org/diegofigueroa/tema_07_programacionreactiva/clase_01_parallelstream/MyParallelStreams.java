package org.diegofigueroa.tema_07_programacionreactiva.clase_01_parallelstream;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyParallelStreams {
    {
        //* Los streams, son streams secuenciales, no gestiann hilos, se ejecutan en el mismo hilo

        //* Los stream paralelo utilizan hilos po detras

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        long start = System.currentTimeMillis();

        //* es una secuencia de datos que se ejecutan en multiples hilos
        numbers.parallelStream()
                .map(n -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Procesando numeros: " + n);
                    return n*2;
                }).forEach(System.out::println);

        long end = System.currentTimeMillis();

        System.out.println("TIEMPO TOTAL: " + (end - start));
    }
}
