package canliDers2.exceptions.unchecked_runtime;

import java.util.Scanner;

public class UnCheckedException02 {
    public static void main(String[] args) {
        //throw
        System.out.println("uygulama çalışmaya başladı");
        Scanner scan = new Scanner(System.in);
        System.out.println("yaş giriniz");
        int age = scan.nextInt();
        if (age < 18) {
            throw new RuntimeException("yaş 18den büyük olmalı");
            //System.err.println("yaş 18den büyük olmalı");
        }
        System.out.println("uygulama çalışmaya devam ediyor");
    }
}
