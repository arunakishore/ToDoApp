package todo.core.ta.rdbms.dao.impl.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import todo.core.ta.rdbms.domain.todo.TaskDependencyImpl;

@Repository
public interface TaskDepCrudRepositoryImpl extends CrudRepository<TaskDependencyImpl, Long> {

}