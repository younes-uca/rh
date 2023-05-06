package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.StationHistoryCriteria;
import ma.sir.erh.bean.history.StationHistory;


public class StationHistorySpecification extends AbstractHistorySpecification<StationHistoryCriteria, StationHistory> {

    public StationHistorySpecification(StationHistoryCriteria criteria) {
        super(criteria);
    }

    public StationHistorySpecification(StationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
