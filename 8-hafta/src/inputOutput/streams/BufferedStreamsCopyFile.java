package inputOutput.streams;

import java.io.*;

public class BufferedStreamsCopyFile {

    public static void main(String[] args) {

        var source = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/veriler.txt");
        var destination = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/destination.txt");

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {

            byte[] buffer = new byte[1024];
            int read;

            while ((read = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, read);
            }

            System.out.println("Dosya başarıyla kopyalandı.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
