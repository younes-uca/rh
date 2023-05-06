package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.CompagnieAssuranceHistoryCriteria;
import ma.sir.erh.bean.history.CompagnieAssuranceHistory;


public class CompagnieAssuranceHistorySpecification extends AbstractHistorySpecification<CompagnieAssuranceHistoryCriteria, CompagnieAssuranceHistory> {

    public CompagnieAssuranceHistorySpecification(CompagnieAssuranceHistoryCriteria criteria) {
        super(criteria);
    }

    public CompagnieAssuranceHistorySpecification(CompagnieAssuranceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
