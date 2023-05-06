package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.EtatReclamationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatReclamationHistoryDao extends AbstractHistoryRepository<EtatReclamationHistory,Long> {

}
