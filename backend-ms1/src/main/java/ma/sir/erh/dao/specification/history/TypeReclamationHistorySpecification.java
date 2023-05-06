package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.TypeReclamationHistoryCriteria;
import ma.sir.erh.bean.history.TypeReclamationHistory;


public class TypeReclamationHistorySpecification extends AbstractHistorySpecification<TypeReclamationHistoryCriteria, TypeReclamationHistory> {

    public TypeReclamationHistorySpecification(TypeReclamationHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationHistorySpecification(TypeReclamationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
