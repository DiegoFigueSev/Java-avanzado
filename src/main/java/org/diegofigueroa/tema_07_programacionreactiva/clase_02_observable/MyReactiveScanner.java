package org.diegofigueroa.tema_07_programacionreactiva.clase_02_observable;

import io.reactivex.rxjava3.subjects.PublishSubject;

import java.util.Scanner;

public class MyReactiveScanner {
    {
        //? Un public subject es un observable pero que emite valores a medida q van ingresando
        PublishSubject<String> inputStream = PublishSubject.create(); //* Observable

        inputStream.subscribe( //* Observer
                item -> System.out.println("Recibido: " + item.toUpperCase()),
                error -> System.out.println(error.getMessage()),
                () -> System.out.println("Finalizando...")
        );

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto o salir para temrianr la aplicacion");

        String option;
        do {
            option = sc.nextLine();
            if (option.equalsIgnoreCase("salir")){
                inputStream.onComplete();
            }
            inputStream.onNext(option);
        }while (!option.equalsIgnoreCase("salir"));

        sc.close();
    }
}
