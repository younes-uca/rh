package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.EtatDemandeCongeHistoryCriteria;
import ma.sir.erh.bean.history.EtatDemandeCongeHistory;


public class EtatDemandeCongeHistorySpecification extends AbstractHistorySpecification<EtatDemandeCongeHistoryCriteria, EtatDemandeCongeHistory> {

    public EtatDemandeCongeHistorySpecification(EtatDemandeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatDemandeCongeHistorySpecification(EtatDemandeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
