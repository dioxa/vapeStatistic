package utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private Connection connection = null;

    public DBConnection() {
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "655776");
            properties.put("serverTimezone", "UTC");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vape", properties);

            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
    }

    public Connection getConnection() {
        return connection;
    }
}
