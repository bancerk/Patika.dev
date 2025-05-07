import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/example";
        String user = "example";
        String password = "example";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to database");

            connection.setAutoCommit(false); // manual commit control

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE accounts SET balance=balance-100 WHERE id=?;");
            preparedStatement.setInt(1, 1);
            int row = preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE accountz SET balance=balance+100 WHERE id=?;");
            preparedStatement1.setInt(1, 2);
            int row2 = preparedStatement1.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback(); // hata oluşursa işlemleri geri al
                System.out.println("An error occured. Transaction rolled back");
                e.getMessage();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
