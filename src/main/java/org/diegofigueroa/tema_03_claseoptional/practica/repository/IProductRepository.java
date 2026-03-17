package org.diegofigueroa.tema_03_claseoptional.practica.repository;

import org.diegofigueroa.tema_03_claseoptional.practica.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    void loadNewProduct(Product product) throws Exception;
    Product getProductById(Long id) throws Exception;
    List<Product> getAll() throws Exception;
    Optional<Integer> getTotalProducts();
}
