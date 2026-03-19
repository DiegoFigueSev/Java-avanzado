package org.diegofigueroa.tema_06_hilosyconcurrencia.clase_01_thread.runnable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyRunnable implements Runnable{
    /**
     * Nosotros tenemos restricciones al momento de extender
     * Es por ello que es mejor implementar runnable y asignarle el mismo a un hilo
     *
     * La interface define UNA TAREA que puede ejecutarse en un hilo
     *
     * es preferible la interface
     */

    private String name;

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.printf("%s mensaje: %d ejecutando en %s\n", name, i, Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
