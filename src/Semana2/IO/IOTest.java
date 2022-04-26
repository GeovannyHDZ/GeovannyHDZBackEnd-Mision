package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/angelhernandezalegria/Downloads/hola.txt");
            fos.write(65);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
