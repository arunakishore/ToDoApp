package todo.core.domain.account;

import todo.core.domain.BaseDomain;

public interface AccountUser extends BaseDomain {

	String DOMAIN_TYPE = "AccountUser";

	Long getAccountPK();

	void setAccountPK(Long accountPK);

	Long getUserPK();

	void setUserPK(Long userPK);

}
