package canliDers.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityRunner {
    public static void main(String[] args) {
        University u01 = new University("odtu","math",1000,75);
        University u02 = new University("a","eng",900,88);
        University u03 = new University("b","tur",800,65);
        University u04 = new University("v","math",700,90);
        University u05 = new University("d","art",650,48);
        University u06 = new University("e","computer",1200,55);

        List<University> unv = new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05,u06));

        System.out.println("task01 : "+ Stream04.university1(unv));
        System.out.println("task02 : "+ Stream04.university2(unv));

    }
}
