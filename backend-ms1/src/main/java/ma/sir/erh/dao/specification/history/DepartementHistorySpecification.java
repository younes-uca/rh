package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.erh.bean.history.DepartementHistory;


public class DepartementHistorySpecification extends AbstractHistorySpecification<DepartementHistoryCriteria, DepartementHistory> {

    public DepartementHistorySpecification(DepartementHistoryCriteria criteria) {
        super(criteria);
    }

    public DepartementHistorySpecification(DepartementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
