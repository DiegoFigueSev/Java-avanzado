package org.diegofigueroa.tema_02_programacionfuncional.clase_01_expresioneslambda;

//? Interface funcional
@FunctionalInterface
public interface Operation {
    int operate(int a, int b);

    default String show(){
        return "Soy una operacion";
    }

    static Operation substraction(){
        return (a, b) -> a - b;
    }
}
