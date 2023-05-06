package  ma.sir.erh.dao.specification.history;

import ma.sir.erh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.erh.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.erh.bean.history.NewsHistory;


public class NewsHistorySpecification extends AbstractHistorySpecification<NewsHistoryCriteria, NewsHistory> {

    public NewsHistorySpecification(NewsHistoryCriteria criteria) {
        super(criteria);
    }

    public NewsHistorySpecification(NewsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
