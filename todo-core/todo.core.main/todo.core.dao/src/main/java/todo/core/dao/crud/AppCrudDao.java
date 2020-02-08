package todo.core.dao.crud;

import java.util.List;

import todo.core.domain.BaseDomain;

public interface AppCrudDao<T extends BaseDomain> {

	T create(T domain) throws Exception;

	T update(T domain) throws Exception;

	void deleteByPk(Long domainId) throws Exception;

	void deleteAll() throws Exception;

	T findByPk(Long domainId) throws Exception;

	List<T> getAll() throws Exception;

	default void batchCreate(List<T> domains) throws Exception {

	}

}
