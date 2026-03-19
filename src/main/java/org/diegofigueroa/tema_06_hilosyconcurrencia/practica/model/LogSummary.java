package org.diegofigueroa.tema_06_hilosyconcurrencia.practica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor @ToString
public class LogSummary {
    private int totalEntries;
    private int errorCount;
    private Set<String> uniqueUsers;
    private double averageResponseTime;
    private Map<Integer, Long> errorCountsByCode;
}
