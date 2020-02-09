package todo.core.web.controllers.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.core.domain.account.Account;
import todo.core.domain.account.AccountForm;
import todo.core.services.crud.AppCrudService;
import todo.core.services.crud.account.AccountCrudService;
import todo.core.web.controllers.AppBaseCrudController;

@RestController
@RequestMapping(path = "/api/services/core/crud/account")
public class AccountCrudController extends AppBaseCrudController<Account, AccountForm> {

	@Autowired
	private AccountCrudService acctCrudService;

	@Override
	protected AppCrudService<Account, AccountForm> getAppCrudService() {
		return this.acctCrudService;
	}

}
