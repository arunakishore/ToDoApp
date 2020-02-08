package todo.core.domain.task;

import java.util.Date;

import todo.core.domain.BaseDomainForm;

public class TaskForm extends BaseDomainForm implements Task {

	private String name;
	private String description;
	private Long projectPK;
	private Date startDate;
	private Date endDate;
	private Double plannedTotalTime;
	private Double actualTotalTime;

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
	public Long getProjectPK() {
		return this.projectPK;
	}

	@Override
	public void setProjectPK(Long projectPK) {
		this.projectPK = projectPK;
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
		return this.plannedTotalTime;
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

	@Override
	public String toString() {
		return "TaskForm [name=" + name + ", description=" + description + ", projectPK=" + projectPK + ", startDate="
				+ startDate + ", endDate=" + endDate + ", plannedTotalTime=" + plannedTotalTime + ", actualTotalTime="
				+ actualTotalTime + ", toString()=" + super.toString() + "]";
	}

}
