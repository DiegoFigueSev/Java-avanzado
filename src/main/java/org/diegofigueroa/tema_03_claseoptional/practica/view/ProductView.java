package org.diegofigueroa.tema_03_claseoptional.practica.view;

import org.diegofigueroa.tema_03_claseoptional.practica.controller.ProductController;
import org.diegofigueroa.tema_03_claseoptional.practica.exception.InvalidDataException;
import org.diegofigueroa.tema_03_claseoptional.practica.model.Product;
import org.diegofigueroa.tema_03_claseoptional.practica.model.ProductCategory;

import java.util.Objects;
import java.util.Scanner;

public class ProductView {
    private Scanner sc;
    private final ProductController controller;

    public ProductView() throws Exception {
        this.sc = new Scanner(System.in);
        try {
            this.controller = new ProductController();
        } catch (Exception e) {
            System.out.println("Error levantando la aplicacion");;
            throw e;
        }
    }

    public void optionsMessage(){
        System.out.println("""
                1. Cargar nuevo producto
                2. Buscar producto por ID
                3. Listar productos
                4. Salir
                """);
    }

    public int getOptionInput(){
        return sc.nextInt();
    }

    private Long getProductIdInput(){
        while (true){
            try {
                System.out.println("Ingresa el id del producto");
                Long id = sc.nextLong();
                Objects.requireNonNull(id, "El id no puede ser nulo");
                if (id.toString().length() < 5) throw new InvalidDataException("El id debe tener mas de 5 digitos");
                return id;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private String getProductNameInput(){
        while (true){
            try {
                System.out.println("Ingresa el nombre del producto");
                String name = sc.nextLine();
                Objects.requireNonNull(name, "El nombre no puede ser nulo");
                if (name.trim().isEmpty()) throw  new InvalidDataException("El nombre no puede estar vacio");
                return sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private double getProductPriceInput(){
        while (true){
            try{
                System.out.println("Ingresa el precio del producto");
                Double price = sc.nextDouble();
                Objects.requireNonNull(price, "El precio no puede ser nulo");
                if(price <= 0) throw new InvalidDataException("El precio debe ser mayor a 0");
                return price;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private int getProductStockInput(){
        while (true){
            try{
                System.out.println("Ingresa el stock del producto");
                Integer stock = sc.nextInt();
                Objects.requireNonNull(stock, "El precio no puede ser nulo");
                if(stock < 0) throw new InvalidDataException("El stock debe ser mayor o igual a 0");
                return stock;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private int getCategoryInput(){
        System.out.printf("""
                Selecciona una categoria
                1. %s
                2. %s
                3. %s
                """, ProductCategory.ELECTRONICS, ProductCategory.FOOD, ProductCategory.CLOTHING);
        return sc.nextInt();
    }

    private ProductCategory getCategory(){
        int categoryOption = getCategoryInput();
        while (true){
            switch (categoryOption){
                case 1:
                    return ProductCategory.ELECTRONICS;
                case 2:
                    return ProductCategory.FOOD;
                case 3:
                    return ProductCategory.CLOTHING;
                default:
                    System.out.println("Ingresa un valor valido");
            }
        }
    }

    public Product getProduct(){
        var id = getProductIdInput();
        var name = getProductNameInput();
        var price = getProductPriceInput();
        var stock = getProductStockInput();
        var category = getCategory();
        return new Product(id, name, price, stock, category);
    }

    public void show(){
        int option = 0;
        while (option != 4){
            optionsMessage();
            option = getOptionInput();
            switch (option){
                case 1:
                    try {
                        controller.create(getProduct());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(controller.search(getProductIdInput()));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println(controller.getAll());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Finalizando programa");
            }
        }
    }


}
