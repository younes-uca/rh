package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.CategorieEmployeHistoryCriteria;
import ma.sir.erh.bean.history.CategorieEmployeHistory;


public class CategorieEmployeHistorySpecification extends AbstractHistorySpecification<CategorieEmployeHistoryCriteria, CategorieEmployeHistory> {

    public CategorieEmployeHistorySpecification(CategorieEmployeHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeHistorySpecification(CategorieEmployeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
