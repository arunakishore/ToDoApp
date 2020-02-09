package todo.core.dao.crud.task;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.task.Project;

public interface ProjectCrudDao<T extends Project> extends AppCrudDao<T> {

	String BEAN_ID = "ProjectCrudDao";

}
