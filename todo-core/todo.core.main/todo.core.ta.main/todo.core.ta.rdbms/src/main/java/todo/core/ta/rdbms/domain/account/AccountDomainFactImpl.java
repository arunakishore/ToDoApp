package todo.core.ta.rdbms.domain.account;

import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;
import todo.core.domain.account.Account;
import todo.core.domain.account.AccountDomainFact;
import todo.core.domain.account.AccountForm;

@Component(DBTypes.RDBMS + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + Account.DOMAIN_TYPE)
public class AccountDomainFactImpl implements AccountDomainFact<AccountImpl, AccountForm> {

	public AccountImpl createNewInstance() {
		return new AccountImpl();
	}

	public AccountImpl createAndPopulateUsingForm(AccountForm domainForm) {

		AccountImpl acctImpl = new AccountImpl();

		acctImpl.setPK(domainForm.getPK());
		acctImpl.setStatus(acctImpl.getStatus());

		acctImpl.setName(domainForm.getName());
		acctImpl.setDescription(domainForm.getDescription());

		return acctImpl;
	}

}
