package todo.core.ta.rdbms.dao.impl.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import todo.core.ta.rdbms.domain.todo.ProjectImpl;

@Repository
public interface ProjectCrudRepositoryImpl extends CrudRepository<ProjectImpl, Long> {

}