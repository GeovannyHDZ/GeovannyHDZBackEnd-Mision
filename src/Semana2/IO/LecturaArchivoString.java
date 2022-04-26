package Semana2.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaArchivoString {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/angelhernandezalegria/Downloads/magia.txt");

            int i = 0;
            while ((i= fis.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
