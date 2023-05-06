package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.SexeHistoryCriteria;
import ma.sir.erh.bean.history.SexeHistory;


public class SexeHistorySpecification extends AbstractHistorySpecification<SexeHistoryCriteria, SexeHistory> {

    public SexeHistorySpecification(SexeHistoryCriteria criteria) {
        super(criteria);
    }

    public SexeHistorySpecification(SexeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
