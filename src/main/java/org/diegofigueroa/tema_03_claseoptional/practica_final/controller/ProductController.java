package org.diegofigueroa.tema_03_claseoptional.practica_final.controller;


import org.diegofigueroa.tema_03_claseoptional.practica_final.exception.InvalidProductDataException;
import org.diegofigueroa.tema_03_claseoptional.practica_final.exception.ProductNotFoundException;
import org.diegofigueroa.tema_03_claseoptional.practica_final.model.Product;
import org.diegofigueroa.tema_03_claseoptional.practica_final.model.ProductCategory;
import org.diegofigueroa.tema_03_claseoptional.practica_final.service.ProductService;
import org.diegofigueroa.tema_03_claseoptional.practica_final.utils.Validates;

import java.util.List;
import java.util.Optional;

public class ProductController {
    private final ProductService services;

    public ProductController(ProductService services) {
        this.services = services;
    }

    public void addProduct(Product product) throws InvalidProductDataException, ProductNotFoundException {
        Validates.validateObject(product, "El product no pueden ser nulo.");
        services.saveProduct(product);
    }

    public void removeProduct(Long id) throws InvalidProductDataException, ProductNotFoundException {
        Validates.validate(id, "El id no puede ser nulo");
        services.deleteProduct(id);
    }

    public List<Product> getAllProducts() throws InvalidProductDataException {
        return services.getAllProducts();
    }
    public List<Product> getAllProductsByCategory(ProductCategory category) throws InvalidProductDataException {
        return services.getAllProductsByCategory(category);
    }

    public Optional<Product> getProductById(long id) throws InvalidProductDataException {
        Validates.validate(id, "El id no puede ser nulo");
        return services.getProductById(id);
    }

    public void updateProduct(Product product) throws InvalidProductDataException, ProductNotFoundException {
        Validates.validateObject(product, "El product no pueden ser nulo.");
        services.updateProduct(product);
    }
}
