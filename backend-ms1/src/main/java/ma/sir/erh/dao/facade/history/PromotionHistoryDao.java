package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.PromotionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionHistoryDao extends AbstractHistoryRepository<PromotionHistory,Long> {

}