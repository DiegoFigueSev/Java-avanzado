package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_03_concurrenciayparalelismo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyParallelism {
    {
        System.out.println("Ejecutando single Thread Executor");

        ExecutorService single = Executors.newFixedThreadPool(3);
        long start = System.currentTimeMillis();
        //? El metodo submit envia uan tarea runnable para q se ejecute en un hilo del pool
        single.submit(() -> task("Tarea A"));
        single.submit(() -> task("Tarea B"));
        single.submit(() -> task("Tarea C"));
        single.submit(() -> task("Tarea D"));




        single.shutdown();
        try {
            single.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (end - start)/1000 );
    }

    public static void task(String name){
        System.out.println("Iniciando la tarea " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tarea finalizada en hilo " + Thread.currentThread().getName());
    }
}
