package org.diegofigueroa.tema_03_claseoptional.clase_00_introduccion;

import java.util.Optional;

public class Introduccion {
    {
        //? Optional nos ayuda a evitar crasheos por un null pointer excepcion

        //? Nos evita usar if null todo el tiempo

        //* Un Optionas es una clase cnotenedora que puede o no tener valor

        //haciamos lo sgte"
        Integer data = 0;
        if (data != null){
            System.out.println(data);
        }

        //*aHORA ESTO:
        Optional<String> name = Optional.of("Gabriel");

        if (name.isPresent()){
            System.out.println("El nombre esta presente");
        }

        //? Es cuando intuimos que nos puede llegar null
        String value = "Nicolais";
        Optional<String> nick = Optional.ofNullable(value);
        if (nick.isPresent()){
            System.out.println("Esta presente");
        } else {
            System.out.println("Esta vacio");
        }

        Optional<String> greeding = Optional.of("Hola mundo");

        greeding.ifPresent(message -> System.out.println("Soy Gabriel " + message));



    }
}
