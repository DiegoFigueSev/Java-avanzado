package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_02_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
    {
        //? El executor Service es un coordinador de tareas
        //? Separa la creacion de hilos de la logia de ejecutar
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //? Eejecuta la tarea en cuestion
        executor.execute(() -> System.out.println("Tarea A " + Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Tarea B " + Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Tarea C " + Thread.currentThread().getName()));

        executor.shutdown();

        //* Cual es la diferencia?
        //*  Con executor delegamos la gestion de tareas a un pool

    }
}
