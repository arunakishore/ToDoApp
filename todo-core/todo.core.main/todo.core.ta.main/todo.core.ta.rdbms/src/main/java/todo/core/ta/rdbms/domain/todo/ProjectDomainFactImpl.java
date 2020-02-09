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

		ProjectImpl projectImpl = new ProjectImpl();

		projectImpl.setPK(domainForm.getPK());
		projectImpl.setStatus(domainForm.getStatus());

		projectImpl.setName(domainForm.getName());
		projectImpl.setDescription(domainForm.getDescription());

		projectImpl.setStartDate(domainForm.getStartDate());
		projectImpl.setEndDate(domainForm.getEndDate());

		return projectImpl;
	}

}
