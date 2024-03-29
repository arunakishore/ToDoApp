package todo.core.services.crud.task;

import org.springframework.stereotype.Service;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.task.TaskCrudDao;
import todo.core.domain.DomainFactUtil;
import todo.core.domain.DomainFactory;
import todo.core.domain.task.Task;
import todo.core.domain.task.TaskForm;
import todo.core.services.crud.AppCrudServiceImpl;

@Service("TaskCrudServiceImpl")
public class TaskCrudServiceImpl extends AppCrudServiceImpl<Task, TaskForm> implements TaskCrudService {

	private String acctCrudDaoBeanId;

	public TaskCrudServiceImpl() {
		this.acctCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(Task.DOMAIN_TYPE);
	}

	@SuppressWarnings("unchecked")
	@Override
	public AppCrudDao<Task> getAppCrudDao() throws Exception {
		return GlobalCtxAware.appCtx.getBean(this.acctCrudDaoBeanId, TaskCrudDao.class);
	}

	@Override
	public DomainFactory<Task, TaskForm> getDomainFactory() {
		return DomainFactUtil.getTaskDomainFact();
	}

}
