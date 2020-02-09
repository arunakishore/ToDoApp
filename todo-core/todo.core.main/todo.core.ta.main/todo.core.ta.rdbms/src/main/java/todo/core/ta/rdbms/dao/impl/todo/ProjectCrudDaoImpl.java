package todo.core.ta.rdbms.dao.impl.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.dao.crud.task.ProjectCrudDao;
import todo.core.ta.rdbms.dao.impl.AppCrudDAOImpl;
import todo.core.ta.rdbms.domain.todo.ProjectImpl;

@Component(ProjectCrudDaoImpl.BEAN_ID)
public class ProjectCrudDaoImpl extends AppCrudDAOImpl<ProjectImpl, Long> implements ProjectCrudDao<ProjectImpl> {

	public static final String BEAN_ID = DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR
			+ ProjectCrudDao.BEAN_ID;

	@Autowired
	private ProjectCrudRepositoryImpl repositoryImpl;

	@Override
	protected CrudRepository<ProjectImpl, Long> getCrudRepository() {
		return this.repositoryImpl;
	}

}