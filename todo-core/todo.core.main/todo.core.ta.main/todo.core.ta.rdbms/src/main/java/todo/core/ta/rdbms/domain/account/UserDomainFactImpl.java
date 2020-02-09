package todo.core.ta.rdbms.domain.account;

import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.domain.account.User;
import todo.core.domain.account.UserDomainFact;
import todo.core.domain.account.UserForm;

@Component(DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + User.DOMAIN_TYPE)
public class UserDomainFactImpl implements UserDomainFact<UserImpl, UserForm> {

	public UserImpl createNewInstance() {
		return new UserImpl();
	}

	public UserImpl createAndPopulateUsingForm(UserForm domainForm) {
		return new UserImpl();
	}

	public UserImpl populateUsingForm(UserForm domainForm) {
		return new UserImpl();
	}

}
