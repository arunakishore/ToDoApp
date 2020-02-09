package todo.core.ta.rdbms.domain.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import todo.core.domain.account.AccountUser;
import todo.core.ta.rdbms.domain.BaseDomainImpl;

@Entity(name = "AccountUserImpl")
@Table(name = "account_user")
public class AccountUserImpl extends BaseDomainImpl implements AccountUser {

	private static final long serialVersionUID = 1L;

	@Column(name = "account_pk", nullable = false)
	private Long accountPK;

	@Column(name = "user_pk", nullable = false)
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

}
