package Odevler.MaasHesaplayici;

import java.util.Scanner;

public class MaasHesaplayici {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışan adını giriniz: ");
        String employeeName = scanner.nextLine();

        System.out.print("Çalışan maaşını giriniz: ");
        int salary = scanner.nextInt();

        System.out.print("Çalışan çalışma saatlerini giriniz: ");
        int workHours = scanner.nextInt();

        System.out.print("Çalışan işe başlangıç yılını giriniz: ");
        int hireYear = scanner.nextInt();


        Employee employee = new Employee(employeeName,salary,workHours,hireYear);

        System.out.println("Adı:" + employeeName);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + employee.tax());
        System.out.println("Bonus: " + employee.bonus());
        System.out.println("Maaş Artışı: " + employee.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (employee.salary + employee.bonus() - employee.tax()));
        System.out.println("Toplam maaş: " + (employee.salary + employee.raiseSalary() + employee.bonus() - employee.tax()));

    }
}
