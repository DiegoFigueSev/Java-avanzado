package org.diegofigueroa.tema_08_patronesdediseno.clase_02_singleton;

public class MySingleton {
    static void main() {

        /**
         * SINGLETON
         *
         * Es un patron de diseno creacional
         * Nos permite asegurarnos de que una clase tenga una unica instancia
         * A la vez proporciona un punto de acceso global a dicha instancia
         */

        //? Nos ayuda a compaortir estado o recursos unicos

        Enemy enemy = new Enemy();
        Player player = new Player();
        System.out.println(enemy);
        System.out.println(player);
    }
}
