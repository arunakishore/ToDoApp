package todo.core.services.crud.task;

import org.springframework.stereotype.Service;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.task.TaskDepCrudDao;
import todo.core.domain.task.TaskDependency;
import todo.core.services.crud.AppCrudServiceImpl;

@Service("TaskDepCrudServiceImpl")
public class TaskDepCrudServiceImpl extends AppCrudServiceImpl<TaskDependency> implements TaskDepCrudService {

	private String acctCrudDaoBeanId;

	public TaskDepCrudServiceImpl() {
		this.acctCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(TaskDependency.DOMAIN_TYPE);
	}

	@Override
	public AppCrudDao<TaskDependency> getAppCrudDao() throws Exception {
		return GlobalCtxAware.appCtx.getBean(this.acctCrudDaoBeanId, TaskDepCrudDao.class);
	}

}
