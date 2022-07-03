package jdbsdemo;

import java.sql.*;

public class JDBSDemo {

    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost:****/employees_database/employees_database";
        try {
            //Establish Connection Object
            Connection conn = DriverManager.getConnection(url, "root", "123456");

            // create a statement object to send to the database
            Statement statement = conn.createStatement();

            //Execute the statement object
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            //Process the result
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}