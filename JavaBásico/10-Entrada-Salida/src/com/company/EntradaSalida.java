package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSalida {

    public static void main(String[] args) throws FileNotFoundException {
        /*try {
            InputStream file = new FileInputStream("C:/Windows/System32/drivers/etc/protocol");
            try {
                byte[] allData = file.readAllBytes();
                for (byte data : allData) {
                    System.out.print((char)data);
                }
            } catch (IOException e) {
                System.out.println("File cannot be read: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has been produced: " + e.getMessage());
        }*/

        //Leo caracter a caracter:
        /*try {
            InputStream file = new FileInputStream("C:/Windows/System32/drivers/etc/protocol");
            try {
                int data = file.read();
                //Cuando data == -1 => EOF (End of File)
                while (data != -1)
                {
                    System.out.print((char)data);
                    data = file.read();
                }
            } catch (IOException e) {
                System.out.println("File cannot be read: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has been produced: " + e.getMessage());
        }*/

        //Leo el archivo de a fragmentos
        /*try {
            InputStream file = new FileInputStream("C:/Windows/System32/drivers/etc/protocol");
            try {
                byte data[] = new byte[5];
                int info = file.read(data);
                while (info != -1)
                {
                    System.out.print(data.toString());
                    info = file.read(data);
                }
            } catch (IOException e) {
                System.out.println("File cannot be read: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has been produced: " + e.getMessage());
        }*/

        //BufferedInputStream no trabaja con archivos, sino que va leyendo fragmentos en memoria y
        // los devuelve poco a poco. Es decir, no se accede a toda la info a la vez, ya que la va cargando
        // poco a poco.

        //Otro uso de InputStream
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        String a = scanner.next();
        String b = scanner.next();
        System.out.println("The entered numbers are: " + a + " & " + b);

        //Lo optimizo:
        boolean ok = false;
        do {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            try {
                int c = scanner1.nextInt();
                int d = scanner1.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Invalid numbers.");
            }
        }while (!ok);

        //Salida. Se hace con PrintStream
        System.out.println("One thing.");
        PrintStream info = new PrintStream("C:\\Users\\PC\\IdeaProjects\\OB\\JavaBásico\\10-Entrada-Salida\\copia.txt");
        info.println("Hola!");

        try {
            InputStream file = new FileInputStream("C:/Windows/System32/drivers/etc/protocol");
            BufferedInputStream bufferedFile = new BufferedInputStream(file);
            try {
                int data = bufferedFile.read();
                while (data != -1)
                {
                    System.out.print((char)data);
                    data = bufferedFile.read();
                }
            } catch (IOException e) {
                System.out.println("File cannot be read: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has been produced: " + e.getMessage());
        }
    }
}
