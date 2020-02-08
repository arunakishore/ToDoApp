package todo.core.services.crud.account;

import org.springframework.stereotype.Service;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.account.AccountUserCrudDao;
import todo.core.domain.account.AccountUser;
import todo.core.services.crud.AppCrudServiceImpl;

@Service("UserCrudServiceImpl")
public class AccountUserCrudServiceImpl extends AppCrudServiceImpl<AccountUser> implements AccountUserCrudService {

	private String userCrudDaoBeanId;

	public AccountUserCrudServiceImpl() {
		this.userCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(AccountUser.DOMAIN_TYPE);
	}

	@Override
	public AppCrudDao<AccountUser> getAppCrudDao() throws Exception {
		return GlobalCtxAware.appCtx.getBean(this.userCrudDaoBeanId, AccountUserCrudDao.class);
	}

}
