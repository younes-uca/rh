package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.ReclamationHistoryCriteria;
import ma.sir.erh.bean.history.ReclamationHistory;


public class ReclamationHistorySpecification extends AbstractHistorySpecification<ReclamationHistoryCriteria, ReclamationHistory> {

    public ReclamationHistorySpecification(ReclamationHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationHistorySpecification(ReclamationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
