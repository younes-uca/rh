package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.erh.bean.history.EmployeHistory;


public class EmployeHistorySpecification extends AbstractHistorySpecification<EmployeHistoryCriteria, EmployeHistory> {

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
