package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/angelhernandezalegria/Downloads/magia.txt");
            String s = "Magia!!!!";
            byte b[]= s.getBytes();
            fos.write(b);
            fos.close(); //Siempre se debe de cerrar con .close()
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
