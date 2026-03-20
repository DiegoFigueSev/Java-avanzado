package org.diegofigueroa.tema_07_programacionreactiva.clase_03_temperaturesensor;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class MySensor {
    {



        Runnable task = MySensor::mytask;

        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(task);

        service.shutdown();




    }


    static void mytask(){

        System.out.println("Comenznado tarea en el hilo; " + Thread.currentThread().getName());
        Observable<?> interval = Observable.interval(1, TimeUnit.SECONDS).take(5);


        Observable<Double> temperatureStream = interval.map(
                _ -> {
                    double temp = 20 + Math.random() * 15;
                    System.out.println("Temperatura actual " + temp);
                    return temp;
                }
        );

        temperatureStream
                .filter(aDouble -> aDouble > 30)
                .subscribe(
                        item -> System.out.println("ALRTA TEMPERATURA ALTA"),
                        throwable -> System.out.println(throwable.getMessage()),
                        () -> System.out.println("Fin")
                );
    }
}
