package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

public class CopyFiles {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:/Windows/System32/drivers/etc/protocol");
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out =new PrintStream("C:/Users/PC/IdeaProjects/OB/JavaBásico/10-Entrada-Salida/CopiaProtocolo.txt");
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
