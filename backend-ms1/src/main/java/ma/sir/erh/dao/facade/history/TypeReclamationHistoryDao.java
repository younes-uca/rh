package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.TypeReclamationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReclamationHistoryDao extends AbstractHistoryRepository<TypeReclamationHistory,Long> {

}
