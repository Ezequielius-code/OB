package com.DatosAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key01", 10);
        map.put("Key02", 20);
        map.put("Key03", 30);

        System.out.println(map);
        System.out.println(map.get("Key02"));

        //Sustituir valores
        map.put("Key03", 90);
        map.replace("Key02", 25); //forma coherente de reemplazo.

        //Eliminar valores
        map.remove("Key03");

        for (Map.Entry element : map.entrySet()) {
            System.out.println("Key element: " + element.getKey());
            System.out.println("Value element: " + element.getValue());
        }
    }
}
