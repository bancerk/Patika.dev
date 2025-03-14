package Odevler.MaasHesaplayici;

public class tax extends Employee {

    public tax (String name, int salary, int workHours, int hireYear) {
        super(name, salary, workHours, hireYear);
        this.salary = getSalary(salary);
        if(salary < 1000){
            setSalary(salary);
        }else {
            System.out.println("Çalışan maaşı (before tax): " + salary);
            setSalary(salary*97/100);
            System.out.println("Çalışan maaşı (after tax): " + salary);
        }
    }
}
