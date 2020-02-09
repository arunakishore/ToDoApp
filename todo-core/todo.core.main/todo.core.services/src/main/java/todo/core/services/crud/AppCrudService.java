package todo.core.services.crud;

import todo.core.domain.BaseDomain;
import todo.core.domain.BaseDomainForm;

public interface AppCrudService<T extends BaseDomain, F extends BaseDomainForm> {

	T create(F domainForm) throws Exception;

	T update(F domainForm) throws Exception;

	void deleteDomainUsingPk(F domainForm) throws Exception;

	void deleteAll() throws Exception;

	T getDomainUsingPk(F domainForm) throws Exception;

	Iterable<T> getAll() throws Exception;

	default void batchCreate(F domainForm) throws Exception {

	}
}
