package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.CategorieEmployeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEmployeHistoryDao extends AbstractHistoryRepository<CategorieEmployeHistory,Long> {

}
