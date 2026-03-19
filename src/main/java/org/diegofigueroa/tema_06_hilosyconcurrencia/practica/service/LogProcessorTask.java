package org.diegofigueroa.tema_06_hilosyconcurrencia.practica.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.model.LogEntry;
import org.diegofigueroa.tema_06_hilosyconcurrencia.practica.model.LogSummary;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

@AllArgsConstructor
public class LogProcessorTask implements Callable<LogSummary> {
    private final List<LogEntry> entries;


    @Override
    public LogSummary call() throws Exception {
        int totalEntries = entries.size();
        Integer errorCount = entries.stream()
                .map(LogEntry::getStatusCode)
                .filter(e -> e > 400)
                .reduce(Integer::sum)
                .orElse(0);
        Set<String> uniqueUsers = entries.stream()
                .map(LogEntry::getUser)
                .collect(Collectors.toSet());
        double averageResponseTime = entries.stream()
                .mapToInt(LogEntry::getResponseTimeMs)
                .average()
                .orElse(0.0);
        Map<Integer, Long> errorCountsByCode = entries.stream()
                .map(LogEntry::getStatusCode)
                .filter(e -> e > 400)
                .collect(Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                ));
        Thread.sleep(100);
        return new LogSummary(totalEntries, errorCount, uniqueUsers, averageResponseTime, errorCountsByCode);
    }

    //testeo
}
