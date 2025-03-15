package Odevler.MaasHesaplayici;

import java.util.Scanner;

public class MaasHesaplayici {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışan adını giriniz: ");
        String employeeName = scanner.nextLine();
        System.out.println("Adı: " + employeeName );

        System.out.print("Çalışan maaşını giriniz: ");
        int salary = scanner.nextInt();
        System.out.println("Çalışan maaşı: " + salary);

        System.out.print("Çalışan çalışma saatlerini giriniz: ");
        int workHours = scanner.nextInt();
        System.out.println("Çalışan çalışma saatleri: " + workHours);

        System.out.print("Çalışan işe başlangıç yılını giriniz: ");
        int hireYear = scanner.nextInt();
        System.out.println("Çalışan işe başlangıç yılı: " + hireYear);


        Employee employee = new Employee(employeeName,salary,workHours,hireYear);

        employee.tax();
        employee.bonus();
        employee.raiseSalary();

        System.out.println("Vergi ve Bonuslar ile birlikte maaş: ");

        System.out.println("Toplam maaş: ");



    }
}
