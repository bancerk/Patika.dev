package ObjectOrientedProgramming.Encapsulation;

public class User {

    private String username;
    private String password;


    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        if(username.length() >= 3 && username.length() <= 15){
            this.username = username;
        }else {
            System.out.println("Kullanıcı ismi 3 haneden küçük, 15 haneden büyük olamaz!");
        }
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        if(password.length() >=  8 && password.length() <= 11){
            this.password = password;
        }else {
            System.out.println("Şifre en az 8 en fazla 11 haneli olabilir!");
        }
    }
}
