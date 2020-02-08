package todo.core.domain.task;

import java.util.Date;

import todo.core.domain.BaseDomain;

public interface Project extends BaseDomain {

	String DOMAIN_TYPE = "Project";

	String getName();

	void setName(String name);

	String getDescription();

	void setDescription(String description);

	Date getStartDate();

	void setStartDate(Date startDate);

	Date getEndDate();

	void setEndDate(Date endDate);

}
