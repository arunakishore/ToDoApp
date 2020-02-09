package todo.core.ta.rdbms.dao.impl.account;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import todo.core.ta.rdbms.domain.account.AccountImpl;

@Repository
public interface AccountCrudRepositoryImpl extends CrudRepository<AccountImpl, Long> {

}