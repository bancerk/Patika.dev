import java.sql.*;

public class JdbcMain {

    public static void main(String[] args) throws SQLException {

//        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/canberk";

        Connection connection = DriverManager.getConnection(url);

        System.out.println("DB bağlantı gerçekleşti");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

        while (resultSet.next()){
            int id = resultSet.getInt("employee_id");
            String name = resultSet.getString("first_name");
            System.out.println(id + " - " + name);
        }

    }
}
