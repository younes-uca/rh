package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.VilleHistoryCriteria;
import ma.sir.erh.bean.history.VilleHistory;


public class VilleHistorySpecification extends AbstractHistorySpecification<VilleHistoryCriteria, VilleHistory> {

    public VilleHistorySpecification(VilleHistoryCriteria criteria) {
        super(criteria);
    }

    public VilleHistorySpecification(VilleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
