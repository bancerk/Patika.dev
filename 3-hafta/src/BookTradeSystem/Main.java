package BookTradeSystem;

import BookTradeSystem.Model.Author;
import BookTradeSystem.Model.Enums.Gender;
import BookTradeSystem.Model.Product;
import BookTradeSystem.Model.User;
import BookTradeSystem.Service.AuthorService;
import BookTradeSystem.Service.OrderService;
import BookTradeSystem.Service.ProductService;
import BookTradeSystem.Service.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductService();
        addProduct(productService);
        UserService userService = new UserService();

        //-----------------------

        OrderService orderService = new OrderService();

        //-----------------------

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("");
            System.out.println("1. Müşteri kaydı");
            System.out.println("2. Sipariş ver");
            System.out.println("3. Siparişlerimi görüntüle");
            System.out.println("4. Ürünleri görüntüle");
            System.out.println("5. Çıkış");
            System.out.println("");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Müşteri ismini girin: ");
                    String name = scanner.nextLine();
                    System.out.println("Müşteri mail adresi girin: ");
                    String email = scanner.nextLine();
                    System.out.println("Müşteri şifresini girin: ");
                    String password = scanner.nextLine();
                    userService.create(name,email,password);
                    break;

                case 2:
                    System.out.println("Müşteri email adresini girin: ");
                    String givenEmail = scanner.nextLine();
                    User foundUser = userService.findUserByEmail(givenEmail);
                    System.out.println("Ürün ismini girin: ");
                    String productName = scanner.nextLine();
                    Product foundProduct = productService.findProductByName(productName);
                    orderService.create(List.of(foundProduct),foundUser);
                    break;

                case 3:
                    System.out.println("Müşteri email adresini girin: ");
                    String givenEmail1 = scanner.nextLine();
                    User foundUser1 = userService.findUserByEmail(givenEmail1);
                    orderService.foundOrders(foundUser1);
                    break;

                case 4:
                    System.out.println("-----Ürün Listesi-----");
                    productService.list();
                    break;

                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz bir işlem seçtiniz!");
            }
        }
    }

    private static void addProduct(ProductService productService) {
        AuthorService authorService = new AuthorService();
        authorService.create("Patika","Patika", Gender.WOMAN);
        Author author = authorService.findAuthor("Patika");
        Author paulo = authorService.create("Paulo", "-", Gender.MAN);

        productService.create("Java Programlama",155,author, LocalDate.of(2022,01,01));
        productService.create("Java Programlama 2",255,author, LocalDate.of(2023,01,01));
        productService.create("Java İleri Programlama",355,author, LocalDate.of(2024,01,01));
        productService.create("Aylık Patika.dev Teknoloji Dergisi",99.9);
        productService.create("Simyacı",299,paulo,LocalDate.of(2005,03,05));
    }
}
