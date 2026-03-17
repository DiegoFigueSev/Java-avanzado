package org.diegofigueroa.tema_02_programacionfuncional.clase_03_interfacesfuncionales;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Supplier;

public class MySupplier {
    {
        //? Solo retorna
        Supplier<Person> personFactory = () -> new Person("Diego");

        Person p1 = personFactory.get();
        System.out.println(p1);

    }
}

@Data
@AllArgsConstructor
class Person{
    private String name;
}
