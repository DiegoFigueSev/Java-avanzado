package org.diegofigueroa;


import org.diegofigueroa.tema_03_claseoptional.practica_final.controller.ProductController;
import org.diegofigueroa.tema_03_claseoptional.practica_final.interfaces.ProductRepository;
import org.diegofigueroa.tema_03_claseoptional.practica_final.repository.ProductRepositoryServices;
import org.diegofigueroa.tema_03_claseoptional.practica_final.service.ProductService;
import org.diegofigueroa.tema_03_claseoptional.practica_final.view.ProductView;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_01_thread.ThreadYRunnable;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_02_executor.MyExecutor;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_02_executor.ThreadVsExecutor;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_02_executor.TiposDeExecutor;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_03_concurrenciayparalelismo.MyConcurrence;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_03_concurrenciayparalelismo.MyParallelism;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_04_shutdownnow.MyShutdown;
import org.diegofigueroa.tema_06_hilosyconcurrencia.clase_05_callableyfuture.MyCallable;

public class Main {
    static void main() {

        new MyCallable();


    }
}
