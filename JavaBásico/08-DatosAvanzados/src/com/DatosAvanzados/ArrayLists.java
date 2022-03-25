package com.DatosAvanzados;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Element A");
        list.add("Element B");
        list.add("Element C");

        System.out.println("Content: " + list);

        list.remove("Element B");
        System.out.println("Content: " + list);

        for (String element : list) {
            System.out.println(element);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + list.get(i));
        }

        String array[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        for (String element : array) {
            System.out.println("The element is: " + element);
        }

        list.add("Element D");
        list.add("Element E");
        list.add("Element F");

        for (Object arrayObject : list.toArray()) {
            System.out.println(arrayObject.toString());
        }

        LinkedList<String> firstList = new LinkedList<String>(list);
    }
}
