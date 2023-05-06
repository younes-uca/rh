package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.SoldAnnuelCongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldAnnuelCongeHistoryDao extends AbstractHistoryRepository<SoldAnnuelCongeHistory,Long> {

}
