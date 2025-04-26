package inputOutput.reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderMain {

    public static void main(String[] args) throws IOException {

        var file = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/source2.txt");


        try (
                FileReader reader = new FileReader(file);
                FileWriter writer = new FileWriter("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/destination2.txt")
        ) {
            int character;

            while ((character = reader.read()) != -1){
                writer.write(character);
            }
            System.out.println("Dosya başarıyla kopyalandı.");
        }

    }
}
