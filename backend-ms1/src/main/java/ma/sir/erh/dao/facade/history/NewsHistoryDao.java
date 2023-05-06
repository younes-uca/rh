package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.NewsHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsHistoryDao extends AbstractHistoryRepository<NewsHistory,Long> {

}
