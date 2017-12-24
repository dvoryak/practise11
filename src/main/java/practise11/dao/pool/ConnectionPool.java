package practise11.dao.pool;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionPool {
    private static PooledConnection dataSource;
    static {
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("pool");
            MysqlConnectionPoolDataSource poolDataSource = new MysqlConnectionPoolDataSource();
            poolDataSource.setURL(resourceBundle.getString("url"));
            poolDataSource.setUser(resourceBundle.getString("name"));
            poolDataSource.setPassword(resourceBundle.getString("password"));
            dataSource = poolDataSource.getPooledConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ConnectionPool() {}

    public static Connection getConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        return connection;
    }

}
