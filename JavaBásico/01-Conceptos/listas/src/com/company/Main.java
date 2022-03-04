package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //La lista es una interfaz, por lo que necesita una implementación.
        //La implementación más común de las listas, es el arrayList.

        List<String> names = new ArrayList<>();

        names.add("First Name");
        names.add("Second Name");
        names.add("Third Name");
        names.add("Fourth Name");

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
