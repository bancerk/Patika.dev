import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        // CREATE

        //transaction (atomic)
//        transaction.begin();
//        Customer c1 = new Customer();
//        c1.setOnDate(LocalDate.now());
//        c1.setName("Patika");
//        c1.setMail("info@patika.dev");
//        c1.setGender(Customer.GENDER.FEMALE);
//        entityManager.persist(c1);
//        transaction.commit();
//
//
//        transaction.begin();
//        Customer customer = new Customer();
//        customer.setName("Mustafa");
//        customer.setMail("test@patika.dev");
//        customer.setGender(Customer.GENDER.MALE);
//        customer.setOnDate(LocalDate.now());
//        entityManager.persist(customer);
//        transaction.commit();
//
//        // FIND
//        Customer customer = entityManager.find(Customer.class, 1);
//        System.out.println(customer.toString());
//
//        // UPDATE
//        transaction.begin();
//        customer.setName("Update Test");
//        entityManager.persist(customer);
//        transaction.commit();
//
//        // DELETE
//        transaction.begin();
//        entityManager.remove(customer);
//        transaction.commit();


        // EXAMPLES

        transaction.begin();

//        // Code ekleme
//        Code code = new Code();
//        code.setGroup("11123");
//        code.setSerial("44456");
//        entityManager.persist(code);
//        System.out.println(code);
//
//        // Supplier ekleme
//        Supplier supplier = new Supplier();
//        supplier.setAddress("Adres");
//        supplier.setCompany("Patika");
//        supplier.setContact("5001231212");
//        supplier.setMail("info@patika.dev");
//        supplier.setPerson("Mustafa");
//        entityManager.persist(supplier);
//
//        // Category ekleme
//        Category category = new Category();
//        category.setName("Telefonlar");
//        entityManager.persist(category);
//
//        // Product ekleme
//        Product product = new Product();
//        product.setName("Iphone 15 Pro");
//        product.setPrice(1234);
//        product.setStock(100);
//        product.setCode(code);
//        product.setSupplier(supplier);
//        product.setCategory(category);
//        entityManager.persist(product);
//        System.out.println(product);
//
//
//        // Product 2 ekleme
//        Code code2 = new Code();
//        code2.setGroup("12345");
//        code2.setSerial("67890");
//        entityManager.persist(code2);
//
//        Supplier supplier2 = new Supplier();
//        supplier2.setAddress("Adres");
//        supplier2.setCompany("Patika");
//        supplier2.setContact("5001231212");
//        supplier2.setMail("cem@patika.dev");
//        supplier2.setPerson("Cem");
//        entityManager.persist(supplier2);
//
//        Product product2 = new Product();
//        product2.setName("Samsung Galaxy");
//        product2.setPrice(1234);
//        product2.setStock(100);
//        product2.setCode(code2);
//        product2.setSupplier(supplier2);
//        product.setCategory(category);
//        entityManager.persist(product2);
//        System.out.println(product2);
//
//        Product product = entityManager.find(Product.class, 1);
//        System.out.println(product.toString());
//
//        Code code = entityManager.find(Code.class, 1);
//        System.out.println(code.getProduct().getName());
//
//        Supplier supplier = entityManager.find(Supplier.class, 1);
//
//        for (Product product : supplier.getProductList()) {
//            System.out.println(product.toString());
//        }


        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
