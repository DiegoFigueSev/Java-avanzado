package org.diegofigueroa.tema_03_claseoptional.practica.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.diegofigueroa.tema_03_claseoptional.practica.model.Product;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductGsonRepository implements IProductRepository{
    private final Gson gson;
    private final String jsonName = "products.json";
    private List<Product> state;

    public ProductGsonRepository() throws IOException {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        initState();
    }

    private void initState() throws IOException {
        FileReader reader = new FileReader(jsonName);
        Type dataType = new TypeToken<List<Product>>(){}.getType();
        this.state = gson.fromJson(reader, dataType);
        reader.close();
    }

    @Override
    public void loadNewProduct(Product product) throws IOException {
        FileWriter writer = new FileWriter(jsonName);
        state.add(product);
        gson.toJson(state, writer);
        writer.close();
    }

    @Override
    public Product getProductById(Long id) throws IOException{
        FileReader reader = new FileReader(jsonName);
        Type dataType = new TypeToken<List<Product>>(){}.getType();
        List<Product> json = gson.fromJson(reader, dataType);
        reader.close();
        return json.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(""));

    }

    @Override
    public List<Product> getAll() throws IOException {
        FileReader reader = new FileReader(jsonName);
        Type dataType = new TypeToken<List<Product>>(){}.getType();
        List<Product> json = gson.fromJson(reader, dataType);
        reader.close();
        return json;
    }

    @Override
    public Optional<Integer> getTotalProducts() {
        return Optional.empty();
    }
}
