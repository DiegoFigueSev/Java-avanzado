package org.diegofigueroa.tema_03_claseoptional.practica.service;

import org.diegofigueroa.tema_03_claseoptional.practica.model.Product;
import org.diegofigueroa.tema_03_claseoptional.practica.repository.IProductRepository;
import org.diegofigueroa.tema_03_claseoptional.practica.repository.ProductGsonRepository;

import java.io.IOException;
import java.util.List;

public class ProductService {
    private final IProductRepository repository;

    public ProductService() throws IOException {
        this.repository = new ProductGsonRepository();
    }

    public void loadNewProduct(Product product) throws Exception {
        repository.loadNewProduct(product);
    }

    public Product getProductById(Long id) throws Exception{
        return repository.getProductById(id);
    }

    public List<Product> getAll() throws Exception{
        return repository.getAll();
    }
}
