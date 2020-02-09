package todo.core.dao.crud.account;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.account.Account;

public interface AccountCrudDao<T extends Account> extends AppCrudDao<T> {

	String BEAN_ID = "AccountCrudDao";

}
