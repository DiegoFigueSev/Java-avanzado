package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_05_callableyfuture;

import java.util.concurrent.*;

public class MyCallable {
    {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> sumtask = new SumCalculator(5, 60);

        Future<Integer> result = executor.submit(sumtask);

        while (!result.isDone()){
            System.out.println("Procesando");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            System.out.println("Resultado: " + result.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }



        executor.shutdown();
    }
}
