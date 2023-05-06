package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.CompagnieAssuranceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CompagnieAssuranceHistoryDao extends AbstractHistoryRepository<CompagnieAssuranceHistory,Long> {

}
