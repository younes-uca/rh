package ma.sir.erh.service.impl.admin;

import ma.sir.erh.bean.core.Message;
import ma.sir.erh.bean.history.MessageHistory;
import ma.sir.erh.dao.criteria.core.MessageCriteria;
import ma.sir.erh.dao.criteria.history.MessageHistoryCriteria;
import ma.sir.erh.dao.facade.core.MessageDao;
import ma.sir.erh.dao.facade.history.MessageHistoryDao;
import ma.sir.erh.dao.specification.core.MessageSpecification;
import ma.sir.erh.service.facade.admin.MessageAdminService;
import ma.sir.erh.zynerator.service.AbstractServiceImpl;
import ma.sir.erh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class MessageAdminServiceImpl extends AbstractServiceImpl<Message,MessageHistory, MessageCriteria, MessageHistoryCriteria, MessageDao,
MessageHistoryDao> implements MessageAdminService {




    public void configure() {
        super.configure(Message.class,MessageHistory.class, MessageHistoryCriteria.class, MessageSpecification.class);
    }

    public MessageAdminServiceImpl(MessageDao dao, MessageHistoryDao historyDao) {
        super(dao, historyDao);
    }

}