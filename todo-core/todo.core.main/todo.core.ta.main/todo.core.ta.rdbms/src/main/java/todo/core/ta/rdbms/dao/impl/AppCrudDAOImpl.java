package todo.core.ta.rdbms.dao.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.BaseDomain;

@NoRepositoryBean
public abstract class AppCrudDAOImpl<T extends BaseDomain, ID> implements AppCrudDao<T> {

	protected abstract CrudRepository<T, Long> getCrudRepository();

	@Override
	public T create(T domain) throws Exception {
		return getCrudRepository().save(domain);
	}

	@Override
	public T update(T domain) throws Exception {
		return getCrudRepository().save(domain);
	}

	@Override
	public void deleteUsingPk(Long domainId) throws Exception {
		getCrudRepository().deleteById(domainId);
	}

	@Override
	public void deleteAll() throws Exception {
		getCrudRepository().deleteAll();
	}

	@Override
	public T getDomainUsingPk(Long domainId) throws Exception {
		return getCrudRepository().findById(domainId).orElse(null);
	}

	@Override
	public Iterable<T> getAllDomains() throws Exception {
		return getCrudRepository().findAll();
	}

}