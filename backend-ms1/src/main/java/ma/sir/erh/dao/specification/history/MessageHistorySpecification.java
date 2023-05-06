package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.MessageHistoryCriteria;
import ma.sir.erh.bean.history.MessageHistory;


public class MessageHistorySpecification extends AbstractHistorySpecification<MessageHistoryCriteria, MessageHistory> {

    public MessageHistorySpecification(MessageHistoryCriteria criteria) {
        super(criteria);
    }

    public MessageHistorySpecification(MessageHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
