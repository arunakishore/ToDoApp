package todo.core.ta.rdbms.domain.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import todo.core.domain.account.User;
import todo.core.ta.rdbms.domain.BaseDomainImpl;

@Entity(name = "UserImpl")
@Table(name = "user")
public class UserImpl extends BaseDomainImpl implements User {

	private static final long serialVersionUID = 1L;

	@Column(name = "fname", length = 100)
	private String firstName;

	@Column(name = "lname", length = 100)
	private String lastName;

	@Column(name = "email", length = 100)
	private String email;

	@Column(name = "username", length = 100)
	private String userName;

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserImpl [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userName="
				+ userName + ", toString()=" + super.toString() + "]";
	}

}
