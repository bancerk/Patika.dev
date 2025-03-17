package Odevler.MaasHesaplayici;

public class Employee {
    String employeeName;
    int salary;
    int workHours;
    int hireYear;
    int bonus;

    public Employee(String employeeName, int salary, int workHours, int hireYear) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax () {

        double tax;
        double taxed;

        if(salary < 1000){
            tax = 0;
            taxed = tax;
        }else {
            tax = 0.97;
            taxed = salary - (salary*tax);
        }
        return taxed;
    }


    public int bonus() {

        if (workHours > 40){
            bonus = (workHours-40)*30;
        }
        return bonus;
    }



    public int raiseSalary() {

        int raise;

        int raisedSalary;

        int hiredDuration = 2021 - hireYear;

        if (hiredDuration >19){
            raise = salary * 115/100;
            raisedSalary = raise - salary;
        } else if (hiredDuration >9 && hiredDuration <20) {
            raise = salary * 110/100;
            raisedSalary = raise - salary;
        } else if (hiredDuration < 10) {
            raise = salary * 105/100;
            raisedSalary = raise - salary;
        } else {
            raise = salary;
            raisedSalary = raise - salary;
        }
        return raisedSalary;
    }
}
