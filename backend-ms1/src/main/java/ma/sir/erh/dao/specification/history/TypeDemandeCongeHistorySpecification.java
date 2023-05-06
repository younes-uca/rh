package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.TypeDemandeCongeHistoryCriteria;
import ma.sir.erh.bean.history.TypeDemandeCongeHistory;


public class TypeDemandeCongeHistorySpecification extends AbstractHistorySpecification<TypeDemandeCongeHistoryCriteria, TypeDemandeCongeHistory> {

    public TypeDemandeCongeHistorySpecification(TypeDemandeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeDemandeCongeHistorySpecification(TypeDemandeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
