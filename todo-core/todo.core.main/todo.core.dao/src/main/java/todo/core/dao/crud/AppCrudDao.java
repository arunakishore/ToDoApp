package todo.core.dao.crud;

import java.util.List;

import todo.core.domain.BaseDomain;

public interface AppCrudDao<T extends BaseDomain> {

	T create(T domain) throws Exception;

	T update(T domain) throws Exception;

	void deleteUsingPk(Long domainId) throws Exception;

	void deleteAll() throws Exception;

	T getDomainUsingPk(Long domainId) throws Exception;

	Iterable<T> getAllDomains() throws Exception;

	default void createBatch(List<T> domains) throws Exception {

	}

}
