package odevler.maasHesaplayici;

public class Employee {
    // Çalışan bilgileri
    String employeeName; // Çalışanın adı
    int salary;          // Çalışanın maaşı
    int workHours;       // Haftalık çalışma saati
    int hireYear;        // İşe başlama yılı
    int bonus;           // Hesaplanacak bonus tutarı

    // Yapıcı (constructor) metot: Çalışan bilgilerini alır
    public Employee(String employeeName, int salary, int workHours, int hireYear) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax () {
        double tax;   // Vergi oranı
        double taxed; // Maaştan kesilecek vergi tutarı

        // 1000 TL'nin altındaki maaşlardan vergi alınmaz
        if(salary < 1000){
            tax = 0;
            taxed = tax;
        } else {
            // Maaşın %3'ü kadar vergi alınır (0.97 ile çarparak kalan hesaplanıyor)
            tax = 0.97;
            taxed = salary - (salary * tax); // Ödenen vergi miktarı
        }
        return taxed;
    }

    // Bonus hesaplama metodu
    public int bonus() {
        // Haftalık 40 saatin üzerindeki her saat için 30 TL bonus
        if (workHours > 40){
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    // Maaş artışı hesaplama metodu
    public int raiseSalary() {
        int raise;          // Zamlı maaş
        int raisedSalary;   // Zam miktarı
        int hiredDuration = 2021 - hireYear; // Çalışanın toplam hizmet süresi

        // Hizmet yılına göre zam oranları belirleniyor
        if (hiredDuration > 19){
            raise = salary * 115 / 100; // %15 zam
            raisedSalary = raise - salary;
        } else if (hiredDuration > 9 && hiredDuration < 20) {
            raise = salary * 110 / 100; // %10 zam
            raisedSalary = raise - salary;
        } else if (hiredDuration < 10) {
            raise = salary * 105 / 100; // %5 zam
            raisedSalary = raise - salary;
        } else {
            raisedSalary = salary; // Teorik olarak 0 olur
        }
        return raisedSalary;
    }
}
