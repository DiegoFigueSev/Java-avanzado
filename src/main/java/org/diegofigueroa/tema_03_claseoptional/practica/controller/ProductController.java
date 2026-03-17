package org.diegofigueroa.tema_03_claseoptional.practica.controller;

import org.diegofigueroa.tema_03_claseoptional.practica.model.Product;
import org.diegofigueroa.tema_03_claseoptional.practica.service.ProductService;
import org.diegofigueroa.tema_03_claseoptional.practica.view.ProductView;

import java.io.IOException;
import java.util.List;

public class ProductController {
    private final ProductService service;

    public ProductController() throws Exception{
        this.service = new ProductService();
    }

    public void create(Product product) throws Exception {
        service.loadNewProduct(product);
    }

    public Product search(Long id) throws Exception{
        return service.getProductById(id);
    }

    public List<Product> getAll() throws Exception{
        return service.getAll();
    }
}
