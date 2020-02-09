package todo.core.services.crud;

import java.util.List;

import todo.core.domain.BaseDomain;

public interface AppCrudService<T extends BaseDomain> {

	T create(T domain) throws Exception;

	T update(T domain) throws Exception;

	void deleteByPk(Long domainId) throws Exception;

	void deleteAll() throws Exception;

	T getDomainUsingPk(Long domainId) throws Exception;

	Iterable<T> getAll() throws Exception;

	default void batchCreate(List<T> domains) throws Exception {

	}
}
