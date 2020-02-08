package todo.core.domain.task;

import todo.core.domain.BaseDomain;

public interface TaskDependency extends BaseDomain {

	Long getTaskPK();

	void setTaskPK(Long taskPK);

	Long getDependentPK();

	void setDependentPK(Long dependentPK);

	String getDependentType();

	void setDependentType(String dependentType);

}
