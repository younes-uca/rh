package ma.sir.erh.dao.facade.history;

import ma.sir.erh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.erh.bean.history.MessageHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageHistoryDao extends AbstractHistoryRepository<MessageHistory,Long> {

}
