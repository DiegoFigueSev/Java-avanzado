package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_04_shutdownnow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyShutdown {
    {
        try {
            program();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static public void program() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            var taskID = i;
            executor.submit(() -> {
                System.out.println("Tarea iniciando con executor " + taskID + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.println("Tarea + " + taskID + "Interrumpida");
                    return;
                }
                System.out.println("Tarea finalizada");
            });
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        boolean error = true;

        if (error){
            System.out.println("Situacion critica");
            executor.shutdownNow(); //? Este metodo detiene los hilos en ejecucion de manera innmediata
        } else {
            System.out.println("Finalizacion ordenada");
            executor.shutdown(); //? Finaliza el ejecutor cuando ningun hilo esta en ejecucion
        }

        if (executor.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("Tareas finalizadas correctamente");
        } else {
            System.out.println("Las tareas no fuerno finalizadas correctamente");
        }
    }
}
