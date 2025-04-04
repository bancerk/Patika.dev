package switchCase;

public class SwitchCaseMain3 {

    public static void main(String[] args) {
        
        int grade = 25;

        String letterGrade = switch (grade / 10) {
            case 10,9 -> "A";
            case 8 -> "B";
            case 6 -> "C";
            case 4,5 -> "D";
            default -> "F";
        };
            System.out.println("Harf notu: " + letterGrade);
        }
    }
