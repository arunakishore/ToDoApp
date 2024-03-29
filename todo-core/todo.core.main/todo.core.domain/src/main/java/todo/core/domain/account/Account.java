package todo.core.domain.account;

import todo.core.domain.BaseDomain;

public interface Account extends BaseDomain {
	
	String DOMAIN_TYPE = "Account";
			
	String getName();

	void setName(String name);

	String getDescription();

	void setDescription(String description);

}
