package todo.core.domain.task;

import todo.core.domain.BaseDomainForm;

public class TaskDependencyForm extends BaseDomainForm implements TaskDependency {

	private Long taskPK;
	private Long dependentPK;
	private String dependentType;

	@Override
	public Long getTaskPK() {
		return this.taskPK;
	}

	@Override
	public void setTaskPK(Long taskPK) {
		this.taskPK = taskPK;
	}

	@Override
	public Long getDependentPK() {
		return this.dependentPK;
	}

	@Override
	public void setDependentPK(Long dependentPK) {
		this.dependentPK = dependentPK;
	}

	@Override
	public String getDependentType() {
		return this.dependentType;
	}

	@Override
	public void setDependentType(String dependentType) {
		this.dependentType = dependentType;
	}

	@Override
	public String toString() {
		return "TaskDependencyForm [taskPK=" + taskPK + ", dependentPK=" + dependentPK + ", dependentType="
				+ dependentType + ", toString()=" + super.toString() + "]";
	}

}
