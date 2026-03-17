package org.diegofigueroa.tema_03_claseoptional.practica_final.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private double price;
    private int stock;
    private ProductCategory category;
}
