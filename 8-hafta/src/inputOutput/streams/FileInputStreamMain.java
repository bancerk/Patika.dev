package inputOutput.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamMain {

    public static void main(String[] args) throws IOException {

        File file = new File("veriler.txt");
        System.out.println("Size: " + file.length());

        System.out.println(file.getAbsolutePath());

        // Bir byte = 8 bit -> 10101010

        FileInputStream fis = new FileInputStream(file);

        int bayt;

        while ((bayt = fis.read()) != -1) {
            System.out.println(bayt + " - " + (char) bayt); // byte veriyi char'a çeviriyoruz
        }
    }
}
