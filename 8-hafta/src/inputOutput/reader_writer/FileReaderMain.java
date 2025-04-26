package inputOutput.reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) throws IOException {

        var file = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/output.txt");

        try (FileReader reader = new FileReader(file)) {

            int character;

            while ((character=reader.read()) != -1){
                System.out.print((char) character);
            }
        }
    }
}
