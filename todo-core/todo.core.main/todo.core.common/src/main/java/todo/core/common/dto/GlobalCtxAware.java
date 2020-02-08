package todo.core.common.dto;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(GlobalCtxAware.BEAN_ID)
public class GlobalCtxAware implements ApplicationContextAware {

	public static final String BEAN_ID = "globalCtxAware";

	private static ApplicationContext appCtx;

	public static Object lookupFacade(String facadeBeanId) throws Exception {
		return appCtx.getBean(facadeBeanId);
	}

	@Override
	public void setApplicationContext(ApplicationContext appCtxObj) throws BeansException {
		appCtx = appCtxObj;
	}

}
