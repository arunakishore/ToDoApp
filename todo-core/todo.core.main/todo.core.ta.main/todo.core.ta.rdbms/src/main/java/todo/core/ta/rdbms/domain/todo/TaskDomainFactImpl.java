package todo.core.ta.rdbms.domain.todo;

import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.domain.task.Task;
import todo.core.domain.task.TaskDomainFact;
import todo.core.domain.task.TaskForm;

@Component(DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + Task.DOMAIN_TYPE)
public class TaskDomainFactImpl implements TaskDomainFact<TaskImpl, TaskForm> {

	public TaskImpl createNewInstance() {
		return new TaskImpl();
	}

	public TaskImpl createAndPopulateUsingForm(TaskForm domainForm) {

		TaskImpl taskImpl = new TaskImpl();

		taskImpl.setPK(domainForm.getPK());
		taskImpl.setUserPK(domainForm.getUserPK());

		taskImpl.setName(domainForm.getName());
		taskImpl.setDescription(domainForm.getDescription());

		return taskImpl;
	}

}
