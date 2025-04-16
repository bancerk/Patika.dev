package practices;

import java.util.ArrayList;
import java.util.List;

public class AuthService {

    private List<User> registeredUsers = new ArrayList<>();

    public void register(User user) throws UserAlreadyExistsException {
        boolean exists = registeredUsers.stream()
                .anyMatch(registeredUser -> registeredUser.getEmail().equalsIgnoreCase(user.getEmail()));

        if (exists) {
            throw new UserAlreadyExistsException(ExceptionMessages.USER_ALREADY_EXIST);
        }

        registeredUsers.add(user);
        System.out.println("Kullanıcı başarılı olarak kaydedildi. Email: " + user.getEmail());

    }

    public void getAllUsers(){
        registeredUsers.forEach(System.out::println);
    }

    public void login(String email,String password){
        User foundUser = registeredUsers.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(ExceptionMessages.USER_NOT_FOUND));

        System.out.println("Giriş başarılı. Email: " + foundUser.getEmail());
    }
}
