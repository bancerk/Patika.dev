package inputOutput.reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

    public static void main(String[] args) throws IOException {

        String content = "Merhaba FileWriter!";

        try (FileWriter writer = new FileWriter("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/fileWriter.txt")) {

            writer.write("Merhaba Java Dünyası! \n");
            writer.write(content);
            System.out.println("Dosyaya veri yazıldı");

            // dosyayı her çalıştığında overwrite ediyor

            // append için writer.append() veya FileWriter(String fileName, boolean append){}
        }
    }
}
