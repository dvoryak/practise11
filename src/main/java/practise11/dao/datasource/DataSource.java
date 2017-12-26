package practise11.dao.datasource;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class DataSource {

    private DataSource() {}

    public static Connection getConnection() throws SQLException{
        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        Connection connection = DriverManager.getConnection(resourceBundle.getString("url"), resourceBundle.getString("name"),
                resourceBundle.getString("password"));
        return connection;
    }

}
