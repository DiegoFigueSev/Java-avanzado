package org.diegofigueroa;


import org.diegofigueroa.tema_03_claseoptional.practica_final.controller.ProductController;
import org.diegofigueroa.tema_03_claseoptional.practica_final.interfaces.ProductRepository;
import org.diegofigueroa.tema_03_claseoptional.practica_final.repository.ProductRepositoryServices;
import org.diegofigueroa.tema_03_claseoptional.practica_final.service.ProductService;
import org.diegofigueroa.tema_03_claseoptional.practica_final.view.ProductView;

public class Main {
    static void main() {
        ProductRepository repositoryServices = new ProductRepositoryServices();
        ProductService productService = new ProductService(repositoryServices);
        ProductController controller = new ProductController(productService);
        ProductView view = new ProductView(controller);
        view.showMenu();

    }
}
