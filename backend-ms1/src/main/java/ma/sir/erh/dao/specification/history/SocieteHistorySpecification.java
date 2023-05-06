package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.erh.bean.history.SocieteHistory;


public class SocieteHistorySpecification extends AbstractHistorySpecification<SocieteHistoryCriteria, SocieteHistory> {

    public SocieteHistorySpecification(SocieteHistoryCriteria criteria) {
        super(criteria);
    }

    public SocieteHistorySpecification(SocieteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
