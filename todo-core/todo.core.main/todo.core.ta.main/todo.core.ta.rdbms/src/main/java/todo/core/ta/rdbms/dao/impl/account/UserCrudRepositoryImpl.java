package todo.core.ta.rdbms.dao.impl.account;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import todo.core.ta.rdbms.domain.account.UserImpl;

@Repository
public interface UserCrudRepositoryImpl extends CrudRepository<UserImpl, Long> {

}