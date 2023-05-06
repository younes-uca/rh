package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.LienParenteHistoryCriteria;
import ma.sir.erh.bean.history.LienParenteHistory;


public class LienParenteHistorySpecification extends AbstractHistorySpecification<LienParenteHistoryCriteria, LienParenteHistory> {

    public LienParenteHistorySpecification(LienParenteHistoryCriteria criteria) {
        super(criteria);
    }

    public LienParenteHistorySpecification(LienParenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
