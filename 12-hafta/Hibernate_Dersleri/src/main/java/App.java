import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // JPA'dan farklı olarak SQL database'ini Entity Manager oluşturarak değil, Entityleri kendi içerisinde yöneten session'ları kullanacağız

        // Session
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        // CRUD - Create - Read - Update - Delete

        session.beginTransaction();

        try {

            Customer customer = new Customer();

            // CREATE
//            customer.setName("Hibernate test");
//            customer.setGender(Customer.GENDER.FEMALE);
//            customer.setMail("test@patika.dev");
//            customer.setOnDate(LocalDate.now());
//            session.persist(customer);

            // READ
//            customer = session.get(Customer.class,1);
//            System.out.println(customer);

            // UPDATE
//            customer = session.get(Customer.class,1);
//            customer.setName("Değişti");
//            session.persist(customer);

            // DELETE
//            customer = session.get(Customer.class,1);
//            session.remove(customer);

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
