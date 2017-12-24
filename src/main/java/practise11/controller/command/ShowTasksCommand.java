package practise11.controller.command;

import practise11.dao.TaskDao;
import practise11.model.entity.Task;
import practise11.service.TaskService;
import practise11.view.View;
import practise11.view.constant.Constant;

import java.util.List;

public class ShowTasksCommand implements Command {

    private TaskService taskService;

    public ShowTasksCommand(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void execute(View view) {
        view.showMessage("Tasks : ");
        List<Task> allTask = taskService.getAllTask();
        if(allTask.size() == 0) {
            view.showMessage(Constant.InputConstant.EMPTY_LIST);
        }
        allTask.forEach(task -> view.showMessage(task.toString()));
        view.showMessage("");
    }
}
