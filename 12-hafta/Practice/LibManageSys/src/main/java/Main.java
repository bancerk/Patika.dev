import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Publisher.class)
                .addAnnotatedClass(BookBorrowing.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        try (session) {
            session.beginTransaction();



            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
