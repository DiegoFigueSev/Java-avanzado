package org.diegofigueroa.tema_03_claseoptional.practica_final.interfaces;


import org.diegofigueroa.tema_03_claseoptional.practica_final.exception.InvalidProductDataException;
import org.diegofigueroa.tema_03_claseoptional.practica_final.exception.ProductNotFoundException;
import org.diegofigueroa.tema_03_claseoptional.practica_final.model.Product;
import org.diegofigueroa.tema_03_claseoptional.practica_final.model.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll() throws InvalidProductDataException;
    Optional<Product> findById(Long id);
    void save(Product product) throws InvalidProductDataException;
    void delete(Long id);
    List<Product> findByCategory(ProductCategory category);
    void update(Optional<Product> product) throws ProductNotFoundException;
    boolean existsById(Long id);
}
