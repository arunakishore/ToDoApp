package todo.core.domain.task;

import todo.core.domain.BaseDomain;

public interface TaskDependency extends BaseDomain {

	String DOMAIN_TYPE = "TaskDependency";

	Long getTaskPK();

	void setTaskPK(Long taskPK);

	Long getDependentPK();

	void setDependentPK(Long dependentPK);

	String getDependentType();

	void setDependentType(String dependentType);

}
