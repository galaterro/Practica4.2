package es.adrigala.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
                System.out.println("\n");

            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado ese id de empleado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
