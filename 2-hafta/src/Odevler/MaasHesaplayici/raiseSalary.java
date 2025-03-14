package Odevler.MaasHesaplayici;

public class raiseSalary extends Employee {

    public raiseSalary(String name, int salary, int workHours, int hireYear) {
        super(name, salary, workHours, hireYear);
        this.hireYear = getHireYear();
        this.salary = getSalary(salary);

        int hiredDuration = 2021 - hireYear;

        if (hiredDuration >19){
            salary = salary * 115/100;
        } else if (hiredDuration >9 && hiredDuration <20) {
            salary = salary * 110/100;
        } else if (hiredDuration < 10) {
            salary = salary * 105/100;
        }
    }
}
