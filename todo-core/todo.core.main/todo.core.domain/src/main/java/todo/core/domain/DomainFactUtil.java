package todo.core.domain;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import todo.core.common.dto.GlobalCtxAware;
import todo.core.domain.account.Account;
import todo.core.domain.account.AccountDomainFact;
import todo.core.domain.account.AccountForm;
import todo.core.domain.account.AccountUser;
import todo.core.domain.account.AccountUserDomainFact;
import todo.core.domain.account.AccountUserForm;
import todo.core.domain.account.User;
import todo.core.domain.account.UserDomainFact;
import todo.core.domain.account.UserForm;
import todo.core.domain.task.Project;
import todo.core.domain.task.ProjectDomainFact;
import todo.core.domain.task.ProjectForm;
import todo.core.domain.task.Task;
import todo.core.domain.task.TaskDepDomainFact;
import todo.core.domain.task.TaskDependency;
import todo.core.domain.task.TaskDependencyForm;
import todo.core.domain.task.TaskDomainFact;
import todo.core.domain.task.TaskForm;

@Component("DomainFactUtil")
public class DomainFactUtil {

	private static String acctDomainFactBeanId = null;
	private static String acctUserDomainFactBeanId = null;
	private static String userDomainFactBeanId = null;
	private static String projectDomainFactBeanId = null;
	private static String taskDomainFactBeanId = null;
	private static String taskDepDomainFactBeanId = null;

	@SuppressWarnings("rawtypes")
	private static Map<String, DomainFactory> domainFactories = new HashMap<>();;

	@SuppressWarnings({ "rawtypes" })
	private static final DomainFactory getDomainFactByType(String domainFactBeanId) {

		if (!domainFactories.containsKey(domainFactBeanId)) {
			domainFactBeanId = GlobalCtxAware.buildAppDomainFactLookupBeanId(Account.DOMAIN_TYPE);

			DomainFactory domainFact = (DomainFactory) GlobalCtxAware.appCtx.getBean(domainFactBeanId);
			domainFactories.put(domainFactBeanId, domainFact);

			return domainFact;
		}

		return domainFactories.get(domainFactBeanId);
	}

	@SuppressWarnings("unchecked")
	public static final AccountDomainFact<Account, AccountForm> getAccontDomainFact() {

		if (acctDomainFactBeanId == null) {
			acctDomainFactBeanId = GlobalCtxAware.buildAppDomainFactLookupBeanId(Account.DOMAIN_TYPE);
		}

		return (AccountDomainFact<Account, AccountForm>) getDomainFactByType(acctDomainFactBeanId);
	}

	@SuppressWarnings("unchecked")
	public static final AccountUserDomainFact<AccountUser, AccountUserForm> getAccontUserDomainFact() {

		if (acctUserDomainFactBeanId == null) {
			acctUserDomainFactBeanId = GlobalCtxAware.buildAppDomainFactLookupBeanId(AccountUser.DOMAIN_TYPE);
		}

		return (AccountUserDomainFact<AccountUser, AccountUserForm>) getDomainFactByType(acctDomainFactBeanId);
	}

	@SuppressWarnings("unchecked")
	public static final UserDomainFact<User, UserForm> getUserDomainFact() {

		if (userDomainFactBeanId == null) {
			userDomainFactBeanId = GlobalCtxAware.buildAppDomainFactLookupBeanId(User.DOMAIN_TYPE);
		}

		return (UserDomainFact<User, UserForm>) getDomainFactByType(acctDomainFactBeanId);
	}

	@SuppressWarnings("unchecked")
	public static final ProjectDomainFact<Project, ProjectForm> getProjectDomainFact() {

		if (projectDomainFactBeanId == null) {
			projectDomainFactBeanId = GlobalCtxAware.buildAppDomainFactLookupBeanId(Project.DOMAIN_TYPE);
		}

		return (ProjectDomainFact<Project, ProjectForm>) getDomainFactByType(acctDomainFactBeanId);
	}

	@SuppressWarnings("unchecked")
	public static final TaskDomainFact<Task, TaskForm> getTaskDomainFact() {

		if (taskDomainFactBeanId == null) {
			taskDomainFactBeanId = GlobalCtxAware.buildAppDomainFactLookupBeanId(Task.DOMAIN_TYPE);
		}

		return (TaskDomainFact<Task, TaskForm>) getDomainFactByType(acctDomainFactBeanId);
	}

	@SuppressWarnings("unchecked")
	public static final TaskDepDomainFact<TaskDependency, TaskDependencyForm> getTaskDependencyDomainFact() {

		if (taskDepDomainFactBeanId == null) {
			taskDepDomainFactBeanId = GlobalCtxAware.buildAppDomainFactLookupBeanId(TaskDependency.DOMAIN_TYPE);
		}

		return (TaskDepDomainFact<TaskDependency, TaskDependencyForm>) getDomainFactByType(acctDomainFactBeanId);
	}
}
