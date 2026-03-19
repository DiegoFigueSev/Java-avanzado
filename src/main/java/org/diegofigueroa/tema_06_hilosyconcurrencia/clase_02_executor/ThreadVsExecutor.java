package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_02_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadVsExecutor {
    {
        for (int i = 0; i < 500; i++) {
            new Thread(
                    () -> System.out.println("Tarea A" + Thread.currentThread().getName())
            ).start();
        }
        //? Un thread no tiene control sobre la creacion de hilos, creara hilos siempre y cuando lo necesito para cada tarea distinta


        System.out.println("EXECUTOR");
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 500; i++) {
            service.execute(
                    () -> System.out.println("Tarea A" + Thread.currentThread().getName())
            );
        }
        service.shutdown();
        //? Tenemos mayor control en la creacion de hilos
    }
}
