package org.diegofigueroa.tema_06_hilosyconcurrencia.practica.util;

import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.model.LogEntry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class LogParser {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static Optional<LogEntry> parseLine(String line){
        String[] parts = line.split("\\|");
        if (parts.length!=5) return Optional.empty();
        LocalDateTime timestamp = LocalDateTime.parse(parts[0].trim(), FORMATTER);
        String user = parts[1].trim();
        String action = parts[2].trim();
        int statusCode = Integer.parseInt(parts[3].trim());
        int responseTimeMs = Integer.parseInt(parts[4].trim());

        return Optional.of(new LogEntry(timestamp, user, action,statusCode, responseTimeMs));
    }
}
