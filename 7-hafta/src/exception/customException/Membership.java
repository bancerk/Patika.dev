package exception.customException;

public class Membership {

    public void register(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("\n üyelik için en az 18 yaşında olmalısınız");
        }
        System.out.println("üyelik başarılı olarak oluşturuldu");

    }
}
