package com.company;

public class Main {

    public static void main(String[] args) {
        /*
            try: incluye el código de bloque que deseamos ejecutar
            catch: sólo se ejecuta si ocurre un error en el bloque try.
            finally: el bloque de código dentro del finally, se va a
                     ejecutar siempre, sí o sí.
         */
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cerrando recursos...");
        }

        System.out.println("Finalizar programa...");
    }
}
