package org.diegofigueroa.tema_07_programacionreactiva.clase_02_observable;

import io.reactivex.rxjava3.core.Observable;

public class MyObservable {

    {

        //PRIMER EJEMPLO
        //* Esta clase es la principal, representa un flujo de datos
        //? just -> Metodo estatico y emite secuencialmente los elementos que tiene
        Observable<String>courseStream = Observable.just("Html", "css", "java", "go", "pythn");


        courseStream
                .subscribe(
                item -> System.out.println("Recibido: " + item),
                error -> System.out.println(error.getMessage()),
                () -> System.out.println("Finalizando....")
        );

    }
}
