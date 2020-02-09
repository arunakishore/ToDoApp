package todo.core.ta.rdbms.dao.impl.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.dao.crud.account.UserCrudDao;
import todo.core.ta.rdbms.dao.impl.AppCrudDAOImpl;
import todo.core.ta.rdbms.domain.account.UserImpl;

@Component(UserCrudDaoImpl.BEAN_ID)
public class UserCrudDaoImpl extends AppCrudDAOImpl<UserImpl, Long> implements UserCrudDao<UserImpl> {

	public static final String BEAN_ID = DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + UserCrudDao.BEAN_ID;

	@Autowired
	private UserCrudRepositoryImpl repositoryImpl;

	@Override
	protected CrudRepository<UserImpl, Long> getCrudRepository() {
		return this.repositoryImpl;
	}

}