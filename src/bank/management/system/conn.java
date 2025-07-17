package bank.management.system;

import java.sql.*;

public class conn {
    Connection connection;
    Statement statement;

    public conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Prince@1603");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
