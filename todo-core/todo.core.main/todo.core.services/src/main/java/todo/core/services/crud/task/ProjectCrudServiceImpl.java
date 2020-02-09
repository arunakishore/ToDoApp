package todo.core.services.crud.task;

import org.springframework.stereotype.Service;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.dao.crud.AppCrudDao;
import todo.core.dao.crud.task.ProjectCrudDao;
import todo.core.domain.task.Project;
import todo.core.services.crud.AppCrudServiceImpl;

@Service("ProjectCrudServiceImpl")
public class ProjectCrudServiceImpl extends AppCrudServiceImpl<Project> implements ProjectCrudService {

	private String acctCrudDaoBeanId;

	public ProjectCrudServiceImpl() {
		this.acctCrudDaoBeanId = GlobalCtxAware.buildAppCrudDaoLookupBeanId(Project.DOMAIN_TYPE);
	}

	@SuppressWarnings("unchecked")
	@Override
	public AppCrudDao<Project> getAppCrudDao() throws Exception {
		return GlobalCtxAware.appCtx.getBean(this.acctCrudDaoBeanId, ProjectCrudDao.class);
	}

}
