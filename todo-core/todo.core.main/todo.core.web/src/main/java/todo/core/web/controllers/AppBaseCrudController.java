package todo.core.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import todo.core.domain.BaseDomain;
import todo.core.domain.BaseDomainForm;
import todo.core.services.crud.AppCrudService;

public abstract class AppBaseCrudController<T extends BaseDomain, F extends BaseDomainForm> {

	protected abstract AppCrudService<T, F> getAppCrudService();

	@RequestMapping(path = "create")
	public ResponseEntity<T> create(F domainForm) throws Exception {

		T baseDomain = getAppCrudService().create(domainForm);

		return ResponseEntity.ok(baseDomain);
	}

	@RequestMapping(path = "update")
	public ResponseEntity<T> update(F domainForm) throws Exception {

		T baseDomain = getAppCrudService().update(domainForm);

		return ResponseEntity.ok(baseDomain);
	}

	@RequestMapping(path = "get")
	public ResponseEntity<T> getUsingDomainId(F domainForm) throws Exception {

		T baseDomain = getAppCrudService().getDomainUsingPk(domainForm);

		return ResponseEntity.ok(baseDomain);
	}

	@RequestMapping(path = "delete")
	public ResponseEntity<String> deleteUsingDomainId(F domainForm) throws Exception {

		getAppCrudService().deleteDomainUsingPk(domainForm);

		return ResponseEntity.ok("{\"result\", \"SUCCESS\"}");
	}

	@RequestMapping(path = "getall")
	public ResponseEntity<Iterable<T>> getAllDomains() throws Exception {

		Iterable<T> allDomains = getAppCrudService().getAll();

		return ResponseEntity.ok(allDomains);
	}
}
