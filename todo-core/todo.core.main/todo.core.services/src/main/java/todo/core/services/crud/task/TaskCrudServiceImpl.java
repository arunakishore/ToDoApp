package todo.core.services.crud.task;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.task.TaskCrudDao;
import todo.core.domain.task.Task;
import todo.core.services.crud.AppCrudServiceImpl;

public class TaskCrudServiceImpl extends AppCrudServiceImpl<Task> {

	private String acctCrudDaoBeanId;

	public TaskCrudServiceImpl() {
		this.acctCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(Task.DOMAIN_TYPE);
	}

	@Override
	public AppCrudDao<Task> getAppCrudDao() throws Exception {
		return GlobalCtxAware.appCtx.getBean(this.acctCrudDaoBeanId, TaskCrudDao.class);
	}

}
