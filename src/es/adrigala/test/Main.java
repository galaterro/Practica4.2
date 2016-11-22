package es.adrigala.test;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            RandomAccessFile ra = new RandomAccessFile(new File("empleados.txt"), "rw");
            ra.seek(-28 + (28 * Integer.parseInt(args[0])));
            for (int i = 0; i < 3; i++) {
               String test = ra.readLine();
                System.out.println(test);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo de empleados");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
