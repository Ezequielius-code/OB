package com.DatosAvanzados;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        System.out.println("Tamaño vector: " + vector.size() + " Capacidad vector: " + vector.capacity());

        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        vector.add(12);

        System.out.println("Tamaño vector: " + vector.size() + " Capacidad vector: " + vector.capacity());

        /*
        El vector tiene una capacidad por default de 10 elementos.
        Si supero esa capacidad, al ser un "array" dinámico, el vector
        duplicará su tamaño.
        No conviene abusar del resize, ya que es un proceso costoso que
        implica más operaciones además de un mayor uso de memoria.
         */

        //Como generar un vector con una capacidad determinada y
        //setear la cantidad de posiciones a agregar ante un eventual resize:

        Vector<Integer> vector1 = new Vector(50, 15);

        //Donde el primer número es la capacidad del vector,
        //y el segundo, los espacios que se añadirán en el resize.

        vector1.add(1);
        vector1.add(2);

        boolean result = vector.equals(vector1);
        System.out.println("¿Son iguales? " + result);

        for (int i : vector) {
            System.out.println("Valor actual en vector: " + i);
        }

        for (int i = 0; i < vector.size(); i++) {
            if (i % 2 == 0) {
                vector.remove(i);
                continue;
            }
            System.out.println("Valor: " + vector.get(i) + ", en posición: " + i);
        }

        //Hacer que el vector decrezca

        System.out.println("Tamaño del vector: " + vector.size() + " Capacidad del vector: " + vector.capacity());
        vector.trimToSize();
        System.out.println("Tamaño del vector: " + vector.size() + " Capacidad del vector: " + vector.capacity());
    }
}
