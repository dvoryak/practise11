package practise11.service;

import practise11.model.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTask();

    boolean addTaskForEmployee(Task task);

    List<Task> getAllTaskForEmployee(int employeeID);

    boolean removeEmployee(int employeeID);

}
