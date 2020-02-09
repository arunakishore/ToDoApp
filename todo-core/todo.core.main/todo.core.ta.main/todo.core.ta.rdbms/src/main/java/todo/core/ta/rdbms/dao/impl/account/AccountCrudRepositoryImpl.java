package todo.core.ta.rdbms.dao.impl.account;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import todo.core.domain.account.Account;

@Repository
public interface AccountCrudRepositoryImpl extends CrudRepository<Account, Long> {

}