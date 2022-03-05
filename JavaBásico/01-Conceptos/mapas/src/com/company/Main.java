package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> persons = new HashMap<>();

        persons.put("12345678H", "Nombre Apellido 1");
        persons.put("15324678T", "Nombre Apellido 2");
        persons.put("12645378W", "Nombre Apellido 3");

        System.out.println(persons);

        //Distintas maneras de iterar sobre los mapas.

        //Imprimimos clave
        for (String key : persons.keySet()) {
            System.out.println(key);
        }

        //Imprimimos valor
        for (String value : persons.values()) {
            System.out.println(value);
        }

        //Imprimimos ambos
        for (Map.Entry<String, String> pair : persons.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
