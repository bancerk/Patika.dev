package practices;

public class UserAuthMain {

    public static void main(String[] args) {

        AuthService authService = new AuthService();

        try {
            authService.register(new User("patika@gmail.com","123123"));
            authService.register(new User("ali@gmail.com","123124"));
            authService.register(new User("ahmet@gmail.com","123125"));
            authService.register(new User("elif@gmail.com","123126"));
            authService.register(new User("ali@gmail.com","123124"));


        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        authService.login("elif@gmail.com","123126");

        authService.getAllUsers();

    }
}
