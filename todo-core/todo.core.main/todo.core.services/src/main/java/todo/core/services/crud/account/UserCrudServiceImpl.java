package todo.core.services.crud.account;

import org.springframework.stereotype.Service;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.account.UserCrudDao;
import todo.core.domain.DomainFactUtil;
import todo.core.domain.DomainFactory;
import todo.core.domain.account.User;
import todo.core.domain.account.UserForm;
import todo.core.services.crud.AppCrudServiceImpl;

@Service("UserCrudServiceImpl")
public class UserCrudServiceImpl extends AppCrudServiceImpl<User, UserForm> implements UserCrudService {

	private String userCrudDaoBeanId;

	public UserCrudServiceImpl() {
		this.userCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(User.DOMAIN_TYPE);
	}

	@SuppressWarnings("unchecked")
	@Override
	public AppCrudDao<User> getAppCrudDao() throws Exception {
		return GlobalCtxAware.appCtx.getBean(this.userCrudDaoBeanId, UserCrudDao.class);
	}

	@Override
	public DomainFactory<User, UserForm> getDomainFactory() {
		return DomainFactUtil.getUserDomainFact();
	}

}
