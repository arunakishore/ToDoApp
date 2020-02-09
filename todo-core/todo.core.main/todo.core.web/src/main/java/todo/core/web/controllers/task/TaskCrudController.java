package todo.core.web.controllers.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.core.domain.task.Task;
import todo.core.domain.task.TaskForm;
import todo.core.services.crud.AppCrudService;
import todo.core.services.crud.task.TaskCrudService;
import todo.core.web.controllers.AppBaseCrudController;

@RestController
@RequestMapping(path = "/api/services/core/crud/task")
public class TaskCrudController extends AppBaseCrudController<Task, TaskForm> {

	@Autowired
	private TaskCrudService taskCrudService;

	@Override
	protected AppCrudService<Task, TaskForm> getAppCrudService() {
		return this.taskCrudService;
	}

}
