package org.diegofigueroa.tema_01_datosgenericos.clase_00_introduccion.clase_01_datosgenericos;

import java.util.ArrayList;

public class ObjectYGenericos {
    {
        /**
         * La clase object es el superpadre de todas las clases
         *
         * Permite almacenar cualquier dato
         *
         * Los metodos basicos vienen desde Object
         */

        // ? No debemos confundirlo con objects

        Object number = Integer.valueOf(10);
        number = "Hola";

        //? No es lo mismo q var
        var name = "Diego";
        //? Var solo funciona para variables locales, no como parametro o como atributo de clase
        //? Con var hacemos INFERENCIA de tipos

        System.out.println(number);

        ArrayList<String> list = new ArrayList<>();
        list.add("Diego");
        list.add("Roberto");

        for (Object o : list){
            String text = (String) o;
            System.out.println(text.toUpperCase());
        }

        System.out.println("Mi clase generica");
        Box<String> stringBox = new Box<>("Diego");
        System.out.println(stringBox.getValue());
        Box<Integer> integerBox = new Box<>(32);
        System.out.println(integerBox.getValue());

    }
}
