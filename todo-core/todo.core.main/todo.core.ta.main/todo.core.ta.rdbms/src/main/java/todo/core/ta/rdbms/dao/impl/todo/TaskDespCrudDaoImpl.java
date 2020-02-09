package todo.core.ta.rdbms.dao.impl.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.dao.crud.task.TaskDepCrudDao;
import todo.core.ta.rdbms.dao.impl.AppCrudDAOImpl;
import todo.core.ta.rdbms.domain.todo.TaskDependencyImpl;

@Component(TaskDespCrudDaoImpl.BEAN_ID)
public class TaskDespCrudDaoImpl extends AppCrudDAOImpl<TaskDependencyImpl, Long>
		implements TaskDepCrudDao<TaskDependencyImpl> {

	public static final String BEAN_ID = DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + TaskDepCrudDao.BEAN_ID;

	@Autowired
	private TaskDepCrudRepositoryImpl repositoryImpl;

	@Override
	protected CrudRepository<TaskDependencyImpl, Long> getCrudRepository() {
		return this.repositoryImpl;
	}

}