package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_03_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    {
        List<String> names = new ArrayList<>();
        names.add("Diego");
        names.add("Figueroa");

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3));

        printList(names);
        printList(numbers);

        sumNumbers(numbers);

        addNumbers(numbers);
    }

    /**
     * Este list solo funciona si no queremos hacer modificacinoes
     * @param list
     */
    //? Puede leer cualquier tipo de dato del tipo object / prohbie agregar elemento porque no sabemos q nos llegara
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }

    //*  Covarianza - extends
    //? Restringimos el tipo de dato del wildcard // Permite leer pero no editar
    //* De numbers para abajo
    public static void sumNumbers(List<? extends Number> numbers){
        final double[] sum = {0};
        numbers.forEach(v -> {
            sum[0] += v.doubleValue();});
        System.out.println(sum[0]);
    }

    //* Contravarianza - super
    //? Acepta listas de tipo enteras, number e integer, podemos leer pero solo del tipo object y podemos editar la lista
    //* De Integer para arriba
    public static void addNumbers(List<? super Integer> numbers){
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        Object num = numbers.get(0);

        System.out.println(num);

    }


    //* El wildcard ? simboliza lo sgte:
    //* “hay un tipo aquí, pero no estoy diciendo exactamente cuál es”.

    /**
     * Usa wildcard ? cuando:
     *
     * no necesitas saber el tipo exacto
     *
     * solo quieres flexibilidad
     *
     * el tipo no necesita “nombre”
     *
     * trabajas con colecciones de lectura o escritura controlada
     *
     * Usa T cuando:
     *
     * el tipo debe relacionarse entre parámetros, retorno o variables
     *
     * necesitas expresar “entra un tipo y sale ese mismo”
     *
     * el tipo forma parte de la lógica del método o clase
     */
}
