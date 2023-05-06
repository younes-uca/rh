package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.EtatReclamationHistoryCriteria;
import ma.sir.erh.bean.history.EtatReclamationHistory;


public class EtatReclamationHistorySpecification extends AbstractHistorySpecification<EtatReclamationHistoryCriteria, EtatReclamationHistory> {

    public EtatReclamationHistorySpecification(EtatReclamationHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatReclamationHistorySpecification(EtatReclamationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
