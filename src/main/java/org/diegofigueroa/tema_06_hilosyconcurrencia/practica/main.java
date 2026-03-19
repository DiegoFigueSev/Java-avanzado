package org.diegofigueroa.tema_06_hilosyconcurrencia.practica;

import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.model.LogEntry;
import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.model.LogSummary;
import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.service.LogProcessorTask;
import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.service.LogService;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    static void main() throws InterruptedException {
        System.out.println("Iniciando analisis de logs...");

        File logsFolder = new File("logs");
        File[] logFiles = logsFolder.listFiles((dir, name) -> name.contains(".log"));

        if (logFiles == null || logFiles.length == 0){
            System.out.println("No se encontraron archivos .log en la carpeta logs");
            return;
        }

        LogService service = new LogService();

        List<LogEntry> entries = service.readLogsFromFile(logFiles[0].getAbsolutePath());

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<LogSummary> a = executorService.submit(new LogProcessorTask(entries));
        Future<LogSummary> b = executorService.submit(new LogProcessorTask(entries));
        Future<LogSummary> c = executorService.submit(new LogProcessorTask(entries));

        while (!a.isDone() || !b.isDone() || !c.isDone()){
            System.out.println("procesando...");
            Thread.sleep(500);
        }

        try {
            System.out.println(a.get());
            System.out.println(b.get());
            System.out.println(c.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
