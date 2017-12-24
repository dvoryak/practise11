package practise11.service.impl;

import practise11.dao.TaskDao;
import practise11.model.entity.Task;
import practise11.service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    private TaskDao taskDao;

    public TaskServiceImpl(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    @Override
    public List<Task> getAllTask() {
        return taskDao.getAllTask();
    }

    @Override
    public boolean addTaskForEmployee(Task task) {
        if(task != null) return taskDao.addTaskForEmployee(task);
        return false;
    }

    @Override
    public List<Task> getAllTaskForEmployee(int employeeID) {
        if(employeeID > 0) {
            return taskDao.getAllTaskForEmployee(employeeID);
        }
        return null;
    }

    @Override
    public boolean removeEmployee(int employeeID) {
        if(employeeID > 0) {
            return taskDao.removeEmployee(employeeID);
        }
        return false;
    }
}
