package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.SexeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SexeHistoryDao extends AbstractHistoryRepository<SexeHistory,Long> {

}
