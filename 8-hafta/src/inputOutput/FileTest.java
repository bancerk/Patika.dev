package inputOutput;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

    public static void main(String[] args) {

        System.out.println("file.separator");

        Path path = Paths.get("java-dersleri/java1.txt");
        System.out.println("Dosya yolu: " + path);

        Path path1 = Paths.get("data/ornek.txt");
        System.out.println("Absolute path: " + path1.toAbsolutePath());

        System.out.println("Absolute path: " + path.toAbsolutePath());

        // Paths methodu Dosya/Klasör oluşturmaz

        // Oluşturmak için File methodu

        File directory = new File("yeni klasör");
        if (!directory.exists()) {
            boolean isCreated = directory.mkdir();
            System.out.println("Klasör oluşturuldu mu?: " + isCreated);
            System.out.println("Absolute Path: " + directory.getAbsolutePath());
        }

        System.out.println("--------------------------------------");

        var file = new File("/home/canberk/Desktop/deneme-klasör/test.txt");

        if (file.exists()){
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Klasör mü?: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
        }

        if (file.isFile()){
            System.out.println("Size: " + file.length());
            System.out.println("Son değişiklik tarihi: " + file.lastModified());
        }else {
            for (File subfile : file.listFiles()){
                System.out.println(subfile.getName());
            }
        }
    }
}
