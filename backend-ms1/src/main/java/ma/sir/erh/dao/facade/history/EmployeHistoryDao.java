package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.EmployeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeHistoryDao extends AbstractHistoryRepository<EmployeHistory,Long> {

}
