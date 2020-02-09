package todo.core.domain.task;

import todo.core.domain.DomainFactory;

public interface TaskDomainFact<T extends Task, F extends TaskForm> extends DomainFactory<T, F> {

}
