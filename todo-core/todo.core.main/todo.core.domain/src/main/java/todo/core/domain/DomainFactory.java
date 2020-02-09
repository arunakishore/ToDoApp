package todo.core.domain;

public interface DomainFactory<T extends BaseDomain, F extends BaseDomainForm> {

	default T createNewInstance() {
		return null;
	}

	default T createAndPopulateUsingForm(F domainForm) {
		return null;
	}

	default T populateUsingFormForUpdate(F domainForm, T domainObj) {
		return null;
	}

}
