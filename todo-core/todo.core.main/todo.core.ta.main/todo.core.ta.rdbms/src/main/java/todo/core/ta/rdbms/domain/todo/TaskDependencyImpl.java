package todo.core.ta.rdbms.domain.todo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import todo.core.domain.task.TaskDependency;
import todo.core.ta.rdbms.domain.BaseDomainImpl;

@Entity(name = "TaskDependencyImpl")
@Table(name = "task_dependency")
public class TaskDependencyImpl extends BaseDomainImpl implements TaskDependency {

	private static final long serialVersionUID = 1L;

	@Column(name = "task_pk", nullable = false)
	private Long taskPK;

	@Column(name = "dependent_pk", nullable = false)
	private Long dependentPK;

	@Column(name = "dependent_type", nullable = false)
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
		return "TaskDependencyImpl [taskPK=" + taskPK + ", dependentPK=" + dependentPK + ", dependentType="
				+ dependentType + ", toString()=" + super.toString() + "]";
	}

}