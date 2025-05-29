import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

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

            // Adding Categories

            Category category1 = new Category();
            category1.setName("Epic fantasy");
            category1.setDescription("Fantasy with large scope and high stakes");

            Category category2 = new Category();
            category2.setName("Science Fiction");
            category2.setDescription("Futuristic technology and space exploration");

            Category category3 = new Category();
            category3.setName("Historical Fiction");
            category3.setDescription("Stories set in historical periods");

            Category category4 = new Category();
            category4.setName("Mystery");
            category4.setDescription("Suspenseful stories involving solving crimes");

            Category category5 = new Category();
            category5.setName("Non-Fiction");
            category5.setDescription("Informative, factual books");




            // Adding Authors

            Author author1 = new Author();
            author1.setName("Terry Goodkind");
            author1.setCountry("USA");
            author1.setBirthDate(Date.valueOf("1948-01-11"));

            Author author2 = new Author();
            author2.setName("Isaac Asimov");
            author2.setCountry("USA");
            author2.setBirthDate(Date.valueOf("1920-01-02"));

            Author author3 = new Author();
            author3.setName("Ken Follett");
            author3.setCountry("UK");
            author3.setBirthDate(Date.valueOf("1949-06-05"));

            Author author4 = new Author();
            author4.setName("Agatha Christie");
            author4.setCountry("UK");
            author4.setBirthDate(Date.valueOf("1890-09-15"));

            Author author5 = new Author();
            author5.setName("Malcolm Gladwell");
            author5.setCountry("Canada");
            author5.setBirthDate(Date.valueOf("1963-09-03"));




            // Adding Publishers

            Publisher publisher1 = new Publisher();
            publisher1.setName("Tor Publishing Group");
            publisher1.setEstablishmentYear(Date.valueOf("1980-04-02"));
            publisher1.setAddress("https://us.macmillan.com/torpublishinggroup/");

            Publisher publisher2 = new Publisher();
            publisher2.setName("Spectra");
            publisher2.setEstablishmentYear(Date.valueOf("1970-06-15"));
            publisher2.setAddress("https://www.penguinrandomhouse.com/");

            Publisher publisher3 = new Publisher();
            publisher3.setName("Penguin Books");
            publisher3.setEstablishmentYear(Date.valueOf("1935-07-30"));
            publisher3.setAddress("https://www.penguin.co.uk/");

            Publisher publisher4 = new Publisher();
            publisher4.setName("HarperCollins");
            publisher4.setEstablishmentYear(Date.valueOf("1989-08-01"));
            publisher4.setAddress("https://www.harpercollins.com/");

            Publisher publisher5 = new Publisher();
            publisher5.setName("Random House");
            publisher5.setEstablishmentYear(Date.valueOf("1927-07-01"));
            publisher5.setAddress("https://www.penguinrandomhouse.com/");




            //  Adding Books

            Book book1 = new Book();
            book1.setName("Wizard's First Rule");
            book1.setStock(10);
            book1.setPublicationYear(Date.valueOf("1994-08-15"));
            book1.setAuthor(author1);
            author1.getBookList().add(book1);
            book1.setPublisher(publisher1);
            publisher1.getBookList().add(book1);
            book1.getCategoryList().add(category1);
            category1.getBookList().add(book1);

            Book book2 = new Book();
            book2.setName("Foundation");
            book2.setStock(7);
            book2.setPublicationYear(Date.valueOf("1951-06-01"));
            book2.setAuthor(author2);
            author2.getBookList().add(book2);
            book2.setPublisher(publisher2);
            publisher2.getBookList().add(book2);
            book2.getCategoryList().add(category2);
            category2.getBookList().add(book2);

            Book book3 = new Book();
            book3.setName("The Pillars of the Earth");
            book3.setStock(5);
            book3.setPublicationYear(Date.valueOf("1989-07-01"));
            book3.setAuthor(author3);
            author3.getBookList().add(book3);
            book3.setPublisher(publisher3);
            publisher3.getBookList().add(book3);
            book3.getCategoryList().add(category3);
            category3.getBookList().add(book3);

            Book book4 = new Book();
            book4.setName("Murder on the Orient Express");
            book4.setStock(12);
            book4.setPublicationYear(Date.valueOf("1934-01-01"));
            book4.setAuthor(author4);
            author4.getBookList().add(book4);
            book4.setPublisher(publisher4);
            publisher4.getBookList().add(book4);
            book4.getCategoryList().add(category4);
            category4.getBookList().add(book4);

            Book book5 = new Book();
            book5.setName("Outliers");
            book5.setStock(8);
            book5.setPublicationYear(Date.valueOf("2008-11-18"));
            book5.setAuthor(author5);
            author5.getBookList().add(book5);
            book5.setPublisher(publisher5);
            publisher5.getBookList().add(book5);
            book5.getCategoryList().add(category5);
            category5.getBookList().add(book5);




            // Persistance

            session.persist(category1);
            session.persist(category2);
            session.persist(category3);
            session.persist(category4);
            session.persist(category5);

            session.persist(author1);
            session.persist(author2);
            session.persist(author3);
            session.persist(author4);
            session.persist(author5);

            session.persist(publisher1);
            session.persist(publisher2);
            session.persist(publisher3);
            session.persist(publisher4);
            session.persist(publisher5);

            session.persist(book1);
            session.persist(book2);
            session.persist(book3);
            session.persist(book4);
            session.persist(book5);


            // Borrowing test
            BookBorrowing borrowing1 = new BookBorrowing();
            borrowing1.setBorrowerName("Alice Johnson");
            borrowing1.setBorrowingDate(Date.valueOf("2025-05-29"));

            // Assume book1 and book2 already exist and were persisted above
            borrowing1.getBookList().add(book1);
            borrowing1.getBookList().add(book2);

            // Set the relationship on the Book side
            book1.setBorrowing(borrowing1);
            book2.setBorrowing(borrowing1);

            session.persist(borrowing1);


            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
