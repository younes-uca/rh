package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.SoldAnnuelCongeHistoryCriteria;
import ma.sir.erh.bean.history.SoldAnnuelCongeHistory;


public class SoldAnnuelCongeHistorySpecification extends AbstractHistorySpecification<SoldAnnuelCongeHistoryCriteria, SoldAnnuelCongeHistory> {

    public SoldAnnuelCongeHistorySpecification(SoldAnnuelCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public SoldAnnuelCongeHistorySpecification(SoldAnnuelCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
