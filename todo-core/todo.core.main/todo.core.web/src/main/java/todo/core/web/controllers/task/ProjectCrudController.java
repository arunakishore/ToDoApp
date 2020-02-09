package todo.core.web.controllers.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.core.domain.task.Project;
import todo.core.domain.task.ProjectForm;
import todo.core.services.crud.AppCrudService;
import todo.core.services.crud.task.ProjectCrudService;
import todo.core.web.controllers.AppBaseCrudController;

@RestController
@RequestMapping(path = "/api/services/core/crud/project")
public class ProjectCrudController extends AppBaseCrudController<Project, ProjectForm> {

	@Autowired
	private ProjectCrudService projCrudService;

	@Override
	protected AppCrudService<Project, ProjectForm> getAppCrudService() {
		return this.projCrudService;
	}

}
