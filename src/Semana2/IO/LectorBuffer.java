package Semana2.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LectorBuffer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/angelhernandezalegria/Downloads/magia.txt");
        BufferedInputStream bin = new BufferedInputStream(fis);

        int i;
        while ((i=bin.read()) != -1){
            System.out.println((char) i);
        }
        bin.close();
        fis.close();

    }
}
