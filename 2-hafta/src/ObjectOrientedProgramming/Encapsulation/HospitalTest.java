package ObjectOrientedProgramming.Encapsulation;

public class HospitalTest {

    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.identityNumber = "123";
        /*  11 hane gereksinimi geçersiz çünkü bu şekilde ulaştığımızda kapsüllenmediğinden
        kapsül içerisine giriş yaptığımız kurallar uygulanmıyor.
         */
        patient.setName("Ahmet");
        patient.setSurname("Ak");
        patient.setAge(33);


        Patient patient1 = new Patient("1234");
        patient1.setName("Ayşe");
        patient1.setSurname("Sarı");


        Patient patient2 = new Patient("12345678901");
        patient2.setName("Fatma");
        patient2.setSurname("Beyaz");




    }
}
