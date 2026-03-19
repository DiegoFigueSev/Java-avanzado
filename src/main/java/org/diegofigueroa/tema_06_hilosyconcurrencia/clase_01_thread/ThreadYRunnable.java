package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_01_thread;

import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_01_thread.mythread.MyThread;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_01_thread.runnable.MyRunnable;

public class ThreadYRunnable {
    {
        /**
         * Un hilo es un camino de ejecucion SEPARADO dentro del programa.
         * Lo usamos para no bloquear el hilo principal
         *
         *
         */

        System.out.println("Inicio " + Thread.currentThread().getName());

        /*
        MyThread thread1 = new MyThread("Proceso a");
        MyThread thread2 = new MyThread("Proceso b");
        thread1.start();
        thread2.start();
        System.out.println("Fin del hilo principal");
         */

        Thread thread = new Thread(new MyRunnable("Tarea a"));

        thread.start();

        System.out.println("Fin el hilo principal");
    }
}
