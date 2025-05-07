import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/canberk";

        try (Connection connection = DriverManager.getConnection(url)){
            CallableStatement callableStatement = connection.prepareCall("CALL add_employee(?,?,?)");
            System.out.println("DB bağlantı gerçekleşti");
            callableStatement.setInt(1,7);
            callableStatement.setString(2,"Hakan");
            callableStatement.setInt(3,2);
            callableStatement.execute();
            System.out.println("Çalışan kaydedildi");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}

/*
CREATE OR REPLACE PROCEDURE add_employee(emp_id INT,name TEXT,dept_id INT)
LANGUAGE plpgsql
AS $$
BEGIN
INSERT INTO employees(employee_id, first_name,department_id,hire_date)
VALUES (emp_id,name,dept_id,now());
END;
$$;*/
