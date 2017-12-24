package practise11.dao;

import practise11.model.entity.Employee;
import practise11.model.entity.Task;

import java.util.List;

public interface TaskDao {

    List<Task> getAllTask();

    boolean addTaskForEmployee(Task task);

    List<Task> getAllTaskForEmployee(int employeeID);

    boolean removeEmployee(int employeeID);
}
