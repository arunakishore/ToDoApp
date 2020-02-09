package todo.core.ta.rdbms.dao.impl.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import todo.core.dao.crud.account.AccountCrudDao;
import todo.core.domain.account.Account;
import todo.core.ta.rdbms.dao.impl.AppCrudDAOImpl;

@Component(AccountCrudDaoImpl.BEAN_ID)
public class AccountCrudDaoImpl extends AppCrudDAOImpl<Account, Long> implements AccountCrudDao<Account> {

	public static final String BEAN_ID = "rdbms_" + AccountCrudDao.BEAN_ID;

	@Autowired
	private AccountCrudRepositoryImpl repositoryImpl;

	@Override
	protected CrudRepository<Account, Long> getCrudRepository() {
		return this.repositoryImpl;
	}

}