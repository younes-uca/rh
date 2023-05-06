package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.VilleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleHistoryDao extends AbstractHistoryRepository<VilleHistory,Long> {

}
