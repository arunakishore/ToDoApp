package todo.core.services.crud;

import java.util.List;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.BaseDomain;

public abstract class AppCrudServiceImpl<T extends BaseDomain> implements AppCrudService<T> {

	public abstract AppCrudDao<T> getAppCrudDao() throws Exception;

	@Override
	public T create(T domain) throws Exception {
		return this.getAppCrudDao().create(domain);
	}

	@Override
	public T update(T domain) throws Exception {
		return this.getAppCrudDao().update(domain);
	}

	@Override
	public void deleteByPk(Long domainId) throws Exception {
		this.getAppCrudDao().deleteByPk(domainId);
	}

	@Override
	public void deleteAll() throws Exception {
		this.getAppCrudDao().deleteAll();
	}

	@Override
	public T findByPk(Long domainId) throws Exception {
		return this.getAppCrudDao().findByPk(domainId);
	}

	@Override
	public List<T> getAll() throws Exception {
		return this.getAppCrudDao().getAll();
	}

}
