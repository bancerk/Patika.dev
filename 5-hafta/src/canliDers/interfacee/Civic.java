package canliDers.interfacee;

public class  Civic implements Engine,Ac,Hood{
    @Override
    public void gas() {
        System.out.println("Civic gas metot çalıştı..");
    }

    @Override
    public void digital() {
        System.out.println("Civic digital metot çalıştı..");
    }

    @Override
    public void steel() {
        System.out.println("Civic steel metot çalıştı..");
    }
}
