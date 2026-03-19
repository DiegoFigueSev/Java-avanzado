package org.diegofigueroa.tema_06_hilosyconcurrencia.practica.service;

import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.model.LogEntry;
import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.util.LogParser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class LogService {

    public List<LogEntry> readLogsFromFile(String path){
        try {
            return Files.lines(Path.of(path))
                    .map(LogParser::parseLine)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .toList();

        } catch (IOException e){
            System.out.println(e.getMessage());
            return List.of();
        }
    }

}
