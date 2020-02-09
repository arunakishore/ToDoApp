package todo.core.services.crud.task;

import org.springframework.stereotype.Service;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.task.TaskDepCrudDao;
import todo.core.domain.DomainFactUtil;
import todo.core.domain.DomainFactory;
import todo.core.domain.task.TaskDependency;
import todo.core.domain.task.TaskDependencyForm;
import todo.core.services.crud.AppCrudServiceImpl;

@Service("TaskDepCrudServiceImpl")
public class TaskDepCrudServiceImpl extends AppCrudServiceImpl<TaskDependency, TaskDependencyForm>
		implements TaskDepCrudService {

	private String acctCrudDaoBeanId;

	public TaskDepCrudServiceImpl() {
		this.acctCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(TaskDependency.DOMAIN_TYPE);
	}

	@SuppressWarnings("unchecked")
	@Override
	public AppCrudDao<TaskDependency> getAppCrudDao() throws Exception {
		return GlobalCtxAware.appCtx.getBean(this.acctCrudDaoBeanId, TaskDepCrudDao.class);
	}

	@Override
	public DomainFactory<TaskDependency, TaskDependencyForm> getDomainFactory() {
		return DomainFactUtil.getTaskDependencyDomainFact();
	}

}
