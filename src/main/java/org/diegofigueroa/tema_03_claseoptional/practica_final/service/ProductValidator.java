package org.diegofigueroa.tema_03_claseoptional.practica_final.service;


import org.diegofigueroa.tema_03_claseoptional.practica_final.exception.InvalidProductDataException;
import org.diegofigueroa.tema_03_claseoptional.practica_final.model.Product;

public class ProductValidator {

    public static void validate(Product product) throws InvalidProductDataException {
        if (product.getPrice() <= 0) {
            throw new InvalidProductDataException("El precio debe ser mayor a 0");
        }

        if (product.getStock() < 0) {
            throw new InvalidProductDataException("El stock no puede ser negativo");
        }
    }
}

