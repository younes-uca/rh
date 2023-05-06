package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.AssuranceHistoryCriteria;
import ma.sir.erh.bean.history.AssuranceHistory;


public class AssuranceHistorySpecification extends AbstractHistorySpecification<AssuranceHistoryCriteria, AssuranceHistory> {

    public AssuranceHistorySpecification(AssuranceHistoryCriteria criteria) {
        super(criteria);
    }

    public AssuranceHistorySpecification(AssuranceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
