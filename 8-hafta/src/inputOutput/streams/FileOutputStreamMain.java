package inputOutput.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {

    public static void main(String[] args) throws IOException {

        File file = new File("/home/canberk/Desktop/deneme-klasör/output.txt");

        System.out.println("Exists: " + file.exists());
        System.out.println("Size: " + file.length());

        FileOutputStream fos = new FileOutputStream(file);

        String data = "Merhaba io stream. Patika'dan selamlar!";

        fos.write(data.getBytes());
        fos.close();

    }
}
