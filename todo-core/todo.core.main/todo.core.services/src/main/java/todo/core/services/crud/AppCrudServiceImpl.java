package todo.core.services.crud;

import todo.core.dao.crud.AppCrudDao;
import todo.core.domain.BaseDomain;
import todo.core.domain.BaseDomainForm;
import todo.core.domain.DomainFactory;

public abstract class AppCrudServiceImpl<T extends BaseDomain, F extends BaseDomainForm>
		implements AppCrudService<T, F> {

	public abstract AppCrudDao<T> getAppCrudDao() throws Exception;

	public abstract DomainFactory<T, F> getDomainFactory();

	@Override
	public T create(F domainForm) throws Exception {

		T domain = getDomainFactory().createAndPopulateUsingForm(domainForm);
		return this.getAppCrudDao().create(domain);
	}

	@Override
	public T update(F domainForm) throws Exception {
		T domain = getDomainFactory().createAndPopulateUsingForm(domainForm);
		return this.getAppCrudDao().update(domain);
	}

	@Override
	public void deleteDomainUsingPk(F domainForm) throws Exception {
		this.getAppCrudDao().deleteUsingPk(domainForm.getDomainId());
	}

	@Override
	public void deleteAll() throws Exception {
		this.getAppCrudDao().deleteAll();
	}

	@Override
	public T getDomainUsingPk(F domainForm) throws Exception {
		return this.getAppCrudDao().getDomainUsingPk(domainForm.getDomainId());
	}

	@Override
	public Iterable<T> getAll() throws Exception {
		return this.getAppCrudDao().getAllDomains();
	}

}
