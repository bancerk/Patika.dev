package Odevler.MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int bonus;

    public Employee(String employeeName, int salary, int workHours, int hireYear) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary(int salary) {
        return this.salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }




    public void tax () {
        this.salary = getSalary(salary);
        if(salary < 1000){
            double tax = 0;
            System.out.println("Vergi: "+ tax);
        }else {
            double tax = 0.97;
            System.out.println("Vergi: "+ tax);
        }
    }

    public void bonus() {
        this.workHours = getWorkHours();
        this.salary = getSalary(salary);
        if (workHours > 40){
            bonus = (workHours-40)*30;
            System.out.println("Bonus: " + bonus);
        }
        System.out.println("Bonus: " + bonus);
    }

    public void raiseSalary() {
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
