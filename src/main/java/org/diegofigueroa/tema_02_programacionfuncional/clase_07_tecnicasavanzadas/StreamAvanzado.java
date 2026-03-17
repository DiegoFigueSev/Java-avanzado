package org.diegofigueroa.tema_02_programacionfuncional.clase_07_tecnicasavanzadas;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAvanzado {

    {

        List<ProductDTO> products = List.of(
                new ProductDTO("Notebook", 1200.0),
                new ProductDTO("Mouse", 25.5),
                new ProductDTO("Keyboard", 55.0),
                new ProductDTO("Keyboard", 100.0)
        );

        List<String> list = products.stream()
                .map(v -> new ProductDTO(v.name(), v.price()*0.9))
                .map(v -> String.format("%s $ %.2f", v.name(), v.price()))
                .toList();

        System.out.println(list);

        //? Agrupacion avanzada
        Map<String, List<ProductDTO>> byPriceRange = products.stream()
                .collect(Collectors.groupingBy(
                        v -> v.price() > 50 ? "Caro" : "Barato"
                )); //* collect es una operacion terminal
        System.out.println(byPriceRange);

        //? Agrupacion avanzada
        Map<String, Long> byPriceCount = products.stream()
                .collect(Collectors.groupingBy(
                        v -> v.price() > 50 ? "Caro" : "Barato",
                        Collectors.counting()
                )); //* collect es una operacion terminal
        System.out.println(byPriceCount);

        //? Reduccion matematica
        Double total = products.stream()
                .map(ProductDTO::price)
                .reduce(0.0, Double::sum); //* Count es una operacion terinal
        //? Que es la reduccion: Es similar a un acumulador, pero el concepto asociado al reduce funcional, transforma una coleccion de eventos en un unico valor
        //? En este caos suma y va acumulando
        System.out.println(total);

        String myResponse = products.stream()
                .map(p -> String.format("%s (%.2f) ", p.name(), p.price()))
                .reduce("", String::concat);
        System.out.println(myResponse);

        //? CONVERSION ENTRE COLECCIONES
        Set<Double> uniquePrices = products.stream()
                .map(ProductDTO::price)
                .collect(Collectors.toSet());
        System.out.println(uniquePrices);

        Map<String, Double> productMap = products.stream()
                .collect(Collectors.toMap(
                        ProductDTO::name,
                        ProductDTO::price,
                        (oldVal, newVal) -> newVal
                ));
        System.out.println(productMap);

        List<ProductDTO> expensiveProducts = productMap.entrySet().stream()
                .filter(e -> e.getValue() > 50)
                .map(e -> new ProductDTO(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
        System.out.println(expensiveProducts);
    }




}
