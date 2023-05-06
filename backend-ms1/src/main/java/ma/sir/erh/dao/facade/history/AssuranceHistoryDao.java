package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.AssuranceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceHistoryDao extends AbstractHistoryRepository<AssuranceHistory,Long> {

}
