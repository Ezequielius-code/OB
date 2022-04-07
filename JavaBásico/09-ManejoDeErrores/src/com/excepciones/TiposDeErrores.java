package com.excepciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiposDeErrores {

    public static void main(String[] args) {
        //Hay 3 tipos de errores: de compilación, en tiempo de ejecución y de lógica.

        demoMapa();

        //ERROR EN TIEMPO DE EJECUCIÓN (al ingresar 0(cero) como divisor)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int result = numberA / numberB;
        System.out.println("Result is: " + result);

        //ERROR DE LÓGICA
        int temperature = (int) (Math.random() * 10);
        if (temperature < 10) {
            System.out.println("Hace calor!!!");
        } else if (temperature > 10) {
            System.out.println("Hace frío!!!");
        }
    }

    public static void demoMapa() {
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

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println("Key element: " + element.getKey());
            System.out.println("Value element: " + element.getValue());
        }
    }
}
