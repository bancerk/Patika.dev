package dao;

import model.Customer;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class CustomerDao {

    private final String saveScript = "INSERT INTO customer(name,email,password) VALUES(?,?,?);";

    public void save(Customer customer){
        try {
            // Load the properties file from classpath
            Properties properties = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            if (input == null) {
                throw new RuntimeException("config.properties file not found in resources folder");
            }
            properties.load(input);

            // Read the db connection details from properties file
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // Connect to the database
            Connection connection = DriverManager.getConnection(url, user, password);

            // Prepare and execute the insert statement
            PreparedStatement ps = connection.prepareStatement(saveScript);
            ps.setString(1, customer.getCustomerName());
            ps.setString(2, customer.getCustomerEmail());
            ps.setString(3, customer.getCustomerPassword());

            ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}