package todo.core.ta.rdbms.domain.account;

import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.domain.account.AccountUser;
import todo.core.domain.account.AccountUserDomainFact;
import todo.core.domain.account.AccountUserForm;

@Component(DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + AccountUser.DOMAIN_TYPE)
public class AccountUserDomainFactImpl implements AccountUserDomainFact<AccountUserImpl, AccountUserForm> {

	public AccountUserImpl createNewInstance() {
		return new AccountUserImpl();
	}

	public AccountUserImpl createAndPopulateUsingForm(AccountUserForm domainForm) {

		AccountUserImpl acctUserImpl = new AccountUserImpl();

		acctUserImpl.setPK(domainForm.getPK());
		acctUserImpl.setStatus(domainForm.getStatus());

		acctUserImpl.setAccountPK(domainForm.getAccountPK());
		acctUserImpl.setUserPK(domainForm.getUserPK());

		return acctUserImpl;
	}

}
