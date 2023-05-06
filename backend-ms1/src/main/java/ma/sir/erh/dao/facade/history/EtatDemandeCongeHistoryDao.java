package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.EtatDemandeCongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatDemandeCongeHistoryDao extends AbstractHistoryRepository<EtatDemandeCongeHistory,Long> {

}
