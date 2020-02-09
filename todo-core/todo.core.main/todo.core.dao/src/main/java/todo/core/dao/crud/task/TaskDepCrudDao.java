package todo.core.dao.crud.task;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.task.TaskDependency;

public interface TaskDepCrudDao<T extends TaskDependency> extends AppCrudDao<T> {

	String BEAN_ID = "TaskDepCrudDao";

}
