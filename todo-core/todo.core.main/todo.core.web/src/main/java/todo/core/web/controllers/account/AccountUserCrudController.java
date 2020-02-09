package todo.core.web.controllers.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.core.domain.account.AccountUser;
import todo.core.domain.account.AccountUserForm;
import todo.core.services.crud.AppCrudService;
import todo.core.services.crud.account.AccountUserCrudService;
import todo.core.web.controllers.AppBaseCrudController;

@RestController
@RequestMapping(path = "/api/services/core/crud/account-user")
public class AccountUserCrudController extends AppBaseCrudController<AccountUser, AccountUserForm> {

	@Autowired
	private AccountUserCrudService acctUserCrudService;

	@Override
	protected AppCrudService<AccountUser, AccountUserForm> getAppCrudService() {
		return this.acctUserCrudService;
	}

}
