package todo.core.domain.account;

import todo.core.domain.BaseDomain;

public interface User extends BaseDomain {

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	String getEmail();

	void setEmail(String email);

	String getUserName();

	void setUserName(String userName);

}
