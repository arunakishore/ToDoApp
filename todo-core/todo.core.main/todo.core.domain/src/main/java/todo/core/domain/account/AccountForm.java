package todo.core.domain.account;

import todo.core.domain.BaseDomainForm;

public class AccountForm extends BaseDomainForm implements Account {

	private String name;
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
		return "AccountForm [name=" + name + ", description=" + description + ", toString()=" + super.toString() + "]";
	}

}
