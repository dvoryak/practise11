package practise11.controller.command;

import practise11.model.entity.Task;
import practise11.service.TaskService;
import practise11.util.ConsoleHelper;
import practise11.view.View;
import practise11.view.constant.Constant;

import java.util.List;

public class ShowTasksByEmployeeCommand implements Command {

    private TaskService taskService;

    public ShowTasksByEmployeeCommand(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void execute(View view) {
        view.showMessage(Constant.InputConstant.EMPLOYEE_ID);
        int id = ConsoleHelper.readInt();
        view.showMessage("Tasks : ");
        List<Task> allTask = taskService.getAllTaskForEmployee(id);
        if(allTask.size() == 0) {
            view.showMessage(Constant.InputConstant.EMPTY_LIST);
        }
        allTask.forEach(task -> view.showMessage(task.toString()));
        view.showMessage("");
    }
}
