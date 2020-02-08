package todo.core.domain.task;

import java.util.Date;

import todo.core.domain.BaseDomainForm;

public class ProjectForm extends BaseDomainForm implements Project {

	private String name;
	private String description;
	private Date startDate;
	private Date endDate;

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

}
