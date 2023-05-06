package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.DemandeCongeHistoryCriteria;
import ma.sir.erh.bean.history.DemandeCongeHistory;


public class DemandeCongeHistorySpecification extends AbstractHistorySpecification<DemandeCongeHistoryCriteria, DemandeCongeHistory> {

    public DemandeCongeHistorySpecification(DemandeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public DemandeCongeHistorySpecification(DemandeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
