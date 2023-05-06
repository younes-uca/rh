package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.TypeDemandeCongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDemandeCongeHistoryDao extends AbstractHistoryRepository<TypeDemandeCongeHistory,Long> {

}
