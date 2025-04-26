package inputOutput.streams;

import java.io.*;

public class BufferedInputStreamMain {

    public static void main(String[] args) {

        File file = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/veriler.txt");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {

            int data;
            int counter = 0;

            while ((data = bis.read()) != -1){
                counter++;
            }

            System.out.println("Toplam okunan byte sayısı: " + counter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
