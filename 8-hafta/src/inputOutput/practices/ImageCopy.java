package inputOutput.practices;

import java.io.*;

public class ImageCopy {

    public static void main(String[] args) throws IOException {

        var originalFilePath = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/patika_logo.png");
        var copyFilePath = new File("/home/canberk/IdeaProjects/Patika.dev/8-hafta/src/resources/patika_logo-copy.png");

        try (

                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFilePath))
        ) {
            byte[] buffer = new byte[1024];
            int read;

            while ((read = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, read);
            }
            System.out.println("Resim başarıyla kopyalandı.");
        }
    }
}
