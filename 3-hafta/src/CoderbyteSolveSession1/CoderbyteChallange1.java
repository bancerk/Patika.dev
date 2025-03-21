package CoderbyteSolveSession1;

import java.util.Scanner;

public class CoderbyteChallange1 {

    public static String LetterCountI(String sentence){

        String[] words = sentence.split(" ");

        int maxLetterCount = 1;

        String wordWithMostRepeatedLetter = "";

        for (String word : words){
            char[] characters = word.toCharArray();
            for (char c : characters){
                int letterCount = word.length() - word.replace(String.valueOf(c),"").length(); // 5 - 4 = 1

                if (letterCount > maxLetterCount){
                    maxLetterCount = letterCount;
                    wordWithMostRepeatedLetter = word;
                }
            }
        }

        if (maxLetterCount > 1){
            return wordWithMostRepeatedLetter;
        }

        return "-1";
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(LetterCountI(s.nextLine()));
        s.close();
    }

}
