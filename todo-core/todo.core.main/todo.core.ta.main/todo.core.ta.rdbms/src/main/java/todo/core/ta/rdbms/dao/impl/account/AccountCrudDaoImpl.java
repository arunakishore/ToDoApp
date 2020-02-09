package todo.core.ta.rdbms.dao.impl.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.dao.crud.account.AccountCrudDao;
import todo.core.ta.rdbms.dao.impl.AppCrudDAOImpl;
import todo.core.ta.rdbms.domain.account.AccountImpl;

@Component(AccountCrudDaoImpl.BEAN_ID)
public class AccountCrudDaoImpl extends AppCrudDAOImpl<AccountImpl, Long> implements AccountCrudDao<AccountImpl> {

	public static final String BEAN_ID = DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR
			+ AccountCrudDao.BEAN_ID;

	@Autowired
	private AccountCrudRepositoryImpl repositoryImpl;

	@Override
	protected CrudRepository<AccountImpl, Long> getCrudRepository() {
		return this.repositoryImpl;
	}

}