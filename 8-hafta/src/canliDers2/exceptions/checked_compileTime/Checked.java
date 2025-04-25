package canliDers2.exceptions.checked_compileTime;

import java.io.FileInputStream;
import java.io.IOException;

public class Checked {
    public static void main(String[] args) throws IOException {
        //read1();
        read2();
    }

    //throws
    public static void read1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\mstgd\\IdeaProjects\\cohort8_liveClass\\src\\canliDers2\\exceptions\\checked_compileTime\\file.txt");

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }

    }

    //try-catch
    public static void read2() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\mstgd\\IdeaProjects\\cohort8_liveClass\\src\\canliDers2\\exceptions\\checked_compileTime\\file.txt");

            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (IOException e) {
            System.out.println("exception");
        }

    }
}
