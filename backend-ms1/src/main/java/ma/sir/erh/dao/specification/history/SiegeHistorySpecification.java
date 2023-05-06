package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.SiegeHistoryCriteria;
import ma.sir.erh.bean.history.SiegeHistory;


public class SiegeHistorySpecification extends AbstractHistorySpecification<SiegeHistoryCriteria, SiegeHistory> {

    public SiegeHistorySpecification(SiegeHistoryCriteria criteria) {
        super(criteria);
    }

    public SiegeHistorySpecification(SiegeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
