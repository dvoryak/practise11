package practise11.controller.command;

import practise11.model.entity.Task;
import practise11.service.TaskService;
import practise11.util.ConsoleHelper;
import practise11.view.View;

import static practise11.view.constant.Constant.*;

public class AddTaskCommand implements Command {

    private TaskService taskService;

    public AddTaskCommand(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void execute(View view) {
        Task task = new Task();
        view.showMessage(InputConstant.TASK_TEXT);
        task.setTextTask(ConsoleHelper.readString());
        view.showMessage(InputConstant.EMPLOYEE_ID);
        task.setEmployeeID(ConsoleHelper.readInt());
        taskService.addTaskForEmployee(task);
        view.showMessage("");
    }
}
