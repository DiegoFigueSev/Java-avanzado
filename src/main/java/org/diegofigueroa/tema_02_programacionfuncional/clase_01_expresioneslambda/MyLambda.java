package org.diegofigueroa.tema_02_programacionfuncional.clase_01_expresioneslambda;

public class MyLambda {

    //? Clase anonima que implementa la interface operation
    //* No es new de la interface, es una sintaxis especial para implementar interfaces
    Operation op = new Operation() {
        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    };

    Operation multiply = (a, b) -> a * b;

    {
        /**
         * Una funcion lambda es una funcion ANONIMA, una funcion sin nombre
         */

        System.out.println(op.operate(5, 5));
        System.out.println(multiply.operate(2,3));
    }
}
