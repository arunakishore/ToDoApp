package todo.core.domain.task;

import todo.core.domain.DomainFactory;

public interface TaskDepDomainFact<T extends TaskDependency, F extends TaskDependencyForm> extends DomainFactory<T, F> {

}
