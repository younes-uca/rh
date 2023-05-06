package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.erh.bean.history.PromotionHistory;


public class PromotionHistorySpecification extends AbstractHistorySpecification<PromotionHistoryCriteria, PromotionHistory> {

    public PromotionHistorySpecification(PromotionHistoryCriteria criteria) {
        super(criteria);
    }

    public PromotionHistorySpecification(PromotionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
