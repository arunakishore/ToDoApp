package todo.core.ta.rdbms.domain.todo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import todo.core.domain.task.Task;
import todo.core.ta.rdbms.domain.BaseDomainImpl;

@Entity(name = "TaskImpl")
@Table(name = "task")
public class TaskImpl extends BaseDomainImpl implements Task {

	private static final long serialVersionUID = 1L;

	@Column(name = "project_pk")
	private Long projectPK;

	@Column(name = "user_pk", nullable = false)
	private Long userPK;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "start_dt")
	private Date startDate;

	@Column(name = "end_dt")
	private Date endDate;

	@Column(name = "planned_total_time")
	private Double plannedTotalTime;

	@Column(name = "actual_total_time")
	private Double actualTotalTime;

	@Override
	public Long getProjectPK() {
		return this.projectPK;
	}

	@Override
	public void setProjectPK(Long projectPK) {
		this.projectPK = projectPK;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Date getStartDate() {
		return this.startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public Date getEndDate() {
		return this.endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public Double getPlannedTotalTime() {
		return null;
	}

	@Override
	public void setPlannedTotalTime(Double plannedTotalTime) {
		this.plannedTotalTime = plannedTotalTime;
	}

	@Override
	public Double getActualTotalTime() {
		return this.actualTotalTime;
	}

	@Override
	public void setActualTotalTime(Double actualTotalTime) {
		this.actualTotalTime = actualTotalTime;
	}

	public Long getUserPK() {
		return userPK;
	}

	public void setUserPK(Long userPK) {
		this.userPK = userPK;
	}

	@Override
	public String toString() {
		return "TaskImpl [projectPK=" + projectPK + ", userPK=" + userPK + ", name=" + name + ", description="
				+ description + ", startDate=" + startDate + ", endDate=" + endDate + ", plannedTotalTime="
				+ plannedTotalTime + ", actualTotalTime=" + actualTotalTime + ", toString()=" + super.toString() + "]";
	}

}