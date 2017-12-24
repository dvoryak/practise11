package practise11.dao;

import practise11.dao.pool.ConnectionPool;
import practise11.model.entity.Entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDao <T extends Entity> {
    private String tableName;

    public AbstractDao(String tableName) {
        this.tableName = tableName;
    }

    protected List<T> findAll() {
        try(Connection connection = ConnectionPool.getConnection()) {
            List<T> out = new ArrayList<>();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);
            while(resultSet.next()) {
                out.add(getEntity(resultSet));
            }
            statement.close();
            return out;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    };


    protected boolean add(T e) {
        try(Connection connection = ConnectionPool.getConnection()) {
            connection.setAutoCommit(false);
            StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " VALUES(null");
            for(int i = 0; i < fieldCount(); i++)
                sql.append(",?");
            sql.append(")");
            PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
            setEntity(e,preparedStatement);
            preparedStatement.execute();
            preparedStatement.close();
            connection.commit();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    protected boolean remove(int id) {
        try(Connection connection = ConnectionPool.getConnection()) {
            connection.setAutoCommit(false);
            String sql = "DELETE FROM " + tableName + " WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            preparedStatement.close();
            connection.commit();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public abstract T getEntity(ResultSet resultSet);

    public abstract void setEntity(T entity, PreparedStatement statement);

    public abstract int fieldCount();
}
