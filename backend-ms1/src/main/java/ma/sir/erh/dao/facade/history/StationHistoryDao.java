package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.StationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StationHistoryDao extends AbstractHistoryRepository<StationHistory,Long> {

}
