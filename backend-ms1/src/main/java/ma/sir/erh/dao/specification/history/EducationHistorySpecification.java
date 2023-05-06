package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.EducationHistoryCriteria;
import ma.sir.erh.bean.history.EducationHistory;


public class EducationHistorySpecification extends AbstractHistorySpecification<EducationHistoryCriteria, EducationHistory> {

    public EducationHistorySpecification(EducationHistoryCriteria criteria) {
        super(criteria);
    }

    public EducationHistorySpecification(EducationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
