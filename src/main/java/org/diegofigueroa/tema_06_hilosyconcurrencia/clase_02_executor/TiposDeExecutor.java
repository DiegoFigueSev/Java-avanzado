package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_02_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TiposDeExecutor {
    {
        Runnable task = () -> {
            System.out.println("Ejecutando la tarea" + Thread.currentThread().getName());
        };
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tarea completana en el hilo " + Thread.currentThread().getName());

        System.out.println("Pool fixed");
        //?Pool fixed
        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            fixedPool.execute(task);
        }
        fixedPool.shutdown();


        System.out.println("Cached");
        //?Creacion de hilos como seran necesarios -> Similar a usar Thread
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            cachedPool.execute(task);
        }
        cachedPool.shutdown();

        System.out.println("single");
        //?Single thread -> Hilo unico, las tareas esperan en ese hilo
        ExecutorService single = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            single.execute(task);
        }
        single.shutdown();
    }

}
