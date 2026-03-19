package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_01_thread.mythread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyThread extends Thread{
    /**
     * Nosotros creamos un hilo de ejecucion en JAVA
     * Extender nos permite seguir utilizandola funcionalida de los hilos implementado por thread
     * Esta clase tiene la capacidad de ejecutar codigo en paralelo
     */

    private String name;

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.printf("%s mensaje: %d ejecutando en %s\n", name, i, Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
