package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.EducationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationHistoryDao extends AbstractHistoryRepository<EducationHistory,Long> {

}
