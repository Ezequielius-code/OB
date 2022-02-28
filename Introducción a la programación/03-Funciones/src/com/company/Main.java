package com.company;

public class Main {

    public static void main(String[] args) {
        int result;
        result = addition( 4, 2);
        System.out.println(result);

        subtraction( 15, 8);

        //Para pasar valores por referencia en Java, debo utilizar una instancia.
        //Se hará con la clase Potato.
        Potato myPotato = new Potato();

        myPotato.RemoveArm();
        myPotato.RemoveArm();
        myPotato.RemoveArm();

        System.out.println(myPotato.arms);
    }

    public static int addition( int a, int b ) {
        return a + b;
    }

    public static void subtraction( int a, int b ) {
        int result;
        result = a - b;
        System.out.println(result);
    }
}

class Potato {
    public int arms = 0;

    public void RemoveArm() {
        this.arms--;
    }
}