package Odevler.MaasHesaplayici;

public class bonus extends Employee {


    public bonus(String name, int salary, int workHours, int hireYear) {
        super(name, salary, workHours, hireYear);
        this.workHours = getWorkHours();
        this.salary = getSalary(salary);
        if (workHours < 40){
            this.salary = setSalary(salary);
        }else {
            this.salary = setSalary(salary+((workHours-40)*30));
        }
    }
}
