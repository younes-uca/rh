package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.SiegeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SiegeHistoryDao extends AbstractHistoryRepository<SiegeHistory,Long> {

}
