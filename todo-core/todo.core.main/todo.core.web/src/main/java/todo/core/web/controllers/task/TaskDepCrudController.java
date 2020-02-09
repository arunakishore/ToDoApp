package todo.core.web.controllers.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.core.domain.task.TaskDependency;
import todo.core.domain.task.TaskDependencyForm;
import todo.core.services.crud.AppCrudService;
import todo.core.services.crud.task.TaskDepCrudService;
import todo.core.web.controllers.AppBaseCrudController;

@RestController
@RequestMapping(path = "/api/services/core/crud/task-dep")
public class TaskDepCrudController extends AppBaseCrudController<TaskDependency, TaskDependencyForm> {

	@Autowired
	private TaskDepCrudService taskDepCrudService;

	@Override
	protected AppCrudService<TaskDependency, TaskDependencyForm> getAppCrudService() {
		return this.taskDepCrudService;
	}

}
