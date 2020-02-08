package todo.core.services.crud.account;

import org.springframework.stereotype.Service;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.account.AccountCrudDao;
import todo.core.domain.account.Account;
import todo.core.services.crud.AppCrudServiceImpl;

@Service("AccountCrudServiceImpl")
public class AccountCrudServiceImpl extends AppCrudServiceImpl<Account> {

	private String acctCrudDaoBeanId;

	public AccountCrudServiceImpl() {

		this.acctCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(Account.DOMAIN_TYPE);
	}

	@Override
	public AppCrudDao<Account> getAppCrudDao() throws Exception {

		return GlobalCtxAware.appCtx.getBean(this.acctCrudDaoBeanId, AccountCrudDao.class);
	}

}
