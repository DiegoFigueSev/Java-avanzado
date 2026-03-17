package org.diegofigueroa.tema_02_programacionfuncional.clase_06_ternarios;

public class MyTernary {
    {
        String message;
        int age = 30;

        message = age >= 18 ? "Mayor de edad" : "Menor de edad";
        System.out.println(message);

        int score = 75;
        String level;
        level = score >= 90 ? "Excelente" : score >= 70 ? "Bueno" : "Regular";
        System.out.println(level);

        int accessLevel = 2;
        String accessMessage = "Acceso denegado";
        accessMessage = accessLevel >= 1 ? accessLevel >= 3 ? "Acceso total" : "Acceso parcial" : accessMessage;
        System.out.println(accessMessage);
    }
}
