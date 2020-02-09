package todo.core.ta.rdbms.domain.todo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import todo.core.domain.task.Project;
import todo.core.ta.rdbms.domain.BaseDomainImpl;

@Entity(name = "ProjectImpl")
@Table(name = "project")
public class ProjectImpl extends BaseDomainImpl implements Project {

	private static final long serialVersionUID = 1L;

	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@Column(name = "description", length = 1000)
	private String description;

	@Column(name = "start_dt")
	private Date startDate;

	@Column(name = "end_dt")
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

	@Override
	public String toString() {
		return "ProjectImpl [name=" + name + ", description=" + description + ", startDate=" + startDate + ", endDate="
				+ endDate + ", toString()=" + super.toString() + "]";
	}

}