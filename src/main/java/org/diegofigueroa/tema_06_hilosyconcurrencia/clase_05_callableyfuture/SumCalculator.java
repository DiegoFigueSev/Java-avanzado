package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_05_callableyfuture;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;

@AllArgsConstructor
public class SumCalculator implements Callable<Integer> {

    private int number1;
    private int number2;

    @Override
    public Integer call() throws Exception {
        System.out.println("TAREA; INICIANDO SUMA...");
        Thread.sleep(1500);
        int sum = number1 + number2;
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Suma finalizada");
        return sum;
    }
}
