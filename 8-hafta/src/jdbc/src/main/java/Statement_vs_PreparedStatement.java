import java.sql.*;

public class Statement_vs_PreparedStatement {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/canberk";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);

            System.out.println("DB bağlantı gerçekleşti");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            //Statements are SQL Injection vulnerable
            //PreparedStatements are not

            String findEmployee = "SELECT * FROM employees WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(findEmployee);
            preparedStatement.setInt(1, 2);

            boolean execute = preparedStatement.execute(); // SELECT-INSERT-UPDATE-DELETE için kullanılabilir
            ResultSet rs = preparedStatement.executeQuery(); // SELECT only
            int i = preparedStatement.executeUpdate(); // INSERT-UPDATE-DELETE gibi veri üstünde işlem yapmak için


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
