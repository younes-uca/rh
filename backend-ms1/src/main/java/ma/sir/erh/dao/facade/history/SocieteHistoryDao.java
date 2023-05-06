package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.SocieteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SocieteHistoryDao extends AbstractHistoryRepository<SocieteHistory,Long> {

}
