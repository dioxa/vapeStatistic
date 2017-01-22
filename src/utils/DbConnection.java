package utils;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnection {

    private ComboPooledDataSource cpds = null;

    public DbConnection() throws PropertyVetoException {
        cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/vape?useSSL=false&serverTimezone=UTC");
        cpds.setUser("root");
        cpds.setPassword("655776");

        cpds.setAcquireIncrement(2);
        cpds.setMinPoolSize(2);
        cpds.setMaxPoolSize(4);
        cpds.setMaxStatements(5);
    }

    public Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
}
