package inputOutput.streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {

    public static void main(String[] args) {

        String content = """
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                """;


        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/output.txt"))) {

            bos.write(content.getBytes());
            bos.flush(); // Buffer'daki veriyi diske yazar
            System.out.println("Dosyaya yazıldı.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
