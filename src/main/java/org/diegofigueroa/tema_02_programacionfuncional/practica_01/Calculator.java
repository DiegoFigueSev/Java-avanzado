package org.diegofigueroa.tema_02_programacionfuncional.practica_01;

public class Calculator {
    public void operateAndPrint(int a, int b, Operation operation){
        System.out.println(operation.operate(a, b));
    }

    {
        operateAndPrint(5, 5, (a,b) -> a + b);
        operateAndPrint(5, 5, (a,b) -> a * b);
        operateAndPrint(5, 5, (a,b) -> a - b);
        operateAndPrint(5, 5, (a,b) -> a / b);
        operateAndPrint(5, 5, (a,b) -> a % b);
    }
}
