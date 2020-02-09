package todo.core.web.controllers.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.core.domain.account.User;
import todo.core.domain.account.UserForm;
import todo.core.services.crud.AppCrudService;
import todo.core.services.crud.account.UserCrudService;
import todo.core.web.controllers.AppBaseCrudController;

@RestController
@RequestMapping(path = "/api/services/core/crud/user")
public class UserCrudController extends AppBaseCrudController<User, UserForm> {

	@Autowired
	private UserCrudService userCrudService;

	@Override
	protected AppCrudService<User, UserForm> getAppCrudService() {
		return this.userCrudService;
	}

}
