package Semana2.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("/Users/angelhernandezalegria/Downloads/magic.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            String s = "jbhjsfhvdafvkdjbj \n jbfsdhjvgvadfsbf fdhsjvhvafsd";

            byte[]b = s.getBytes();

            bout.write(b);
            bout.flush();

            bout.close();
            fos.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
