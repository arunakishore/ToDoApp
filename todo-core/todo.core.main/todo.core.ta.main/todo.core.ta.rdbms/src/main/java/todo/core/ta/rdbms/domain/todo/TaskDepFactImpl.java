package todo.core.ta.rdbms.domain.todo;

import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.domain.task.TaskDepDomainFact;
import todo.core.domain.task.TaskDependency;
import todo.core.domain.task.TaskDependencyForm;

@Component(DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + TaskDependency.DOMAIN_TYPE)
public class TaskDepFactImpl implements TaskDepDomainFact<TaskDependencyImpl, TaskDependencyForm> {

	public TaskDependencyImpl createNewInstance() {
		return new TaskDependencyImpl();
	}

	public TaskDependencyImpl createAndPopulateUsingForm(TaskDependencyForm domainForm) {
		return new TaskDependencyImpl();
	}

	public TaskDependencyImpl populateUsingForm(TaskDependencyForm domainForm) {
		return new TaskDependencyImpl();
	}

}
