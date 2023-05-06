package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.ReclamationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationHistoryDao extends AbstractHistoryRepository<ReclamationHistory,Long> {

}
