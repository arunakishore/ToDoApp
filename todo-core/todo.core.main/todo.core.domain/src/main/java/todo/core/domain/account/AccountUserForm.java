package todo.core.domain.account;

import todo.core.domain.BaseDomainForm;

public class AccountUserForm extends BaseDomainForm implements AccountUser {

	private Long accountPK;
	private Long userPK;

	@Override
	public Long getAccountPK() {
		return this.accountPK;
	}

	@Override
	public void setAccountPK(Long accountPK) {
		this.accountPK = accountPK;
	}

	@Override
	public Long getUserPK() {
		return this.userPK;
	}

	@Override
	public void setUserPK(Long userPK) {
		this.userPK = userPK;
	}

	@Override
	public String toString() {
		return "AccountUserForm [accountPK=" + accountPK + ", userPK=" + userPK + ", toString()=" + super.toString()
				+ "]";
	}

}
