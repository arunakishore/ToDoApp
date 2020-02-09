package todo.core.ta.rdbms.dao.impl.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.dao.crud.task.TaskCrudDao;
import todo.core.ta.rdbms.dao.impl.AppCrudDAOImpl;
import todo.core.ta.rdbms.domain.todo.TaskImpl;

@Component(TaskCrudDaoImpl.BEAN_ID)
public class TaskCrudDaoImpl extends AppCrudDAOImpl<TaskImpl, Long> implements TaskCrudDao<TaskImpl> {

	public static final String BEAN_ID = DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + TaskCrudDao.BEAN_ID;

	@Autowired
	private TaskCrudRepositoryImpl repositoryImpl;

	@Override
	protected CrudRepository<TaskImpl, Long> getCrudRepository() {
		return this.repositoryImpl;
	}

}