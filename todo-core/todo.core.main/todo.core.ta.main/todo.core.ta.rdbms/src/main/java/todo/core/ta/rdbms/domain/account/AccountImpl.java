package todo.core.ta.rdbms.domain.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import todo.core.domain.account.Account;
import todo.core.ta.rdbms.domain.BaseDomainImpl;

@Entity(name = "AccountImpl")
@Table(name = "account")
public class AccountImpl extends BaseDomainImpl implements Account {

	private static final long serialVersionUID = 1L;

	@Column(name = "name", length = 100)
	private String name;

	@Column(name = "description", length = 1000)
	private String description;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AccountImpl [name=" + name + ", description=" + description + ", toString()=" + super.toString() + "]";
	}

}
