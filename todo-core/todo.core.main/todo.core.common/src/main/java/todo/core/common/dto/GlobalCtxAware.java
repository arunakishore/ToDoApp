package todo.core.common.dto;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import todo.core.common.constants.DBTypes;

@Component(GlobalCtxAware.BEAN_ID)
public class GlobalCtxAware implements ApplicationContextAware {

	public static final String BEAN_ID = "globalCtxAware";

	public static ApplicationContext appCtx;
	private static org.springframework.core.env.Environment environment;

	// by default we assume RDBMS Technical Adapter
	public static String crudDAOImplDefaultDBType = DBTypes.RDBMS;

	public static Object lookupFacade(String facadeBeanId) throws Exception {

		return appCtx.getBean(facadeBeanId);
	}

	@Override
	public void setApplicationContext(ApplicationContext appCtxObj) throws BeansException {

		appCtx = appCtxObj;
		environment = appCtx.getEnvironment();
		crudDAOImplDefaultDBType = environment.getProperty("todo.crud.dao.impl.db.type", crudDAOImplDefaultDBType);
	}

	public static String buildAppCrudDaoLookupBeanId(String domainType) {
		return crudDAOImplDefaultDBType + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + domainType;
	}

	public static String buildAppDomainFactLookupBeanId(String domainType) {
		return crudDAOImplDefaultDBType + DBTypes.CRUD_DAO_IMPL_BEAN_ID_SEP_CHAR + domainType;
	}

}
