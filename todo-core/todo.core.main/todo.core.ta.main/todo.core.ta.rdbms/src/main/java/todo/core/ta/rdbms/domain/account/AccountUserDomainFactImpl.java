package todo.core.ta.rdbms.domain.account;

import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.domain.account.AccountForm;
import todo.core.domain.account.AccountUser;
import todo.core.domain.account.AccountUserDomainFact;
import todo.core.domain.account.AccountUserForm;

@Component(DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + AccountUser.DOMAIN_TYPE)
public class AccountUserDomainFactImpl implements AccountUserDomainFact<AccountUserImpl, AccountUserForm> {

	public AccountUserImpl createNewInstance() {
		return new AccountUserImpl();
	}

	public AccountUserImpl createAndPopulateUsingForm(AccountForm domainForm) {
		return new AccountUserImpl();
	}

	public AccountUserImpl populateUsingForm(AccountImpl domainForm) {
		return new AccountUserImpl();
	}

}
