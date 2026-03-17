package org.diegofigueroa.tema_03_claseoptional.practica.model;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {
    private Long id;
    private String name;
    private double price;
    private int stock;
    private ProductCategory category;
}
