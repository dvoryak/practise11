package practise11.dao.impl;

import practise11.dao.AbstractDao;
import practise11.dao.Constant;
import practise11.dao.TaskDao;
import practise11.model.entity.Employee;
import practise11.model.entity.Task;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class TaskDaoImpl extends AbstractDao<Task> implements TaskDao {

    public TaskDaoImpl() {
        super(Constant.TASK_TABLE);
    }

    @Override
    public List<Task> getAllTask() {
        return findAll();
    }

    @Override
    public boolean addTaskForEmployee(Task task) {
        return add(task);
    }

    @Override
    public List<Task> getAllTaskForEmployee(int employeeID) {
        return getAllTask()
                .stream()
                .filter(task -> task.getEmployeeID() == employeeID)
                .collect(Collectors.toList());
    }

    @Override
    public boolean removeEmployee(int employeeID) {
        return false;
    }


    @Override
    public Task getEntity(ResultSet resultSet) {
        Task task = new Task();
        try {
            task.setTaskID(resultSet.getInt("id"));
            task.setTextTask(resultSet.getString("text"));
            task.setEmployeeID(resultSet.getInt("employee_id"));
            return task;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void setEntity(Task entity, PreparedStatement statement) {
        try {
            statement.setString(1,entity.getTextTask());
            statement.setInt(2,entity.getEmployeeID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int fieldCount() {
        return 2;
    }
}
