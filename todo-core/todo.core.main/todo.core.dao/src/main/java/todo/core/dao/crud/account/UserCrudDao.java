package todo.core.dao.crud.account;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.account.User;

public interface UserCrudDao<T extends User> extends AppCrudDao<T> {

	String BEAN_ID = "UserCrudDao";

}
