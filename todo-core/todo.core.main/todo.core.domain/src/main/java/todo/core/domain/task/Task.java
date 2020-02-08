package todo.core.domain.task;

import java.util.Date;

import todo.core.domain.BaseDomain;

public interface Task extends BaseDomain {

	String DOMAIN_TYPE = "Task";

	String getName();

	void setName(String name);

	String getDescription();

	void setDescription(String description);

	Long getProjectPK();

	void setProjectPK(Long projectPK);

	Date getStartDate();

	void setStartDate(Date startDate);

	Date getEndDate();

	void setEndDate(Date endDate);

	Double getPlannedTotalTime();

	void setPlannedTotalTime(Double plannedTotalTime);

	Double getActualTotalTime();

	void setActualTotalTime(Double actualTotalTime);

}
