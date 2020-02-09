package todo.core.ta.rdbms.domain.todo;

import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.domain.task.Project;
import todo.core.domain.task.ProjectDomainFact;
import todo.core.domain.task.ProjectForm;

@Component(DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + Project.DOMAIN_TYPE)
public class ProjectDomainFactImpl implements ProjectDomainFact<ProjectImpl, ProjectForm> {

	public ProjectImpl createNewInstance() {
		return new ProjectImpl();
	}

	public ProjectImpl createAndPopulateUsingForm(ProjectForm domainForm) {
		return new ProjectImpl();
	}

	public ProjectImpl populateUsingForm(ProjectForm domainForm) {
		return new ProjectImpl();
	}

}
