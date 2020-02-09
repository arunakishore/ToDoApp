package todo.core.dao.crud.task;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.task.Task;

public interface TaskCrudDao<T extends Task> extends AppCrudDao<T> {

	String BEAN_ID = "TaskCrudDao";

}
