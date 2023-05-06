package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.DepartementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementHistoryDao extends AbstractHistoryRepository<DepartementHistory,Long> {

}
